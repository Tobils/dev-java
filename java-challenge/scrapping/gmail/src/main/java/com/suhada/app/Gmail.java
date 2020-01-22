package com.suhada.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.*;

public class Gmail
{
    private List<String> listOfEmail = new ArrayList<String>();
    final String mailFrom = "dev.suhada@gmail.com";
    final String password = "";
    final String sub = "wq";
    private String msg;

    final String csvFile = "data_email_company_south_east.csv";
    final String csvSplitBy = "\n";
    String line = "";

    Properties props = new Properties();   


    public Gmail()
    {
        System.out.println("ready to send email !");
    }

    public void run(final KindOfMail mailType, final String msg) throws javax.mail.internet.AddressException, MessagingException, IOException
    {
        this.msg = msg;
        /**
         * read csv file
         */
        System.out.println("start to read email address");
         BufferedReader csvReader = new BufferedReader(new FileReader(csvFile));
		String row;
		while((row=csvReader.readLine()) != null)
        {
            String[] data = row.split("\n");
            listOfEmail.add(data[0]);
        }
        System.out.println("got finish read all email address");

        /**
         * set mail properties
         */ 
         
        props.put("mail.smtp.host", "smtp.gmail.com");    
        props.put("mail.smtp.socketFactory.port", "465");    
        props.put("mail.smtp.socketFactory.class",    
                "javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.port", "465");  

        /**
         * get started to send email
         */
        int i = 0;
        for(String email : listOfEmail)
        {
            i++;
            sendMail(email);
            System.out.println(i + " email to " + email + "has sent !");
        }

    }

    /**
     * sending mail method
     * @param mail_to is company email address
     */
    void sendMail(String mail_to)
    {
        /**
         * get session
         */
        Session session = Session.getDefaultInstance(props,
        new javax.mail.Authenticator()
        {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication()
            {
                return new javax.mail.PasswordAuthentication(mailFrom, password);
            }
        });

        /**
         * compose message
         */
        try {
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
}