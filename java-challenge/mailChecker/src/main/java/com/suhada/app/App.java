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
        String email = "";
        String api_key = "";
        final mailChecker mailval = new mailChecker(email, api_key);
        mailval.run();
    }
}
