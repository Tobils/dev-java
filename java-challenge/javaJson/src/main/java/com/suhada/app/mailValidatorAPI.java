package com.suhada.app;

import java.io.BufferedReader;
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

public class mailValidatorAPI
{
    private String api_key;
    List<String> list_email_valid = new ArrayList<String>();
    List<String> list_email_invalid = new ArrayList<String>();
    private String endp_email = "https://gamalogic.com/emailvrf/?emailid=";
    private String endp_apikey = "&apikey=";
    private String url_api ;
    private String file;
    private boolean validate_status;

    private String email_valid = "email_valid";
    private String email_invalid = "email_invalid";

    public mailValidatorAPI(String api_key, String file)
    {
        this.api_key = api_key; 
        this.file = file;
    }

    public void run() throws IOException
    {
        final FileReader csvFile = new FileReader(file);
        final BufferedReader csvReader = new BufferedReader(csvFile);
        String row;

        while((row=csvReader.readLine()) != null)
        {
            String[] data = row.split("\n");
            if(isEmailValid(data[0]))
            {
                list_email_valid.add(data[0]);
            } else 
            {
                list_email_invalid.add(data[0]);
            }
        }

        /**
         * write file to csv and json
         */
        writeToJSON(email_valid, list_email_valid);
        writeToJSON(email_invalid, list_email_invalid);

        System.out.println("finish validate email !");
    }

    public boolean isEmailValid(String mail) throws MalformedURLException, IOException
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

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
		return validate_status;
    }

    

    /**
     * write to json file
     */
     public void writeToJSON(final String file_name, final List<String> list_mail)
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
        valid_mail.put("valid_mail", array_mail);

        try {
            FileWriter jsonfile = new FileWriter(file_name +".json");
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