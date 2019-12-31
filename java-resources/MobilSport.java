/**
 Kelas MobilSport
*/

public class MobilSport
{
    private JenisMobil buatan; 	// Buatan mobil
    private WarnaMobil warna; 	// Warna mobil
    private double harga; 		// Harga mobil

   /**
   Konstruktor menginisialisasi buatan, warna, dan
   buatan mobil.
   @param aBuatan Buatan mobil.
   @param aWarna Warna mobil.
   @param aHarga Harga mobil.
   */

   public MobilSport(JenisMobil aBuatan, WarnaMobil aWarna, double aHarga)
   {
      buatan = aBuatan;
      warna = aWarna;
      harga = aHarga;
   }

   /**
   Metode getBuatan
   @return Buatan mobil.
   */

   public JenisMobil getBuatan()
   {
      return buatan;
   }

   /**
   Metode getWarna
   @return Warna mobil.
   */

   public WarnaMobil getWarna()
   {
      return warna;
   }

   /**
   Metode getHarga
   @return Harga mobil.
   */

   public double getHarga()
   {
      return harga;
   }

   /**
   Metode toString 
   @return Sebuah string yang mengindikasikan buatan mobil,
   warna, dan harga.
   */

   public String toString()
   {
      // Menciptakan sebuah string yang merepresentasikan objek
      String str = String.format("Buatan: %s\nWarna: %s\nHarga: Rp. %,.2f",
                                 buatan, warna, harga);

      // Menghasilkan string
      return str;
   }
}