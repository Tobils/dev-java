package com.suhada.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import java.io.*;
import java.util.*; 
import javax.naming.*; 
import javax.naming.directory.*;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class mailValidatorNonAPI
{
    List<String> fileList = new ArrayList<String>();
    List<String> list_email_valid = new ArrayList<String>();
    List<String> list_email_invalid = new ArrayList<String>();

    final String path = "./mail_filtered/";
    private String email_valid = "email_valid";
    private String email_invalid = "email_invalid";

    public void run() throws IOException
    {
        final File file = new File("/Users/dev-tobil/Documents/dev-java/dev-java/java-challenge/javaJson/mail_address/");
        final File[] files = file.listFiles();

        try {
            int count = 1;
            int count_valid = 1;
            int count_invalid = 1;
            for(final File f : files) // read .csv file on directory
            {
                if(f.getName().contains("csv"))
                {
                    final String namafile = "./mail_address/"+f.getName();
                    final FileReader csvFile = new FileReader(namafile);
                    final BufferedReader csvReader = new BufferedReader(csvFile);
                    System.out.println("finish read " + namafile);

                    String row;
                    while((row=csvReader.readLine()) != null) // read data on each file
                    {
                        String[] data = row.split("\n");
                        if(isAddressValid(data[0]))
                        {
                            System.out.println("valid "+count_valid);
                            list_email_valid.add(data[0]);
                            count_valid++;
                        } else 
                        {
                            System.out.println("invalid "+count_invalid);
                            list_email_invalid.add(data[0]);
                            count_invalid++;
                        }
                    }
                    count++;

                    /**
                     * write to json file
                     */
                    writeToJSON(count, f.getName(), list_email_valid, email_valid);
                    writeToJSON(count, f.getName(), list_email_invalid, email_invalid);

                    System.out.println("finish validate " + count + " file !");

                }
            }
        } catch(Exception e)
        {
            System.out.println(e.toString());
        }

        System.out.println("finish validate all email !");
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
  
    private static void say( final BufferedWriter wr, final String text ) throws IOException 
    {
        wr.write( text + "\r\n" );
        wr.flush();
        return;
    }
  
    private static ArrayList getMX( final String hostName) throws NamingException 
    {
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
        
    public static boolean isAddressValid( final String address ) {
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
     * method untuk write file
     * @param count_file jumlah file
     * @param file_name nama file
     * @param list_mail alamat email
     * @param status valid/invalid
     */
     public void writeToJSON(final int count_file, final String file_name, final List<String> list_mail, final String status)
     { 
        JSONArray array_mail = new JSONArray();
        int count = 1;
        for(final String em : list_mail)
        {
            JSONObject email = new JSONObject();
            email.put("id", Integer.toString(count));
            email.put("email", em);
            array_mail.add(email);
            count++;
        }

        JSONObject valid_mail = new JSONObject();
        valid_mail.put(status, array_mail);

        try {
            FileWriter jsonfile = new FileWriter(path+status+"/"+Integer.toString(count_file)+"_"+file_name +".json");
            jsonfile.write(valid_mail.toJSONString());
            jsonfile.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
     }


    /**
     * write to csv file
     * @throws IOException
     */
    public void writeToCSV(final String filename, final List<String> listmail) throws IOException
    {
        final FileWriter csvWriter = new FileWriter(filename);
        for(final String email : listmail)
        {
            csvWriter.append(email);
            csvWriter.append("\n");
        }
        csvWriter.flush();
        csvWriter.close();
    }


}