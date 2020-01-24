/**
 * divide mail to 400 each.
 * read all file *.csv as filelists
 * read each csv file
 */

 package com.suhada.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class mailDivide
 {
     private final List<String> listfile = new LinkedList<String>();
     
     

     public mailDivide()
     {
         System.out.println("let's divide !");
         list_file();
         
         try {
			data_dividing();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
   
     /**
      * read all csv file
      */
     public void list_file()
     {
        final File file = new File("/Users/dev-tobil/Documents/dev-java/dev-java/java-challenge/scrapping/gmail/data-mail/");
        final File[] files = file.listFiles();
        try {
            for(final File f : files)
            {
                if(f.getName().contains("csv"))
                {
                    String namafile = "./data-mail/"+f.getName();
                    listfile.add(namafile);
                }
            }
        } catch (final Exception e) {
            System.out.println(e.getMessage());
        }
     }


    /**
     * let's get started dividing data
     * @throws FileNotFoundException
    */
    public void data_dividing() throws FileNotFoundException, IOException
    {
        try
        {
            for(final String file : listfile)
            {
                System.out.println(file);
                final BufferedReader csvReader = new BufferedReader(new FileReader(file));
                String row;
                int count = 0;
                int max = 400;
                int div = 1;
                String filename = "";
                String dir_path = "./mailinglist/";
                final List<String> listdata = new ArrayList<String>();

                while((row=csvReader.readLine()) != null)
                {
                    String[] data = row.split("\n");
                    listdata.add(data[0]);

                    if(count == max)
                    {
                        filename = dir_path +  Integer.toString(div)+ "_" + "mail_list.csv";
                        writeToCSV(filename, listdata);
                        count = 0;
                        div++;
                    }
                    count++;
                }
    
            }
        }catch (FileNotFoundException f)
        {
            System.out.println(f.getMessage());
        }catch(IOException ie)
        {
            System.out.println(ie.getMessage());
        }
    }

    /**
     * write to csv file
     * @throws IOException
     */
    public void writeToCSV(String filename, List<String> listmail) throws IOException
    {
        final FileWriter csvWriter = new FileWriter(filename);
        for(final String email : listmail)
        {
            csvWriter.append(email);
            csvWriter.append("\n");
            System.out.println(email);
        }
        csvWriter.flush();
        csvWriter.close();
    }
 }
