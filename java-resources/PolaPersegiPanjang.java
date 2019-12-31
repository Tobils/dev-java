import java.util.Scanner;

/**
 Program ini menampilkan sebuah pola persegi-panjang
 yang terdiri-dari asterisk-asterisk.
 */

public class PolaPersegiPanjang
{
   public static void main(String[] args)
   {
      int baris, kol;

      //Menciptakan sebuah objek Scanner untuk masukan papantik
      Scanner keyboard = new Scanner(System.in);

      //Membaca banyak baris dan banyak kolom
      System.out.print("Berapa banyak baris? ");
      baris = keyboard.nextInt();
      System.out.print("Berapa banyak kolom? ");
      kol = keyboard.nextInt();

      for (int r = 0; r < baris; r++)
      {
         for (int c = 0; c < kol; c++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}