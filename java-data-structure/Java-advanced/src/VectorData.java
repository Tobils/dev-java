import java.util.*;


public class VectorData
{
    public static void main(String[] args) {
        Vector v = new Vector(3, 2);
        
        System.out.println("inisialisasi ukuran : " + v.size());
        System.out.println("inisialisasi kapasitas : " + v.capacity());

        for(int i=1; i<5; i++)
        {
            v.addElement(i);
        }

        System.out.println("kapasitas setelah penambahan 4 element : " + v.capacity());
        System.out.println(v);

        v.addElement(5.45);
        System.out.println("kapasitas terakhir : " + v.capacity());
        System.out.println(v);
        v.addElement(11);
        v.addElement(9.8);
        v.addElement(10);
        System.out.println("kapasitas terakhir : " + v.capacity());
        System.out.println(v);

        // enumeration
        Enumeration e = v.elements();
        System.out.println();
        System.out.println("Vector in Enumerations");

        while(e.hasMoreElements())
        {
            System.out.print(e.nextElement()+ " ");
        }
        System.out.println();

    }
}