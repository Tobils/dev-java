/**
 Program ini mendemonstrasikan sebuah array String.
 */

public class HariBulan
{
   public static void main(String[] args)
   {
      String[] bulan = {"Januari", "Februari", "Maret",
                         "April", "Mei", "Juni", "Juli",
                         "Agustus", "September", "Oktober",
                         "November", "Desember" };

      int[] hari = {31, 28, 31, 30, 31, 30, 31,
                    31, 30, 31, 30, 31 };

      for (int indeks = 0; indeks < bulan.length; indeks++)
      {
         System.out.println(bulan[indeks] + " memiliki " +
                            hari[indeks] + " hari.");
      }
   }
}