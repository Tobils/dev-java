package com.suhada.app;

import com.suhada.app.scrapping;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "let's get started collect email !" );
        scrapping data_mail = new scrapping();
        data_mail.run();
    }
}
