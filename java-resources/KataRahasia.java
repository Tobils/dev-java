import java.util.Scanner;  //Diperlukan untuk kelas Scanner

/**
 Program ini mendemonstrasikan perbandingan string case-insensitive
 */

public class KataRahasia
{
   public static void main(String[] args)
   {
      String masukan; //Untuk memuat masukan user

      //Menciptakan sebuah objek Scanner untuk masukan keyboard
      Scanner keyboard = new Scanner(System.in);

      //Meminta user untuk memasukkan kata rahasia
      System.out.print("Masukkan kata rahasia: ");
      masukan = keyboard.nextLine();

      //Menentukan apakah user telah memasukkan kata rahasia.
      if (masukan.equalsIgnoreCase("JAKARTA"))
      {
         System.out.println("Selamat! Anda mengetahui " +
                            "kata rahasia!");
      }
      else
      {
         System.out.println("Maaf, itu bukan lah " +
                            "kata rahasia!");
      }
    }
}