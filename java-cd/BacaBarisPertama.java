import java.util.Scanner; 	//Diperlukan untuk kelas Scanner
import java.io.*; 			//Diperlukan untuk kelas File dan IOException

/**
 Program ini membaca baris pertama dari sebuah file
 */

public class BacaBarisPertama
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

      //Membaca baris pertama dari file
      String baris = fileMasukan.nextLine();

      //Menampilkan baris data
      System.out.println("Baris pertama di dalam file adalah:");
      System.out.println(baris);

      //Menutup file
      fileMasukan.close();
   }
}