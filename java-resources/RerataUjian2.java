import java.util.Scanner;

/**
 Program ini mendemonstrasikan loop bersarang
 */

public class RerataUjian2
{
   public static void main(String [] args)
   {
      int banyakSiswa, 	//Banyak siswa
      banyakUjian, 		//Banyak ujian persiswa
      skor, 			//Skor ujian
      total; 			//Akumulator untuk skor-skor ujian
      double rerata; 	//Skor rerata ujian

      //Menciptakan sebuah objek Scanner untuk masukan papantik
      Scanner keyboard = new Scanner(System.in);

      //Membaca banyak siswa
      System.out.print("Berapa banyak siswa yang Anda miliki? ");
      banyakSiswa = keyboard.nextInt();

      //Membaca banyak skor ujian per siswa
      System.out.print("Berapa banyak skor ujian per siswa? ");
      banyakUjian = keyboard.nextInt();

      //Memproses semua siswa
      for (int siswa = 1; siswa <= banyakSiswa; siswa++)
      {
         total = 0; //Menetapkan akumulator menjadi nol

         //Membaca skor-skor ujian untuk seorang siswa
         System.out.println("Nomor siswa " + siswa);
         System.out.println("--------------------");
         for (int ujian = 1; ujian <= banyakUjian; ujian++)
         {
            System.out.print("Masukkan skor " + ujian + ": ");
            skor = keyboard.nextInt();
            total += skor; //Menambahkan skor pada total
         }

         //Menghitung dan menampilkan rerata
         rerata = total / banyakUjian;
         System.out.printf("Nilai rerata untuk siswa %d adalah %.1f.\n\n",
                           siswa, rerata);
      }
   }
}