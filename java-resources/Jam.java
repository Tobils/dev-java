/**
 Program ini menggunakan dua loop bersarang untuk mensimulasikan jam
 */

public class Jam
{
   public static void main(String[] args)
   {
      //Mensimulasikan jam
      for (int jam = 1; jam <= 12; jam++)
      {
         for (int menit = 0; menit <= 59; menit++)
         {
            for (int detik = 0; detik <= 59; detik++)
            {
               System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
            }
         }
      }
   }
}