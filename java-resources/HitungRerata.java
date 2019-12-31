import java.util.Scanner;

/**
 Program ini membaca sejumlah skor ujian dan 
 menggunakankelas Nilai untuk menghitung rerata
 dengan skor terendah diabaikan.
 */

public class HitungRerata
{
   public static void main(String[] args)
   {
      int BanyaSkor; //Untuk memuat banyak skor 

      //Menciptakan sebuah objek Scanner untuk masukan papantik
      Scanner keyboard = new Scanner(System.in);

      //Membaca banyak skor ujian
      System.out.print("Berapa banyak skor ujian Anda miliki? ");
      BanyaSkor = keyboard.nextInt();

      //Menciptakan sebuah array untuk memuat beberapa skor ujian
      double[] skor = new double[BanyaSkor];

      //Membaca skor ujian dan menyimpannya
      //di dalam array skor.
      for (int indeks = 0; indeks < BanyaSkor; indeks++)
      {
         System.out.print("Masukkan skor #" +
                          (indeks + 1) + ": ");
         skor[indeks] = keyboard.nextDouble();
      }

      //Menciptakan sebuah objek Nilai, melewatkan
      //array skor sebagai argumen kepada
      //konstruktor.
      Nilai nilaiKu = new Nilai(skor);

      //Menampilkan rerata terperbarui
      System.out.println("Rerata skor terperbarui adalah " +
      nilaiKu.getRerata());

      //Menampilkan skor terendah
      System.out.println("Skor terendah Anda adalah " +
      nilaiKu.getSkorTerendah());

   }
}