import java.util.Scanner; 	//Diperlukan untuk kelas Scanner
import java.io.*; 			//Diperlukan untuk kelas-kelas IO

/**
 Program ini menuliskan data ke dalam sebuah file
 */

public class DemoTulisFile
{
   public static void main(String[] args) throws IOException
   {
      String namaFile; 		//Nama file
      String namaTeman; 	//Nama teman
      int banyakTeman; 		//Banyak teman

      //Menciptakan sebuah objek Scanner untuk masukan papantin
      Scanner keyboard = new Scanner(System.in);

      //Membaca banyak teman
      System.out.print("Berapa banyak teman Anda? ");
      banyakTeman = keyboard.nextInt();

      //Menghapus karaker baris-bari yang tersisa
      keyboard.nextLine();

      //Membaca nama file
      System.out.print("Masukkan nama file: ");
      namaFile = keyboard.nextLine();

      //Membuka file
      PrintWriter fileKeluaran = new PrintWriter(namaFile);

      //Membaca data dan menuliskannya ke dalam file
      for (int i = 1; i <= banyakTeman; i++)
      {
         //Membaca nama teman
         System.out.print("Masukkan nama teman " +
                          "nomor ke-" + i + ": ");
         namaTeman = keyboard.nextLine();

         //Menuliskan nama ke dalam file
         fileKeluaran.println(namaTeman);
      }

      //Menutup file
      fileKeluaran.close();
      System.out.println("Data telah dituliskan ke dalam file.");
   }
}