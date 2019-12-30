import java.util.Scanner; // Needed for Scanner class

/**
 Program ini mendemonstrasikan pelewatan sebuah array
 sebagai argumen kepada suatu metode.
 */

public class MelewatkanArray
{
   public static void main(String[] args)
   {
      final int UKURAN_ARRAY = 4; //Ukuran array

      //Menciptakan sebuah array
      int[] angka = new int[UKURAN_ARRAY];

      //Melewatkan array kepada metode getNilai
      getNilai(angka);

      System.out.println("Berikut adalah " +
                         "nilai-nilai yang Anda masukkan:");

      //Melewatkan array kepada metode tampilArray
      tampilArray(angka);
   }

   /**
    Metode getNilai menerima sebuah variabel referensi
    ke sebuah array sebagai argumennya. User diminta untuk
    memasukkan sebuah nilai untuk tiap elemen array.
    @param array Sebuah referensi ke array.
   */

   private static void getNilai(int[] array)
   {
      //Menciptakan sebuah objek Scanner untuk masukan papantik
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Masukkan sebanyak " +
      array.length + " nilai.");

      //Membaca nilai-nilai ke dalam array
      for (int indeks = 0; indeks < array.length; indeks++)
      {
         System.out.print("Masukkan nilai ke-" +
                          (indeks + 1) + ": ");
         array[indeks] = keyboard.nextInt();
      }
   }

   /**
    Metode tampilArray menerima sebuah array sebagai
    argumen dan menampilkan isinya.
    @param array Sebuah referensi ke array.
   */

   public static void tampilArray(int[] array)
   {
      //Menampilkan elemen-elemen array
      for (int indeks = 0; indeks < array.length; indeks++)
         System.out.print(array[indeks] + " ");
   }
}