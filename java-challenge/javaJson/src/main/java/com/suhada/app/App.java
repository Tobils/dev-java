package com.suhada.app;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.HashSet;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( final String[] args ) throws IOException, ParseException
    {
        
        Set<String> data_email_app = new HashSet<String>();
        JSONParser parse = new JSONParser();
        Reader reader = new FileReader("./data-mail/data_email_valid_company_appdev_indonesia.json");
        JSONObject obj1 = (JSONObject)parse.parse(reader);
        JSONArray list_mail = (JSONArray)obj1.get("email_valid");

        for(int cnt=0; cnt < list_mail.size(); cnt++)
        {
            JSONObject obj = (JSONObject)list_mail.get(cnt);
            String email = obj.get("email").toString();
            data_email_app.add(email);
        }

        System.out.println("jumlah email valid : " + data_email_app.size());
        int count = 1;
        final JSONArray array_mail = new JSONArray();
        for(String valid_mail : data_email_app)
        {
            System.out.println(valid_mail);
            final JSONObject email_array = new JSONObject();
            email_array.put("id", Integer.toString(count));
            email_array.put("email", valid_mail);
            email_array.put("is_valid", true);
            array_mail.add(email_array);

            final JSONObject valid_mails = new JSONObject();
            valid_mails.put("email_valid", array_mail);

            final FileWriter jsonfile = new FileWriter("data_email_valid_company_appdev_indonesia.json");
            jsonfile.write(valid_mails.toString());
            jsonfile.flush();

            count++;
        }

    }
}
