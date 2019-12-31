import java.util.Scanner;

 /**
 Program menampilkan pola segitiga
 */

public class PolaSegitiga
{
   public static void main(String[] args)
   {
      final int BASIS_UKURAN = 8;

      for (int r = 0; r < BASIS_UKURAN; r++)
      {
         for (int c = 0; c < (r + 1); c++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}