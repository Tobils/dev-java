/**
 Program ini menunjukkan sebuah array yang sedang diinisialisasi
 */

public class InisialisasiArray
{
   public static void main(String[] args)
   {
      int[] hari = {31, 28, 31, 30, 31, 30,
                    31, 31, 30, 31, 30, 31};

      for (int indeks = 0; indeks < 12; indeks++)
      {
         System.out.println("Bulan " + (indeks + 1) +
                            " memiliki " + hari[indeks] +
                            " hari.");
      }
   }
}