public class MaximumTest
{
    /**
     * determine the largest of 3 comparable objects
     */
    public static <T extends Comparable<T>> T maximum(T x, T y, T z)
    {
        /**
         * assume x is largest
         */
        T max = x;

        /**
         * y is largest so far
         */
        if(y.compareTo(max) > 0)
        {
            max = y;
        }

        /**
         * z is largest so far
         */
        if(z.compareTo(max) > 0)
        {
            max = z;
        }

        /**
         * @return max
         */
        return max;
    }

    public static void main(String[] args) {
        System.out.printf("Tha max value of %d, %d and %d is %d \n\n", 3, 5, 8, maximum(3, 5, 8));
        System.out.printf("Tha max value of %.1f, %.1f and %.1f is %.1f \n\n", 4.5, 5.9, 2.3, maximum(4.5, 5.9, 2.3));
        System.out.printf("The max value of %s, %s and %s is %s \n\n", "apple", "zaitun", "banana", maximum("apple", "zaitun", "banana"));
    }
}