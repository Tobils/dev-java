import java.util.Scanner;

/**
 Program ini menampilkan pola anak-tangga
 */

public class PolaAnakTangga
{
   public static void main(String[] args)
   {
      final int NUM_STEPS = 6;

      for (int r = 0; r < NUM_STEPS; r++)
      {
         for (int c = 0; c < r; c++)
         {
            System.out.print(" ");
         }
         System.out.println("#");
      }
   }
}