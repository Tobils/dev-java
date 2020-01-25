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
        System.out.println( "java json validating with non API");
        mailValidatorNonAPI cek_email_api = new mailValidatorNonAPI();
        cek_email_api.run();
    }
}
