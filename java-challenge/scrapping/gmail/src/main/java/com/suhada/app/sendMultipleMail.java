package com.suhada.app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import javax.mail.MessagingException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.*;

public class sendMultipleMail
{
    private static String email = "";
    private static String password = "";
    private static String sub = "";
    private static String msg = "";
    final static Properties props = new Properties(); 

    public static void main(final String[] args) throws IOException, ParseException, MessagingException 
    {
        /**
         * set properties smtp
         */
        setProperties();


        /**
         * set configurasi email, password, subject and message
         */
        setConfig();


        /**
         * read json file 
         * kirim email
         */
        JSONParser parse = new JSONParser();
        Reader reader = new FileReader("./email-valid-indo/data_email_valid_company_softwaredev_indonesia.json");
        JSONObject obj1 = (JSONObject)parse.parse(reader);
        JSONArray list_mail = (JSONArray)obj1.get("email_valid");

        for(int cnt=0; cnt < list_mail.size(); cnt++)
        {
            JSONObject obj = (JSONObject)list_mail.get(cnt);
            String email_to = obj.get("email").toString();
            sendMail(email_to);
            System.out.println("email from " + email + " to " + email_to + " has sent !");
        }
    }


    /**
     * setConfig untuk
     * 1. alamat email
     * 2. password app email
     * 3. subjects
     * 4. message
     */
    static void setConfig()
    {
        /**
         * configuration from config.json
         */
        final JSONParser parser = new JSONParser();
        try {
           final Reader csvReader = new FileReader("config.json");
           final JSONObject obj = (JSONObject)parser.parse(csvReader);
           /**
            * email config
            * email : alamat email pemgirim
            * password : password app pengirim
            */
           final JSONArray email_conf = (JSONArray)obj.get("emails_conf");
           final JSONObject obj_email = (JSONObject)email_conf.get(0);

           email = obj_email.get("email").toString().toLowerCase();
           password = obj_email.get("password").toString().toLowerCase();

           /**
            * message config
            * sub : judul pesan
            * msg : pesan yang akan dikirim
            */
           final JSONArray msg_conf = (JSONArray)obj.get("message_conf");
           final JSONObject obj_msg = (JSONObject) msg_conf.get(0);

           sub = obj_msg.get("sub").toString().toLowerCase();
           msg = obj_msg.get("msg").toString().toLowerCase();
           
       } catch (final FileNotFoundException e) {
           e.printStackTrace();
       } catch (final IOException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       } catch (final ParseException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
    }


    /**
     * set mail properties
     */
    static void setProperties()
    { 
        props.put("mail.smtp.host", "smtp.gmail.com");    
        props.put("mail.smtp.socketFactory.port", "465");    
        props.put("mail.smtp.socketFactory.class",    
                "javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.port", "465");  
    }

    /**
     * sendMail(email tujuan)
     * @param email_tujuan : alamat email tujuan
     */
    static void sendMail(String email_tujuan) throws MessagingException
    {
        if((email.isEmpty() & password.isEmpty() & sub.isEmpty() & msg.isEmpty()))
        {
            System.out.println("silahkan lengkapi data email, password, subjects dan pesan yang akan dikirim !!!!");
        } else {
            /**
             * get session
             */
            Session session = Session.getDefaultInstance(props,
            new javax.mail.Authenticator()
            {
                protected javax.mail.PasswordAuthentication getPasswordAuthentication()
                {
                    return new javax.mail.PasswordAuthentication(email, password);
                }
            });
            
            /**
             * compose message
             */
            try {
                MimeMessage message = new MimeMessage(session);
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(email_tujuan));
                message.setSubject(sub);
                message.setText(msg);
                Transport.send(message);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}