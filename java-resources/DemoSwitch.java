import java.util.Scanner;   //Diperlukan untuk kelas Scanner

/**
 Program ini mendemonstrasikan statemen switch
 */

public class DemoSwitch
{
   public static void main(String[] args)
   {
      int angka; //Sebuah nilai yang dimasukkan oleh user

      //Menciptakan sebuah objek Scanner untuk membaca masukan papantik
      Scanner keyboard = new Scanner(System.in);

      //Membaca angka 1, 2, atau 3 dari user
      System.out.print("Masukkan 1, 2, atau 3: ");
      angka = keyboard.nextInt();

      //Menentukan nilai yang dimasukkan
      switch (angka)
      {
         case 1:
            System.out.println("Anda memasukkan 1.");
            break;
         case 2:
            System.out.println("Anda memasukkan 2.");
            break;
         case 3:
            System.out.println("Anda memasukkan 3.");
            break;
         default:
            System.out.println("Yang dimasukkan bukan 1, 2, atau 3!");
      }
   }
}