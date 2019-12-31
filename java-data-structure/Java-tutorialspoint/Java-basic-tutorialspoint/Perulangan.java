/**
 * class perulangan terdiri dari :
 * for loop
 * while loop
 * do... while loop
*/
public class Perulangan
{
    private int [] numbers = {10, 20, 30, 40, 50}; 
    private String [] names = {"James", "Lary", "Tom", "Lacy"};
    private static final int x = 0;
    private int y;

    /**
     * method untuk looping menggunakan for
     */
    public void forLoop()
    {
        System.out.println("mulai for-loop");
        for (int value : numbers)
        {
            System.out.println("numbers :"+ value);
        }
        System.out.println("selesai for-loop");
    }

    /**
     * method untuk looping menggunakan while
     */
    public void whileLoop()
    {
        System.out.println("mulai while-loop");
        y = names.length;
        while( y > x){
            System.out.println("name : " + names[y-1]);
            y--;
        }
        System.out.println("selesai while-loop");
    }

    /**
     * method untuk looping menggunakan do-while
     */
    public void doWhileLoop()
    {
        System.out.println("mulai do-while-loop");
        y = names.length;

        do{
            System.out.println("name : " + names[y-1]);
            y--;
        }while(y > x);
        System.out.println("selesai do-while-loop");
    }
}