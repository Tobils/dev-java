/**
 Program ini mendemonstrasikan pemanggilan metode hierarkis
 */

public class DalamDanLebihDalam
{
   public static void main(String[] args)
   {
      System.out.println("Saya mulai dari main.");
      dalam();
      System.out.println("Sekarang, Saya kembali ke main.");
   }

   /**
    Metode dalam menampilkan sebuah pesan dan kemudian memanggil
    metode lebihDalam.
   */

   public static void dalam()
   {
      System.out.println("Saya sekarang berada di dalam metode dalam.");
      lebihDalam();
      System.out.println("Sekarang, Saya kembali ke dalam metode dalam.");
   }

   /**
    Metode lebihDalam menampilkan sebuah pesan
   */

   public static void lebihDalam()
   {
      System.out.println("Saya sekarang berada di dalam metode lebihDalam.");
   }
}