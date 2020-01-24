package com.suhada.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.*;

public class Gmail
{
    private List<String> listOfEmail = new ArrayList<String>();
    private String mailFrom;
    private String password;
    private String subject;
    private String msg;

    private String csvFile;
    final String csvSplitBy = "\n";
    String line = "";

    Properties props = new Properties();   


    public Gmail()
    {
        System.out.println("ready to send email !");
    }

    public void run(final KindOfMail mailType, final String subject, final String msg, String csvFile, String mailFrom, String password) throws javax.mail.internet.AddressException, MessagingException, IOException
    {
        this.mailFrom = mailFrom;
        this.password = password;
        this.csvFile = csvFile;
        this.subject = subject;
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
        csvReader.close();
        System.out.println("got finish read all email address");

        /**
         * set mail properties
         */
        setProperties();

        /**
         * get started to send email
         */
        int i = 0;
        for(String email : listOfEmail)
        {
            i++;
            sendMail(email.toLowerCase(), mailType);
            System.out.println("counting mail : " + i);
            System.out.println("email to " + email.toLowerCase() + " has sent !");
            System.out.println("\n");
        }
        System.out.println("finish send "+ i + " mail !");

    }

    /**
     * sending mail method
     * @param mail_to is company email address
     */
    void sendMail(String mail_to, KindOfMail mail_type) throws MessagingException
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
            MimeMessage message = new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(mail_to));
            message.setSubject(subject);
            
            /**
             * select mail type
             */
            switch (mail_type) {
                case TEXT:
                    message.setText(msg);
                    break;
                case FILE:
                    Multipart multipart = new MimeMultipart();
                    MimeBodyPart attachpart = new MimeBodyPart();
                    attachpart.attachFile("file");
                    multipart.addBodyPart(attachpart);
                    message.setContent(multipart);
                    break;
                default:
                    break;
            }

            /**
             * send message
             */
            Transport.send(message);

        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    /**
     * set mail properties
     */
    void setProperties()
    { 
        props.put("mail.smtp.host", "smtp.gmail.com");    
        props.put("mail.smtp.socketFactory.port", "465");    
        props.put("mail.smtp.socketFactory.class",    
                "javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.port", "465");  
    }
}