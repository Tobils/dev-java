package com.suhada.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * urutan :
 * baca email
 * concat jadi 1 file
 * validasi
 * pisahkan dan simpan pada list
 */

// "https://gamalogic.com/emailvrf/?emailid=johnmiller@gmail.com&apikey=ffa68994ebe34ba19b5497594a0fcf8d"

public class mailChecker
{
    List<String> fileList = new ArrayList<String>();
    List<String> emailList = new ArrayList<String>();
    private boolean validate_status;
    private String endp_email = "https://gamalogic.com/emailvrf/?emailid=";
    private String endp_apikey = "&apikey=";
    private String url;
    private final String email;
    private final String api_key;

    public mailChecker(final String email, final String api_key)
    {
        this.email = email;
        this.api_key = api_key;
        setup();
    }

    public void setup()
    {
        endp_email = endp_email + email;
        endp_apikey = endp_apikey + api_key;
    }
    
   public void run() throws IOException
   {
        // validasi(email) --> return true untuk email valid dan false untuk email yg tidak valid
        concate_all();

        /**
         * read file then validate each file
         * total alamat email yg harus di validasi : 5110 * 9999 : 51.094.890 email.
         */

   }




   /**
    * 
    * @param email alamat email
    * @return return boolean status, if true save file, if not skip
    * @throws IOException
    * @throws MalformedURLException
    */
   public boolean validasi(final String email) throws IOException, MalformedURLException
   {
        url = endp_email + email +endp_apikey;
        final URLConnection conn = new URL(url).openConnection();
        conn.setRequestProperty("Accept", "application/json");
        final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), Charset.forName("UTF-8")));
        final String jsonText = rd.lines().collect(Collectors.joining("\n"));;
        try {
            final JSONParser parse = new JSONParser();

             /**
             * obj : {"gamalogic_emailid_vrfy":[{"do_you_mean":false,"is_role":false,"is_unknown":false,"is_valid":true,"is_syntax_valid":true,"emailid":"suhada@widyawicara.com","is_catchall":false,"message":"Valid ID","resolved_time":0.8651,"is_disposable":false}]}
             */
            final JSONObject obj =(JSONObject) parse.parse(jsonText);
            System.out.println(obj);

            /**
             * obj2 : [{"do_you_mean":false,"is_role":false,"is_unknown":false,"is_valid":true,"is_syntax_valid":true,"emailid":"suhada@widyawicara.com","is_catchall":false,"message":"Valid ID","resolved_time":0.8651,"is_disposable":false}]
             */
            final JSONArray obj2 = (JSONArray)obj.get("gamalogic_emailid_vrfy");
            System.out.println(obj2.get(0));

            /**
             * obj3 : {"do_you_mean":false,"is_role":false,"is_unknown":false,"is_valid":true,"is_syntax_valid":true,"emailid":"suhada@widyawicara.com","is_catchall":false,"message":"Valid ID","resolved_time":0.8651,"is_disposable":false}
             */
            final JSONObject obj3 = (JSONObject)obj2.get(0);

            /**
             * get is_valid element
             */
            final String is_valid = obj3.get("is_valid").toString();
            validate_status = Boolean.parseBoolean(is_valid);

        } catch (final Exception e) {
            //TODO: handle exception
        }
        
       return validate_status;
   }


   public void concate_all() throws IOException
   {
       /**
        * read all csv file
        */
        final File file = new File("/Users/dev-tobil/Documents/dev-java/dev-java/java-challenge/mailChecker/mailinglist/");
        final File[] files = file.listFiles();
        try {
            for(final File f : files)
            {
                if(f.getName().contains("csv"))
                {
                    final String namafile = "./mailinglist/"+f.getName();
                    fileList.add(namafile);
                }
            }

            /**
            * concat all mail 
            */
            int count = 0;
            final String filename = "./mail_address/all_mail_address.csv";
            for(final String file_name : fileList)
            {
                final BufferedReader csvReader = new BufferedReader(new FileReader(file_name));
                String row;
                while((row=csvReader.readLine()) != null)
                {
                    count++;
                    final String[] mail = row.split("\n");
                    emailList.add(mail[0]);                    
                    writeToCSV(filename, emailList);
                    System.out.println(count);

                }
            }
            System.out.println("finish write " + Integer.toString(count)+" email");
            
        } catch (final Exception e) {
            System.out.println(e.getMessage());
        }
   }
   
   j

}