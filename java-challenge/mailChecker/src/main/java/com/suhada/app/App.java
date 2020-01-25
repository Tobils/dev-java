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
        String email = "suhada@widyawicara.com";
        String api_key = "ffa68994ebe34ba19b5497594a0fcf8d";
        final mailChecker mailval = new mailChecker(email, api_key);
        mailval.run();
    }
}
