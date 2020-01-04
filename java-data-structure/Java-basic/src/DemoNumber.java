import java.util.List;

public class DemoNumber
{
    public static void main(String[] args)
    {
        /**
         * declare class with contruction define
         */
        Numbers data_number = new Numbers(10);

        /**
         * get_xxValue()
         */
        List<Object> data_xxx = data_number.get_xxxValue();
        System.out.println("data hasil change to value : "+data_xxx);

        /**
         * getCompare()
         */
        List<Object> data_compare = data_number.getCompare();
        System.out.println("data hasil compare : "+data_compare);

        /**
         * getEquals()
         */
        List<Object> data_equal = data_number.getEquals();
        System.out.println("data hasil equals : "+ data_equal);
    }
}