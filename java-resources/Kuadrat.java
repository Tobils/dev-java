/**
 Program ini mendemonstrasikan loop for
 */

public class Kuadrat
{
   public static void main(String[] args)
   {
      int angka; //Variabel kendali loop

      System.out.println("Angka  Angka Terkuadrat");
      System.out.println("------------------------");

      for (angka = 1; angka <= 10; angka++)
      {
         System.out.println(angka + "\t\t" +
                            angka * angka);
      }
   }
}