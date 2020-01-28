package com.suhada.app;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * modify code from https://chillyfacts.com/check-an-email-exist-using-java-java-email-verification-and-validation/
 */
public class validateJsonMail {
    public static void main( final String args[] ) throws IOException, ParseException
    {
        final List<String> list_email = new ArrayList<String>();

        /**
         * read json file
         */
        JSONParser parse = new JSONParser();
        Reader reader = new FileReader("./data-mail/indonesia/data_email_company_appdev_indonesia.json");
        JSONObject obj1 = (JSONObject)parse.parse(reader);
        JSONArray list_mail = (JSONArray)obj1.get("alamat_email");
        String email =  "";
        boolean valid_return;
        
        for(int i=0; i< list_mail.size(); i++)
        {
            try {
                JSONObject obj2 = (JSONObject)list_mail.get(i);
                email = obj2.get("email").toString();
                email = email.replace(System.getProperty("line.separator"), "").toLowerCase();
                valid_return = isAddressValid(email);
                if(valid_return)
                {
                     list_email.add(email);
                }
                System.out.println( email+ " is valid? " + valid_return);

            } catch (Exception e) {
                System.out.println("email ke : "+ i +" " + email +" is "+e.getMessage());
            }
        }

        /**
         * write to json file
         */
        String file_name = "data_email_valid_company_appdev_indonesia.json";
        writeToJSON("file_name", list_email);

      return;
   }
         
    private static int hear( final BufferedReader in ) throws IOException {
      String line = null;
      int res = 0;
      while ( (line = in.readLine()) != null ) {
          final String pfx = line.substring( 0, 3 );
          try {
             res = Integer.parseInt( pfx );
          } 
          catch (final Exception ex) {
             res = -1;
          }
          if ( line.charAt( 3 ) != '-' ) break;
      }
      return res;
      }

    private static void say( final BufferedWriter wr, final String text ) 
       throws IOException {
      wr.write( text + "\r\n" );
      wr.flush();
      return;
      }

    private static ArrayList getMX( final String hostName )
          throws NamingException {
      // Perform a DNS lookup for MX records in the domain
      final Hashtable env = new Hashtable();
      env.put("java.naming.factory.initial",
              "com.sun.jndi.dns.DnsContextFactory");
      final DirContext ictx = new InitialDirContext( env );
      Attributes attrs = ictx.getAttributes
                            ( hostName, new String[] { "MX" });
      Attribute attr = attrs.get( "MX" );
      // if we don't have an MX record, try the machine itself
      if (( attr == null ) || ( attr.size() == 0 )) {
        attrs = ictx.getAttributes( hostName, new String[] { "A" });
        attr = attrs.get( "A" );
        if( attr == null ) 
             throw new NamingException
                      ( "No match for name '" + hostName + "'" );
      }
      // Huzzah! we have machines to try. Return them as an array list
      // NOTE: We SHOULD take the preference into account to be absolutely
      //   correct. This is left as an exercise for anyone who cares.
      final ArrayList res = new ArrayList();
      final NamingEnumeration en = attr.getAll();
      while ( en.hasMore() ) {
         final String x = (String) en.next();
         final String f[] = x.split( " " );
         if ( f[1].endsWith( "." ) ) 
             f[1] = f[1].substring( 0, (f[1].length() - 1));
         res.add( f[1] );
      }
      return res;
      }
      
    public static boolean isAddressValid(String address ) {
      // Find the separator for the domain name
      int pos = address.indexOf( '@' );
      // If the address does not contain an '@', it's not valid
      if ( pos == -1 ) return false;
      // Isolate the domain/machine name and get a list of mail exchangers
      final String domain = address.substring( ++pos );
      ArrayList mxList = null;
      try {
         mxList = getMX( domain );
      } 
      catch (final NamingException ex) {
         return false;
      }
      // Just because we can send mail to the domain, doesn't mean that the
      // address is valid, but if we can't, it's a sure sign that it isn't
      if ( mxList.size() == 0 ) return false;
      // Now, do the SMTP validation, try each mail exchanger until we get
      // a positive acceptance. It *MAY* be possible for one MX to allow
      // a message [store and forwarder for example] and another [like
      // the actual mail server] to reject it. This is why we REALLY ought
      // to take the preference into account.
      for ( int mx = 0 ; mx < mxList.size() ; mx++ ) {
          boolean valid = false;
          try {
              int res;
              final Socket skt = new Socket( (String) mxList.get( mx ), 25 );
              final BufferedReader rdr = new BufferedReader
                 ( new InputStreamReader( skt.getInputStream() ) );
              final BufferedWriter wtr = new BufferedWriter
                 ( new OutputStreamWriter( skt.getOutputStream() ) );
              res = hear( rdr );
              if ( res != 220 ) throw new Exception( "Invalid header" );
              say( wtr, "EHLO orbaker.com" );
              res = hear( rdr );
              if ( res != 250 ) throw new Exception( "Not ESMTP" );
              // validate the sender address  
              say( wtr, "MAIL FROM: <tim@orbaker.com>" );
              res = hear( rdr );
              if ( res != 250 ) throw new Exception( "Sender rejected" );
              say( wtr, "RCPT TO: <" + address + ">" );
              res = hear( rdr );
              // be polite
              say( wtr, "RSET" ); hear( rdr );
              say( wtr, "QUIT" ); hear( rdr );
              if ( res != 250 ) 
                 throw new Exception( "Address is not valid!" );
              valid = true;
              rdr.close();
              wtr.close();
              skt.close();
          } 
          catch (final Exception ex) {
            // Do nothing but try next host
          } 
          finally {
            if ( valid ) return true;
          }
      }
      return false;
      }

      /**
     * method untuk write JSON file
     * @param count_file jumlah file
     * @param file_name nama file
     * @param list_mail alamat email
     * @param status valid/invalid
     */
     public static void writeToJSON(final String file_name, final List<String> list_mail)
     { 
        final JSONArray array_mail = new JSONArray();
        int count = 1;
        for(final String em : list_mail)
        {
            final JSONObject email = new JSONObject();
            email.put("id", Integer.toString(count));
            email.put("email", em);
            array_mail.add(email);
            count++;
        }

        final JSONObject valid_mail = new JSONObject();
        valid_mail.put("email_valid", array_mail);

        try {
            final FileWriter jsonfile = new FileWriter(file_name);
            jsonfile.write(valid_mail.toJSONString());
            jsonfile.flush();

        } catch (final IOException e) {
            e.printStackTrace();
        }
     }

}