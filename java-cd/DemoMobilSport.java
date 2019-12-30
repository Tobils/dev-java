/**
 Program ini mendemonstrasikan kelas MobilSport.
*/

public class DemoMobilSport
{
   public static void main(String[] args)
   {
      // Menciptakan sebuah objek MobilSport.
      MobilSport mobilBaruAnda = new MobilSport(JenisMobil.PORSCHE,
                                           WarnaMobil.MERAH, 100000);

      // Menampilkan nilai-nilai dari objek.
      System.out.println(mobilBaruAnda);
   }
}