package com.suhada.app;
import java.io.IOException;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class App 
{
    public static void main( final String[] args ) throws AddressException, MessagingException, IOException, java.lang.NullPointerException
    {
        System.out.println("gmail project get started !");

        final String mailFrom = "";
        final String password = "";
        final String csvFile = "./mailinglist/2_mail_list.csv";
        final KindOfMail jenis_email = KindOfMail.TEXT;
        final Gmail gmail = new Gmail();
        final String msg = "";
        final String subject = "";
        gmail.run(jenis_email, subject, msg, csvFile, mailFrom, password);
        
        // final mailDivide bagidata = new mailDivide();

    }
}
