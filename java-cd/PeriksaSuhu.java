import java.util.Scanner;

/**
 Program ini memandu teknisi dalam proses
 memeriksa suhu bahan.
 */
public class PeriksaSuhu
{
   public static void main(String[] args)
   {
      final double SUHU_MAKS = 102.5; //Suhu maksimum
      double suhu; //Untuk memuat suhu

      //Menciptakan sebuah objek Scanner untuk masukan papantik
      Scanner keyboard = new Scanner(System.in);

      //Membaca suku terkini
      System.out.print("Memasukkan suhu bahan dalam Celcius: ");
      suhu = keyboard.nextDouble();

      //Sepanjang diperlukan, instruksi teknisi
      //untuk memperbarui suhu
      while (suhu > SUHU_MAKS)
      {
         System.out.println("Suhu terlalu tinggi. Matikan");
         System.out.println("thermostat dan tunggu 5 menit.");
         System.out.println("Kemudian, periksa suhu Celcius kembali");
         System.out.print("dan masukkan di sini: ");
         suhu = keyboard.nextDouble();
      }

      //Ingatkan teknisi untuk memeriksa suhu
      //kembali dalam 15 menit
      System.out.println("Suhu dapat diterima.");
      System.out.println("Periksa kembali dalam 15 menit.");
   }
}