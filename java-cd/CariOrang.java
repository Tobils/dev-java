import java.util.Scanner;

/**
 Program ini menggunakan metode startsWith untuk melakukan pencarian
 menggunakan substring.
*/

public class CariOrang
{
   public static void main(String[] args)
   {
      String cari; // To hold a lookup string

      // Menciptakan sebuah array yang memuat nama-nama
      String[] orang = { "Chanty Wili", "David Jono",
                          "David Jentor", "Rusdi Pinto",
                          "Rusdiana Cianta", "Setnov Charli",
                          "Smanti Hendri", "Smitra Kris",
                          "Smitri Branto", "Wili Jondri" };

      // Menciptakan sebuah objek Scanner untuk masukan user
      Scanner keyboard = new Scanner(System.in);

      // Mendapatkan sepotong nama untuk dicari
      System.out.print("Masukkan beberapa karakter pertama dari " +
         "nama orang yang akan dicari: ");
      cari = keyboard.nextLine();

      // Menampilkan semua nama yang diawali dengan
      // substring yang dimasukkan oleh user.
      System.out.println("Berikut adalah nama-nama yang sesuai:");
      for (String org : orang)
      {
         if (org.startsWith(cari))
            System.out.println(org);
      }
   }
}