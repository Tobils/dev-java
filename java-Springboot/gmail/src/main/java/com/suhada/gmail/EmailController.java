package com.suhada.gmail;

import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Properties;
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


@RestController
public class EmailController
{

    @RequestMapping(value="/sendmail", method=RequestMethod.GET)
    public String sendEmail() throws javax.mail.internet.AddressException, MessagingException, IOException
    {
        
        System.out.println("/sendmail");
        final String from = "";
        final String password = "";
        final String to = "";
        final String sub = "Hey Team - You are doing great, I really love what you are doing!";
        mailKind jenis_email = mailKind.TEXT;
        final String msg = "Hi,\nMy name is Suhada, I am junior sotfware engineer at start up in Yogyakarta, Indonesia. \n\nI just wanted to say that i'm huge fan of your company and interested with your company.\nI love your products and your services, your team doing great work, I would love to learn more about your company.\n\nI was also wondering if you have any sample product or any company's swag could you send my way -\nI'd love to try it, and would appreciate anything you could send me.\n\nThank you so much and have a great Day.\n\nSincerely yours,\nSuhada\n\n---------------\nJl. Anggajaya 2 No.105, Sanggrahan, Condongcatur,\nKec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta, Indonesia\nPost Code   : 55281\nWhatsapp    : +6285228663237\n---------------";
        sendmail(from, password, to, sub, msg, jenis_email);
        return "Email already send !";
    }


    private void sendmail(String from, String password, String to, String sub, String msg, mailKind jenis_email) throws javax.mail.internet.AddressException, MessagingException, IOException 
    {
       
          //Get properties object    
          Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class",    
                    "javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "465");  

          //get Session   
          Session session = Session.getDefaultInstance(props,    
           new javax.mail.Authenticator() 
           {    
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() 
            {    
                return new javax.mail.PasswordAuthentication(from,password);  
            }    
          });    

          //compose message    
          try {    
           MimeMessage message = new MimeMessage(session);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
           message.setSubject(sub);   
           
           // select based on kind of mail
            switch (jenis_email) {
                case TEXT:
                    System.out.println(mailKind.TEXT);
                    message.setText(msg); 
                    break;
                case FILE:
                    Multipart multipart = new MimeMultipart();
                    MimeBodyPart attachPart = new MimeBodyPart();
                    attachPart.attachFile("./HELP.md");
                    multipart.addBodyPart(attachPart);
                    message.setContent(multipart);
                    break;
                default:
                    break;
            }
             

           //send message  
           Transport.send(message);    
           System.out.println("message sent successfully");    
          } catch (MessagingException e) {throw new RuntimeException(e);}       
     }
}