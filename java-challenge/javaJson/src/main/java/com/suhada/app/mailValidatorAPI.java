package com.suhada.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
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
import org.json.simple.parser.ParseException;

public class mailValidatorAPI
{
    final static String api_key ="c8b16931745b465abf025d3e5a253ef1";
    List<String> list_email_valid = new ArrayList<String>();
    List<String> list_email_invalid = new ArrayList<String>();
    private static String endp_email = "https://gamalogic.com/emailvrf/?emailid=";
    private static String endp_apikey = "&apikey=";
    private static String url_api ;
    private static boolean validate_status;

    private final static String email_valid = "email_valid";
    private final String email_invalid = "email_invalid";

    public static void main(final String[] args) throws IOException, ParseException {

        /**
         * read json file
         */
        final JSONParser parse = new JSONParser();
        final Reader reader = new FileReader("./data-mail/indonesia/data_email_company_appdev_indonesia.json");
        final JSONObject obj1 = (JSONObject)parse.parse(reader);
        final JSONArray list_mail = (JSONArray)obj1.get("alamat_email");
        String email =  "";
        boolean valid_return;
        final JSONArray array_mail = new JSONArray();
        int count = 1;
        final String file_name = "data_email_valid_company_appdev_indonesia.json";

        for(int i=0; i< list_mail.size(); i++)
        {
            try {
                final JSONObject obj2 = (JSONObject)list_mail.get(i);
                email = obj2.get("email").toString();
                email = email.replace(System.getProperty("line.separator"), "").toLowerCase();
                valid_return = isEmailValid(email);
                if(valid_return)
                {
                    System.out.println(email + " is "+valid_return);
                    /**
                     * write to json
                    */
                    final JSONObject email_array = new JSONObject();
                    email_array.put("id", Integer.toString(count));
                    email_array.put("email", email);
                    email_array.put("is_valid", valid_return);
                    array_mail.add(email_array);
                    count++;

                    /**
                     * write to json file
                     */
                    final JSONObject valid_mail = new JSONObject();
                    valid_mail.put(email_valid, array_mail);

                    final FileWriter jsonfile = new FileWriter(file_name);
                    jsonfile.write(valid_mail.toJSONString());
                    jsonfile.flush();
                }

            } catch (final Exception e) {
                System.out.println("email ke : "+ i +" " + email +" is "+e.getMessage());
            }
        }

      

    }

    public static boolean isEmailValid(final String mail) throws MalformedURLException, IOException
    {
        url_api = endp_email + mail + endp_apikey + api_key;
        final URLConnection conn = new URL(url_api).openConnection();
        conn.setRequestProperty("Accept", "application/json");
        final InputStreamReader isr = new InputStreamReader(conn.getInputStream(), Charset.forName("utf-8"));
        final BufferedReader rd = new BufferedReader(isr);
        final String jsonText = rd.lines().collect(Collectors.joining("\n"));
        
        try {
            final JSONParser parse = new JSONParser();
            final JSONObject obj1 = (JSONObject)parse.parse(jsonText);
            final JSONArray obj2 = (JSONArray)obj1.get("gamalogic_emailid_vrfy");
            final JSONObject obj3 = (JSONObject)obj2.get(0);
            final String is_valid = obj3.get("is_valid").toString();
            System.out.println(obj3.get("emailid").toString()+" is "+is_valid);
            validate_status =  Boolean.parseBoolean(is_valid);

        } catch (final Exception e) {
            System.out.println(e.getMessage());
        }
		return validate_status;
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