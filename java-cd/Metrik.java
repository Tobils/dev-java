/**
 Kelas ini mendemonstrasikan metode statis.
 */

public class Metrik
{
   /**
    Metode milKeKilometer mengkonversi
    sebuah jarak dalam mil menjadi kilometer.
    @param m Jarak dalam mil.
    @return Jarak dalam kilometer.
   */

   public static double milKeKilometer(double m)
   {
      return m * 1.609;
   }

   /**
    Metode kilometerKeMil mengkonversi
    sebuah jarak dalam kilometer menjadi mil.
    @param k Jarak dalam kilometer.
    @return Jarak dalam mil.
   */

   public static double kilometerKeMil(double k)
   {
      return k / 1.609;
   }
}