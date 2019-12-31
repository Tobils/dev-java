import java.util.Scanner; //Diperlukan untuk kelas Scanner

/**
 Program ini menyimpan di dalam sebuah array jam kerja dari
 lima karyawan yang memiliki gaji per jam.
 */

public class ArrayGaji
{
   public static void main(String[] args)
   {
      final int KARYAWAN = 5; 	//Banyak karyawan
      
      double gajiPerJam; 		//Gaji per jam
      double gajiKotor; 		//Gaji kotor

      //Menciptakan sebuah array untuk memuat jam karyawan
      int[] jam = new int[KARYAWAN];

      //Menciptakan sebuah objek Scanner untuk masukan papantik
      Scanner keyboard = new Scanner(System.in);

      //Membaca jam kerja dari tiap karyawan.
      System.out.println("Masukan jam kerja oleh " +
                         KARYAWAN + " karyawan yang memiliki " +
                         "gaji per jam yang sama.");

      for (int indeks = 0; indeks < KARYAWAN; indeks++)
      {
         System.out.print("Karyawan #" + (indeks + 1) + ": ");
                          jam[indeks] = keyboard.nextInt();
      }

      //Membaca gaji per jam
      System.out.print("Masukkan gaji per jam dari karyawan: ");
      gajiPerJam = keyboard.nextDouble();

      //Menampilkan gaji kotor dari tiap karyawan
      System.out.println("Berikut adalah gaji kotor dari tiap karyawan:");
      for (int indeks = 0; indeks < KARYAWAN; indeks++)
      {
         gajiKotor = jam[indeks] * gajiPerJam;
         System.out.println("Karyawan #" + (indeks + 1) +
                            ": Rp. " + gajiKotor);
      }
   }
}