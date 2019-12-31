/**
 Program ini mendemonstrasikan bahwa dua variabel dapat
 mereferensi array yang sama.
*/

public class ArraySama
{
   public static void main(String[] args)
   {
      int[] array1 = { 2, 4, 6, 8, 10 };
      int[] array2 = array1;

      //Mengubah salah satu elemen menggunakan array1.
      array1[0] = 200;

      //Mengubah salah satu elemen menggunakan array2.
      array2[4] = 1000;

      //Menampilkan semua elemen menggunakan array1
      System.out.println("Isi dari array1:");
      for (int nil : array1)
         System.out.print(nil + " ");
      System.out.println();

      //Menampilkan semua elemen menggunakan array2
      System.out.println("Isi dari array2:");
      for (int nil : array2)
         System.out.print(nil + " ");
      System.out.println();
   }
}