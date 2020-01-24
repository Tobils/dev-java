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
    public static void main( final String[] args ) throws AddressException, MessagingException, IOException, java.lang.NullPointerException
    {
        System.out.println("gmail project get started !");

        final String mailFrom = "suhada@widyawicara.com";
        final String password = "zumkxnezexyqeuzq";
        final String csvFile = "./mailinglist/2_mail_list.csv";
        final KindOfMail jenis_email = KindOfMail.TEXT;
        final Gmail gmail = new Gmail();
        final String msg = "Hi,\nMy name is Suhada, I am junior sotfware engineer at start up in Yogyakarta, Indonesia. \n\nI just wanted to say that i'm huge fan of your company and interested with your company.\nI love your products and your services, your team doing great work, I would love to learn more about your company.\n\nI was also wondering if you have any sample product or any company's swag could you send my way -\nI'd love to try it, and would appreciate anything you could send me.\n\nThank you so much and have a great Day.\n\nSincerely yours,\nSuhada\n\n---------------\nJl. Anggajaya 2 No.105, Sanggrahan, Condongcatur,\nKec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta, Indonesia\nPost Code   : 55281\nWhatsapp    : +6285228663237\n---------------";
        final String subject = "Hey Team - You are doing great, I really love what you are doing!";
        gmail.run(jenis_email, subject, msg, csvFile, mailFrom, password);
        
        // final mailDivide bagidata = new mailDivide();

    }
}
