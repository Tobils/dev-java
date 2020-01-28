package com.suhada.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class csvToJSON
{
   
    public static void main(final String[] args) throws IOException
    {
        List<String> list_email = new ArrayList<String>();
        final String nama_file_csv = "./data-mail/indonesia/data_email_company_softwaredev_indonesia.csv";
        final String nama_file_json = "./data-mail/indonesia/data_email_company_softwaredev_indonesia.json";
        csvToJSON ctj = new csvToJSON();
        list_email = ctj.csvReader(nama_file_csv);
        ctj.writeToJSON(nama_file_json, list_email);

        return;
    }

     /**
     * read csv file
     * @throws IOException
     */
    public List<String> csvReader(final String nama_file) throws IOException
    {
        List<String> list_email = new ArrayList<String>();
        System.out.println("getting started read csv file");
        final FileReader csvFile = new FileReader(nama_file);
        final BufferedReader csvReader = new BufferedReader(csvFile);
        String row;
        while((row=csvReader.readLine()) != null)
        {
            final String[] data = row.split("\n");
            list_email.add(data[0]);
        }
        System.out.println("finish read .csv file");
        return list_email;
    }


    /**
     * write to JSON file
     */
    public void writeToJSON(final String nama_file, List<String> list_email)
     { 

        for(String e :list_email)
        {
            System.out.println(e);
        }

        final JSONArray array_mail = new JSONArray();
        int count = 1;
        for(final String em : list_email)
        {
            final JSONObject email = new JSONObject();
            email.put("id", Integer.toString(count));
            email.put("email", em);
            array_mail.add(email);
            count++;
        }

        final JSONObject valid_mail = new JSONObject();
        valid_mail.put("alamat_email", array_mail);

        try {
            final FileWriter jsonfile = new FileWriter(nama_file);
            jsonfile.write(valid_mail.toJSONString());
            jsonfile.flush();

        } catch (final IOException e) {
            e.printStackTrace();
        }
        return;
     }

}