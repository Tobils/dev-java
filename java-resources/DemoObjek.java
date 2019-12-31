import java.util.Scanner; 	//Diperlukan untuk kelas Scanner
import java.util.Random; 	//Diperlukan untuk kelas Random
import java.io.*; 			//Diperlukan untuk kelas-kelas I/O

/**
 Program ini menuliskan nilai-nilai acak ke dalam suatu file
 */

public class DemoObjek
{
   public static void main(String[] args) throws IOException
   {
      int banyakAcak; 	//Banyak nilai acak
      int angka; 		//Untuk memuat sebuah nilai acak

      //Menciptakan sebuah objek Scanner untuk masukan papantik
      Scanner keyboard = new Scanner(System.in);

      //Menciptakan sebuah objek Random untuk membangkitkan nilai-nilai acak
      Random acak = new Random();

      //Menciptakan sebuah objek PrintWriter untuk membuka file
      PrintWriter fileKeluaran = new PrintWriter("angka.txt");

      //Menghasilkan banyak nilai acak yang dituliskan
      System.out.print("Berapa banyak nilai acak yang harus dituliskan? ");
      banyakAcak = keyboard.nextInt();

      //Menuliskan nilai-nilai acak ke dalam file
      for (int cacah = 0; cacah < banyakAcak; cacah++)
      {
         //Membangkitkan suatu integer acak
         angka = acak.nextInt();

         //Menuliskan integer acak ke dalam file
         fileKeluaran.println(angka);
      }

      //Menutup file
      fileKeluaran.close();
      System.out.println("Selesai");
   }
}