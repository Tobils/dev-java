public class GenericMethodTest
{
    /**
     * generic method printArray
     * @param <E>
     * @param inputArray
     */
    public static <E> void printArray( E[] inputArray)
    {
        /**
         * display array element
         */
        for(E element : inputArray)
        {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /**
         * create arrays of Ineteger, Double and Char
         */
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        /**
         * pass integer array
         */
        System.out.println("array intArray contains : ");
        printArray(intArray);
        System.out.println();

        /**
         * pass double array
         */
        System.out.println("array double contains : ");
        printArray(doubleArray);
        System.out.println();

        /**
         * pass charAray
         */
        System.out.println("array char contains : ");
        printArray(charArray);
        System.out.println();
    }
}