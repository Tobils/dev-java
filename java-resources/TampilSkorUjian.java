import java.util.Scanner; //Diperlukan untuk kelas Scanner

/**
 Program ini mendemonstrasikan bagaimana user dapat menetapkan
 ukuran array.
*/

public class TampilSkorUjian
{
   public static void main(String[] args)
   {
      int banyakUjian; 	//Banyak ujian
      int[] ujian; 		//Array yang memuat skor-skor ujian

      //Mencaiptakan sebuah objek Scanner untuk masukan papantik
      Scanner keyboard = new Scanner(System.in);

      //Membaca banyak skor ujian
      System.out.print("Berapa banyak skor ujian? ");
      banyakUjian = keyboard.nextInt();

      //Menciptakan sebuah array untuk memuat sejumlah skor ujian
      ujian = new int[banyakUjian];

      //Membaca skor-skor ujian individual
      for (int indeks = 0; indeks < ujian.length; indeks++)
      {
         System.out.print("Masukkan skor ujian ke-" +
                          (indeks + 1) + ": ");
         ujian[indeks] = keyboard.nextInt();
      }

      //Menampilkan tiap skor ujian
      System.out.println();
      System.out.println("Berikut adalah skor-skor ujian yang Anda masukan:");
      for (int indeks = 0; indeks < ujian.length; indeks++)
         System.out.print(ujian[indeks] + " ");
   }
}