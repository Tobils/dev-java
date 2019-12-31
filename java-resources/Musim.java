import java.util.Scanner;  //Diperlukan untuk kelas Scanner

/**
 Program ini menerjemahkan nama musim dalam bahasa Inggris 
 menjadi bahasa Indonesia.
 */

public class Musim
{
   public static void main(String[] args)
   {
      String masukan;

      //Menciptakan sebuah objek Scanner untuk masukan papantik
      Scanner keyboard = new Scanner(System.in);

      //Membaca masukan dari user
      System.out.print("Masukkan nama musim (dalam bahasa Inggris): ");
      masukan = keyboard.nextLine();

      //Menerjemahkan ke bahasa Indonesia
      switch (masukan)
      {
         case "spring":
            System.out.println("musim semi");
            break;
         case "summer":
            System.out.println("musim panas");
            break;
         case "autumn":
         case "fall":
            System.out.println("musim gugur");
            break;
         case "winter":
            System.out.println("musim dingin");
            break;
         default:
            System.out.println("Silahkan masukkan salah satu kata ini:\n"
               + "spring, summer, autumn, fall, or winter.");
      }
   }
}