/**
 This program uses the length fields of a 2D array
 to display the number of rows, and the number of
 columns in each row.
 */

public class BidangLength
{
   public static void main(String[] args)
   {
      //Mendeklarasikan sebuah array 2D dengan 3 baris
      //dan 4 kolom.

      int[][] angka = {{ 1, 2, 3, 4 },
                       { 5, 6, 7, 8 },
                       { 9, 10, 11, 12 } };

      // Display the number of rows.
      System.out.println("Banyak baris " +
                         "adalah " + angka.length);

      //Menampilkan banyak kolom pada tiap baris
      for (int indeks = 0; indeks < angka.length; indeks++)
      {
         System.out.println("Banyak kolom " +
                            "pada baris " + indeks + " adalah " +
                            angka[indeks].length);
      }
   }
}