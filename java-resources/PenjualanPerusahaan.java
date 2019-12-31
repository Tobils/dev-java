import java.util.Scanner;

/**
 Program ini mendemonstrasikan sebuah array dua-dimensi.
 */

public class PenjualanPerusahaan
{
   public static void main(String[] args)
   {
      final int DIVISI = 3; 		//Tiga divisi perusahaan
      final int KWARTAL = 4; 		//Empat kwartal
      double totalPenjualan = 0.0; 	//Akumulator

      //Menciptakan sebuah array untuk memuat penjualan untuk tiap
      //divisi, tiap kwartal.
      double[][] penjualan = new double[DIVISI][KWARTAL];

      //Menciptakan sebuah objek Scanner untuk masukan papantik
      Scanner keyboard = new Scanner(System.in);

      //Menampilkan introduksi
      System.out.println("Program ini akan menghitung " +
                         "total penjualan dari ");
      System.out.println("semua divisi perusahaan. " +
                         "Masukkan data penjualan berikut:");

      //Loop bersarang untuk mengisi array dengan data penjualan
      //per kwartal untuk tiap divisi.
      for (int div = 0; div < DIVISI; div++)
      {
         for (int ktr = 0; ktr < KWARTAL; ktr++)
         {
            System.out.printf("Divisi %d, Kwartal %d: Rp. ",
                              (div + 1), (ktr + 1));
            penjualan[div][ktr] = keyboard.nextDouble();
         }
         System.out.println(); //Menampilkan baris kosong
      }

      //Loop bersarang untuk menjumlahkan semua elemen array
      for (int div = 0; div < DIVISI; div++)
      {
         for (int ktr = 0; ktr < KWARTAL; ktr++)
         {
            totalPenjualan += penjualan[div][ktr];
         }
      }

      //Menampilkan penjualan total
      System.out.printf("Penjualan total perusahaan: Rp. %,.2f\n",
                        totalPenjualan);
      }
}