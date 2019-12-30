/**
 Program ini mendemonstrasikan bagaimana sebuah referensi ke array
 dapat dihasilkan dari suatu metode.
 */

public class HasilArray
{
   public static void main(String[] args)
   {
     double[] arrayNilai;

      arrayNilai = getArray();
      for (double num : arrayNilai)
         System.out.print(num + " ");
   }

   /**
    Metode getArray 
    @return Sebuah referensi ke array double.
   */

   public static double[] getArray()
   {
      double[] array = { 1.2, 2.3, 4.5, 6.7, 8.9 };

      return array;
  }
}