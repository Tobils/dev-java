/**
 * numbers [int, double, float, byte, short, long]
 * Integer --> lebih flexible
 * int --> tidka flexible
 */

import java.util.*;

public class Numbers
{
    /**
     * number methods
     * 1. xxxValues() --> Converts the value of this Number object to the xxx data type and returns it.
     * 2. compareTo() --> Compares this Number object to the argument.
     * 3. equals() --> Determines whether this number object is equal to the argument.
     * 4. valueOf --> Returns an Integer object holding the value of the specified primitive.
     * etc total nya ada 27 method : link --> https://www.tutorialspoint.com/java/java_numbers.htm
     */

    private Integer x;

    /**
     * constructor
     */
    public Numbers(Integer nilai){
        this.x = nilai;
    }

    /**
     * getValue
     * @return nilai x
     */
    public Integer getValue(){
        return x;
    }

    /**
     * return berupa List data dengan beragam type data
     */
    public List<Object> get_xxxValue()
    {
        Integer nilai = getValue();
        Byte number_byte = nilai.byteValue();
        Short number_short = nilai.shortValue();
        Integer number_integer = nilai.intValue();
        Long number_long = nilai.longValue();
        Float number_float = nilai.floatValue();
        Double number_double = nilai.doubleValue();

        return Arrays.asList(number_byte, number_short, number_integer, number_long, number_float, number_double);
    }

    /**
     * return hasil compare
     * equal --> 0
     * less than --> 1
     * more than --> -1
     */
    public List<Object> getCompare()
    {
        Integer nilai = getValue();
        return Arrays.asList(nilai.compareTo(nilai-1), nilai.compareTo(nilai), nilai.compareTo(nilai+1));
    }

    /**
     * equals 
     * same --> return true
     * different --> return false
     */
    public List<Object> getEquals()
    {
        Integer nilai = getValue();
        return Arrays.asList(nilai.equals(nilai-1), nilai.equals(nilai), nilai.equals(nilai+1));
    }

    /**
     * dan fungsi2 number yang lainnya ...
     */

}