/**
 Program ini mendemonstrasikan metode-metode yang menerima
 array dua-dimensi sebagai argumen.
 */

public class MelewatkanArray2D
{
   public static void main(String[] args)
   {
      int[][] angka = {{ 1, 2, 3, 4 },
                         { 5, 6, 7, 8 },
                         { 9, 10, 11, 12 } };

      //Menampilkan isi dari array
      System.out.println("Berikut adalah nilai-nilai " +
                         " di dalam array.");
      tampilArray(angka);

      //Menampilkan penjumlahan atas nilai-nilai array
      System.out.println("Penjumlahan atas nilai-nilai " +
                         "adalah " + jumArray(angka));
   } 

   /**
    Metode tampilArray menampilkan isi dari sebuah
    array int dua-dimensi.
    @param array Array yang akan ditampilkan.
   */

    private static void tampilArray(int[][] array)
    {
       for (int baris = 0; baris < array.length; baris++)
       {
          for (int kol = 0; kol < array[baris].length; kol++)
             System.out.print(array[baris][kol] + " ");
         System.out.println();
      }
   }

   /**
    Metode jumArray menghasilkan penjumlahan atas
    nilai-nilai di dalam sebuah array dua-dimensi.
    @param array Array yang akan dijumlahan.
    @return Penjumlahan atas elemen-elemen array.
   */

   private static int jumArray(int[][] array)
   {
      int total = 0; //Akumulator

      for (int baris = 0; baris < array.length; baris++)
      {
         for (int kol = 0; kol < array[baris].length; kol++)
           total += array[baris][kol];
      }

      return total;
   }
}