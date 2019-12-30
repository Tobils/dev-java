import java.util.Random;

/**
 Program ini mensimulasikan 10 pelemparan koin
 */

public class LemparKoin
{
   public static void main(String[] args)
   {
      //Menciptakan sebuah objek Random untuk membangkitkan nilai acak 
      Random acak = new Random();

      //Mensimulasikan pelemparan koin
      for (int cacah = 0; cacah < 10; cacah++)
      {
         if (acak.nextInt(2) == 0)
            System.out.println("Ekor");
         else
            System.out.println("Kepala");
      }
   }
} 