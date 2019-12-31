public class DemoRegex
{
    public static void main(String[] args)
    {
        String data_string = "The dog says meow." + "All dogs says meow";
        String data_regex = "dog";
        String data_replace = "cat";

        Regex regex = new Regex();
        regex.setData(data_string);
        regex.setRegex(data_regex);
        regex.setReplace(data_replace);

        /**
         * show regex result
         */
        regex.regularExpression();
    }
}