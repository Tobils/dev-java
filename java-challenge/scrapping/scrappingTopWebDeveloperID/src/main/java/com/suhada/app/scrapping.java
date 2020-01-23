/**
 * Scrapping Top web development in indonesia
 * links : https://clutch.co/id/web-developers
 * links : https://clutch.co/id/web-developers?page=
 * pages 1 sd 7
 * [completed]
 * 
 * 
 * Scrapping Top Software developer in indonesia
 * links : https://clutch.co/id/developers
 * links : https://clutch.co/id/developers?page=
 * pages 1 sd 2
 * [completed]
 * 
 * 
 * Scrapping Top App developer in indonesia
 * links : https://clutch.co/id/app-developers
 * links : https://clutch.co/id/app-developers?page=
 * page 1 sd 7
 * [completed]
 * 
 * 
 * Scrapping Top IT services in indonesia
 * links : https://clutch.co/id/it-services
 * links : https://clutch.co/id/it-services?page=
 * pages 1 sd 2
 * [completed]
 * 
 * 
 * Scrapping Top AI Company in china
 * links : https://clutch.co/cn/developers/artificial-intelligence
 * links : https://clutch.co/cn/developers/artificial-intelligence?page=
 * pages 1 sd 2
 * [completed]
 * 
 * 
 * Scrapping Top Big Data Company
 * links : https://clutch.co/cn/it-services/analytics
 * links : https://clutch.co/cn/it-services/analytics?page=
 * page 1 sd 4
 * [completed]
 * 
 * 
 * Scrapping App dev in china
 * links : https://clutch.co/cn/app-developers
 * links : https://clutch.co/cn/app-developers?page=
 * pages 1 sd 4
 * [completed]
 * 
 * 
 * 
 * Scrapping Web Dev In China
 * links : https://clutch.co/cn/web-developers?
 * links : https://clutch.co/cn/web-developers?page=
 * pages 1 sd 3
 * [completed]
 * 
 * Scrapping AR in china
 * links : https://clutch.co/cn/developers/virtual-reality
 * only one pages
 * [completed]
 */

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


public class scrapping
{
    private String url_result;
    private final String at = "@";
    private final List<String> data_mail = new ArrayList<String>();
    private final List<String> data_dns = new ArrayList<String>();
    private final List<String> awal_email = new ArrayList<String>();
    final String namafile = "data_email_company_vrdev_china.csv";

    /**
     * constructor
     */
    public scrapping()
    {
        prepMail();
    }

    /**
     * scrapping based on url
     */
    public void run()
    {
        int i = 0;
        while( i < 1)
        {
            if(i == 0)
            {
                final String url = "https://clutch.co/cn/developers/virtual-reality";
                getList(url);
            }else
            {
                
                final String url = "https://clutch.co/cn/developers/virtual-reality?page=" + Integer.toString(i);
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
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /**
     * get email list
     */
    public void getList(final String url)
    {
        String tmp_url;
        try 
        {
            final Document document = Jsoup.connect(url).get();
            final Elements links = document.select("li.website-link.website-link-a > a");
            
            System.out.println();

            for(final Element link : links)
            {
                tmp_url = link.attr("abs:href");
                /**
                 * reduce http://www. or https://www. with regex
                 */
                // System.out.println(tmp_url);
                url_result = removeWord(tmp_url);

                data_dns.add(url_result);
            }
        } catch (final Exception e) {
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
        final String httpsw = "https://www.";
        final String httpw = "http://www.";
        final String http = "http://";
        final String https = "https://";
        

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
        final String pattern = "([A-Za-z|.]*)[/]";
        
        /**
         * create pattern object
         */
        final Pattern r = Pattern.compile(pattern);

        /**
         * create matcher objeck
         */
        final Matcher m = r.matcher(links_url);
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
        awal_email.add("enquiries");
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
    public void setMail(final List<String> data_dns)
    {
        for(final String domain : data_dns)
        {
            for(final String awalan : awal_email)
            {
                final String mail = awalan+at+domain; 
                data_mail.add(mail);
            }
        }
    }

    /**
     * menampilkan dns yang sudah bersih
     * @param data_dns dns company
     */
    public void showData(final List<String> dataList)
    {
        int i = 1;
        for(final String data : dataList)
        {
            System.out.println(i + ". " + data);
            i++;
        }
    }

    public void writeCsvFile() throws IOException
    {
        final FileWriter csvWriter = new FileWriter(namafile);
        for(final String email : data_mail)
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