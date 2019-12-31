public class DemoArrays
{
    public static void main(String[] args)
    {
        double[] myList = {1.9, 2.9, 3.4, 9};

        /**
         * declare class Arrays()
         */
        Arrays data_array = new Arrays();

        /**
         * passing array to methhod setValue 
         */
        data_array.setValue(myList);

        /**
         * print all array data
         */
        data_array.printArray();

        /**
         * gat sum of array and get the largest data of array
         */
        double totals =  data_array.getSumArray();
        double largest =  data_array.getLargest();

        /**
         * show what we get
         */
        System.out.println("total : " + totals);
        System.out.println("largest : " + largest);
    }
}