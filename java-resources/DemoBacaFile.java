import java.util.Scanner; 	//Diperlukan untuk kelas Scanner
import java.io.*; 			//Diperlukan untuk kelas File dan IOException

/**
 Program ini membaca data dari sebuah file
 */

public class DemoBacaFile
{
   public static void main(String[] args) throws IOException
   {
      //Menciptakan sebuah objek Scanner untuk masukan papantik 
      Scanner keyboard = new Scanner(System.in);

      //Membaca nama file
      System.out.print("Masukkan nama file: ");
      String namaFile = keyboard.nextLine();

      //Membuka file
      File file = new File(namaFile);
      Scanner fileMasukan = new Scanner(file);

      //Membaca baris-baris dari file sampai tidak ada lagi
      while (fileMasukan.hasNext())
      {
         //Membaca nama berikutnya
         String namaTeman = fileMasukan.nextLine();

         //Menampilkan nama yang dibaca
         System.out.println(namaTeman);
      }

      //Menutup file     
      fileMasukan.close(); 
   }
}