public class Arrays
{
    private double[] myList;
    private double total = 0;


    /**
     * setValue array
     */
    public void setValue(double[] data_array)
    {
        myList = data_array;
    }

    /**
     * getValue of array
     */
    public double[] getValue()
    {
        return myList;
    }

    /**
     * show all data
     */
    public void printArray()
    {
        double[] data_array = getValue();
        for (int i = 0; i < data_array.length; i++)
        {
            System.out.println("data : " + data_array[i]);
        }
    }

    /**
     * sum all data
     */
    public double getSumArray(){
        double[] data_array = getValue();
        for (int i = 0; i < data_array.length; i++)
        {
            total = total + data_array[i];
        }
        return total;
    }

    /**
     * get the largest element
     */
    public double getLargest()
    {
        double[] data_array = getValue();
        double max = data_array[0];
        for (int j = 1; j < data_array.length; j++)
        {
            if(data_array[j] > max) max = data_array[j];
        }
        return max;
    }
}