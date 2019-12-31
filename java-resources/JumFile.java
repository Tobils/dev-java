import java.util.Scanner;
import java.io.*;

/**
 Program ini membaca serangkaian nilai dari sebuah file dan
 mengakumulasi penjumlahannya.
 */

public class JumFile
{
   public static void main(String[] args) throws IOException
   {
      double jum = 0.0; //Akumulator, diinisialisasi dengan 0

      //Membuka file untuk pembacaan
      File file = new File("Angka.txt");
      Scanner fileMasukan = new Scanner(file);

      //Membaca semua nilai dari file
      //dan menghitung totalnya
      while (fileMasukan.hasNext())
      {
         //Membaca sebuah nilai dari file
         double angka = fileMasukan.nextDouble();

         //Menambahkan angka pada jum
         jum = jum + angka;
      }

      //Menutup file
      fileMasukan.close();

      //Menampilkan penjumlahan atas nilai-nilai
      System.out.println("Penjumlahan atas nilai-nilai di dalam " +
                         "Angka.txt adalah " + jum);
   }
}