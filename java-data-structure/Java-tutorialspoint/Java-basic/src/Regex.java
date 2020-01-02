/**
 * source learn regex : https://www.tutorialspoint.com/java/java_regular_expressions.htm 
 */

import java.util.regex.*;

public class Regex
{
    private String data_string;
    private String data_regex;
    private String data_replace;

    /**
    * set data_string
    */
    public void setData(String data_str)
    {
        data_string = data_str;
    }

    /**
    * set data_regex
    */
    public void setRegex(String data_rgx)
    {
        data_regex = data_rgx;
    }

    /**
    * set data_replace
    */
    public void setReplace(String data_rplc)
    {
        data_replace = data_rplc;
    }
    /**
    * get data_string
    */
    public String getData()
    {
        return data_string;
    }

    /**
    * get data_regex
    */
    public String getRegex()
    {
        return data_regex;
    }

    /**
    * get data_replace
    */
    public String getReplace()
    {
        return data_replace;
    }

    public void regularExpression()
    {
        String REGEX = getRegex();
        String INPUT = getData();
        String REPLACE = getReplace();

        System.out.println("DATA SEBELUM REPLACE : "+ INPUT);

        Pattern p = Pattern.compile(REGEX);

        // get matchers object
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);

        System.out.println("PATTERNS : " + p);
        System.out.println("MATCHERS : " + m);
        System.out.println("DATA SETELAH REPLACE : "+ INPUT);
    }
}