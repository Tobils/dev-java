package com.suhada.gmail;

import org.springframework.web.bind.annotation.RestController;

import sun.jvm.hotspot.debugger.AddressException;

import java.io.IOException;
import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class EmailController
{

    @RequestMapping(value="/sendmail", method=RequestMethod.GET)
    public String sendEmail()
    {
        sendmail();
        return "Email already send !";
    }


    private void sendmail() throws javax.mail.internet.AddressException, MessagingException, IOException {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        
        Session session = Session.getInstance(props, new Authenticator() {
            
        });
     }
}