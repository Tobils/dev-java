import javax.swing.JOptionPane;

/**
 Program ini mengumpulan nilai-nilai penjualan dalam seminggu.
 Ia menggunakan kelas DataPenjualan untuk menampilkan total,
 rerata, nilai tertinggi, dan nilai terendah penjualan.
 */

public class Penjualan
{
   public static void main(String[] args)
   {
      final int SATU_MINGGU = 7; //Banyak elemen

      //Menciptakan sebuah array untuk memuat nilai penjualan dalam seminggu
      double[] penjualan = new double[SATU_MINGGU];

      //Membaca nilai-nilai penjualan
      getNilai(penjualan);

      //Menciptakan sebuah objek DataPenjualan, yang diinisialisasi
      //dengan nilai-nilai penjualan.
      DataPenjualan minggu = new DataPenjualan(penjualan);

      // Display the total, average, highest, and lowest
      // penjualan amounts for the minggu.
      JOptionPane.showMessageDialog(null,
           String.format("Total penjualan adalah Rp. %,.2f\n" +
           "Rerata penjualan adalah Rp. %,.2f\n" +
           "Penjualan tertinggi adalah Rp. %,.2f\n" +
           "Penjualan terendah adalah Rp. %,.2f",
           minggu.getTotal(),
           minggu.getRerata(),
           minggu.getTertinggi(),
           minggu.getTerendah()));

      System.exit(0);
   }

   /**
    Metode getNilai meminta user untuk memasukkan nilai
    penjualan untuk tiap elemen array.
    @param array Array tempat penyimpanan.
   */

   private static void getNilai(double[] array)
   {
      String masukan; //Untuk memuat masukan user
      
      //Membaca penjualan untuk tiap hari dalam seminggu
      for (int i = 0; i < array.length; i++)
      {
         masukan = JOptionPane.showInputDialog(
                   "Masukkan penjualan untuk hari ke-" + (i + 1) + ".");
         array[i] = Double.parseDouble(masukan);
      }
   }
}