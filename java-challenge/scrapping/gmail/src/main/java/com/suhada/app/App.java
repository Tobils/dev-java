package com.suhada.app;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( final String[] args ) throws AddressException, MessagingException, IOException
    {
        System.out.println("gmail projects");
        final KindOfMail jenis_email = KindOfMail.TEXT;
        final Gmail gmail = new Gmail();
        final String msg = "hi there";
        gmail.run(jenis_email, msg);
    }
}
