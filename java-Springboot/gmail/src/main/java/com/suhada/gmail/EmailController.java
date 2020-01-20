package com.suhada.gmail;

import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.PasswordAuthentication;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class EmailController
{

    @RequestMapping(value="/sendmail", method=RequestMethod.GET)
    public String sendEmail() throws javax.mail.internet.AddressException, MessagingException, IOException
    {
        System.out.println("/sendmail");
        String userName = "username@gmail.com";
        String password = "password";
            
        sendmail(userName, password);
        return "Email already send !";
    }


    private void sendmail(String userName, String password) throws javax.mail.internet.AddressException, MessagingException, IOException {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(userName, password.toCharArray());
            }
        });

        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("dev.suhada@gmail.com", false));

        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("ade.suhada@mail.ugm.ac.id"));
        msg.setSubject("Tutorials point mail with springboot framework");
        msg.setContent("Tutorials point mail with springboot frameworok", "txt/html");
        msg.setSentDate(new Date());

        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent("Tutorials point mail with springboot frameworok", "txt/html");
        

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        MimeBodyPart attachPart = new MimeBodyPart();

        attachPart.attachFile("Application.java");
        multipart.addBodyPart(attachPart);
        msg.setContent(multipart);
        Transport.send(msg);
     }
}