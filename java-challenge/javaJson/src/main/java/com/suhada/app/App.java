package com.suhada.app;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( final String[] args ) throws IOException
    {
        System.out.println( "java json implemented with mail checker API" );
        final String api_key = "ffa68994ebe34ba19b5497594a0fcf8d";
        final String file = "./mail_list/1_mail_list.csv";

        final mailValidatorAPI cek_email_api = new mailValidatorAPI(api_key, file);
        cek_email_api.run();
    }
}
