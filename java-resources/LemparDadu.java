import java.util.Scanner;
import java.util.Random;

/**
 Program ini mensimulasikan pelemparan dadu
 */

public class LemparDadu
{
   public static void main(String[] args)
   {
      String lagi = "y"; 	//Untuk mengendalikan loop
      int dadu1; 			//Untuk memuat nilai dari dadu #1
      int dadu2; 			//Untuk memuat nilai dari dadu #2

      //Menciptakan sebuah objek Scanner untuk masukan papantik
      Scanner keyboard = new Scanner(System.in);

      //Menciptakan sebuah objek Random untuk membangkitkan nilai acak
      Random acak = new Random();

      //Mensimulasikan pelemparan dadu
      while (lagi.equalsIgnoreCase("y"))
      {
          System.out.println("Melempar dadu...");
          dadu1 = acak.nextInt(6) + 1;
          dadu2 = acak.nextInt(6) + 1;
          System.out.println("Nilai-nilainya adalah:");
          System.out.println(dadu1 + " " + dadu2);

          System.out.print("Lempar dadu lagi (y = ya)? ");
          lagi = keyboard.nextLine();  
      }
   }
}   