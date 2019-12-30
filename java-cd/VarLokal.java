/**
 Program ini mendemonstrasikan bahwa dua metode dapat mempunyai
 variabel lokal dengan nama sama.
 */

public class VarLokal
{
   public static void main(String[] args)
   {
      sumut();
      sumbar();
  }

   /**
    Metode sumut memiliki sebuah variabel lokal dengan nama burung.
   */

   public static void sumut()
   {
      int burung = 5000;

      System.out.println("Di sumut ada " +
                          burung + " burung.");
   }

   /**
    Metode sumbar memiliki sebuah variabel lokal dengan nama burung.
   */
   public static void sumbar()
   {
      int burung = 3500;

      System.out.println("Di sumbar ada " +
                         burung + " burung.");
   }
} 