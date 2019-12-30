/**
 Kelas BeliSaham merepresentasikan pembalian saham.
*/

public class BeliSaham
{
   private Saham saham; 		// Saham yang dibeli
   private int banyakSaham; 	// Banyak saham yang dimiliki

   /**
   Konstruktor
   @param objekSaham Saham yang akan dibeli.
   @param bykSaham Banyak saham yang dimiliki.
   */

   public BeliSaham(Saham objekSaham, int bykSaham)
   {
      // Menciptakan sebuah salinan dari objek yang
      // direferensi oleh objekSaham.
      saham = new Saham(objekSaham);
      banyakSaham = bykSaham;
   }

   /**
   Metode getSaham
   @return Sebuah salinan dari objek Saham untuk saham
   yang sedang dibeli.
   */

   public Saham getSaham()
   {
      // Menghasilkan sebuah salinan dari objek yang direferensi oleh saham
      return new Saham(saham);
   }

   /**
   Metode getSaham
   @return Banyak saham yang sedang dibeli
   */

   public int getBanyakSaham()
   {
      return banyakSaham;
   }

   /**
   Metode getBiaya
   @return Biaya dari pembelian saham
   */

   public double getBiaya()
   {
      return banyakSaham * saham.getHargaSaham();
   }
}