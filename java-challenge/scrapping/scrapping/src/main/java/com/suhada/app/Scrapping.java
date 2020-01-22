package com.suhada.app;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.regex.*;


public class Scrapping
{
    private String url_result;
    private String at = "@";
    private List<String> data_mail = new ArrayList<String>();
    private List<String> data_dns = new ArrayList<String>();
    private List<String> awal_email = new ArrayList<String>();

    /**
     * constructor
     */
    public Scrapping()
    {
        prepMail();
    }

    /**
     * scrapping based on url
     */
    public void run()
    {
        int i = 0;
        while( i < 34)
        {
            if(i == 0)
            {
                String url = "https://clutch.co/app-developers/se-asia";
                getList(url);
            }else
            {
                
                String url = "https://clutch.co/app-developers/se-asia?page=" + Integer.toString(i);
                getList(url);
            }
            System.out.println(i + " done!");
            i++;
        }

        /**
         * write file to csv
         */
        try {
            writeCsvFile();
            System.out.println("csv file has been finish writen !");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /**
     * get email list
     */
    public void getList(String url)
    {
        String tmp_url;
        try 
        {
            Document document = Jsoup.connect(url).get();
            Elements links = document.select("li.website-link.website-link-a > a");
            
            System.out.println();

            for(Element link : links)
            {
                tmp_url = link.attr("abs:href");
                /**
                 * reduce http://www. or https://www. with regex
                 */
                // System.out.println(tmp_url);
                url_result = removeWord(tmp_url);

                data_dns.add(url_result);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        /**
         * menambahkan @ di awal domain
         */
        setMail(data_dns);
    }


    public String removeWord(String links_url)
    {
        /**
         * remove first word 
         */
        String httpsw = "https://www.";
        String httpw = "http://www.";
        String http = "http://";
        String https = "https://";
        

        if(links_url.contains(httpsw))
        {
            links_url = links_url.replaceAll(httpsw, "");
        } 
        if(links_url.contains(httpw))
        {
            links_url = links_url.replaceAll(httpw, "");
        }

        if(links_url.contains(https))
        {
            links_url = links_url.replaceAll(https, "");
        } 
        if(links_url.contains(http))
        {
            links_url = links_url.replaceAll(http, "");
        }
        
        /**
         * remove after .com or .net etc... i.e octalsoftware.com/mobile-app-development?utm_source=clutch.co&utm_medium=paidlink&utm_campaign=clutchpro --> octalsoftware.com
         * with regex --> ()
         */
        String pattern = "([A-Za-z|.]*)[/]";
        
        /**
         * create pattern object
         */
        Pattern r = Pattern.compile(pattern);

        /**
         * create matcher objeck
         */
        Matcher m = r.matcher(links_url);
        if(m.find())
        {
            links_url = m.group(1);
        }

        return links_url;
    }

    /**
     * set the first of email word example : www.google.com --> info@google.com remove https://www. 
     */
    public void prepMail()
    {
        awal_email.add("social");
        awal_email.add("marketing");
        awal_email.add("hello");
        awal_email.add("contact");
        awal_email.add("support");
        awal_email.add("info");
        awal_email.add("press");
        awal_email.add("media");
        awal_email.add("team");
        awal_email.add("sales");
        awal_email.add("equiries");
        awal_email.add("help");
        awal_email.add("busines");
        awal_email.add("service");
        awal_email.add("career");
        awal_email.add("community");
        awal_email.add("opportunities");
    }

    /**
     * adding @ with format --> list_@domain i.e info@domain
     */
    public void setMail(List<String> data_dns)
    {
        for(String domain : data_dns)
        {
            for(String awalan : awal_email)
            {
                String mail = awalan+at+domain; 
                data_mail.add(mail);
            }
        }
    }

    /**
     * menampilkan dns yang sudah bersih
     * @param data_dns dns company
     */
    public void showData(List<String> dataList)
    {
        int i = 1;
        for(String data : dataList)
        {
            System.out.println(i + ". " + data);
            i++;
        }
    }

    public void writeCsvFile() throws IOException
    {
        FileWriter csvWriter = new FileWriter("data_email_company_south_east.csv");
        for(String email : data_mail)
        {
            csvWriter.append(email);
            csvWriter.append("\n");
        }

        csvWriter.flush();
        csvWriter.close();

        /**
         * show data email
         */
        showData(data_mail);
    }    

}