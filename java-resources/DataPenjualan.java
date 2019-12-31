/**
 Kelas ini menjejak nilai-nilai penjualan untuk sejumlah hari
 di dalam suatu array dan menyediakan metode-metode untuk menghitung
 total dan rerata penjualan, dan nilai penjualan tertinggi dan
 nilai penjualan terendah.
 */

public class DataPenjualan
{
   private double[] penjualan; //Data penjualan

   /**
    Konstruktor menyalin elemen-elemen di dalam
    sebuah array ke array penjualan.
    @param s Array yang akan disalin.
   */

   public DataPenjualan(double[] s)
   {
      //Menciptakan sebuah array dengan panjang s.
      penjualan = new double[s.length];

      //Menyalin elemen-elemen dari s ke penjualan.
      for (int indeks = 0; indeks < s.length; indeks++)
         penjualan[indeks] = s[indeks];
   }

   /**
    Metode getTotal 
    @return Total dari elemen-elemen di dalam
    array penjualan.
   */

   public double getTotal()
   {
      double total = 0.0; //Akumulator

      //Mengakumulasi penjumlahan atas elemen-elemen
      //di dalam array penjualan.
      for (int indeks = 0; indeks < penjualan.length; indeks++)
         total += penjualan[indeks];

      //Menghasilkan total
      return total;
   }

   /**
    Metode getRerata 
    @return Rerata dari elemen-elemen di dalam
     array penjualan.
   */

   public double getRerata()
   {
      return getTotal() / penjualan.length;
   }

   /**
    Metode getTertinggi 
    @return Nilai tertinggi disimpan di dalam
     array penjualan.
   */

   public double getTertinggi()
   {
      double tertinggi = penjualan[0];

      for (int indeks = 1; indeks < penjualan.length; indeks++)
      {
         if (penjualan[indeks] > tertinggi)
            tertinggi = penjualan[indeks];
      }

      return tertinggi;
   }

   /**
    Metode getTerendah 
    @return Nilai terendah yang disimpan
    di dalam array penjualan.
   */

   public double getTerendah()
   {
      double terendah = penjualan[0];

      for (int indeks = 1; indeks < penjualan.length; indeks++)
      {
         if (penjualan[indeks] < terendah)
            terendah = penjualan[indeks];
      }

      return terendah;
   }
}