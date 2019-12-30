import javax.swing.JOptionPane;

/**
 Program ini menghitung total berjalan
 */

public class TotalPenjualan
{
   public static void main(String[] args)
   {
      int hari; 				//Banyak hari
      double penjualan; 		//Nilai penjualan untuk hari tertentu
      double totalPenjualan; 	//Akumulator
      String masukan; 			//Untuk memuat masukan user

      //Membaca banyak hari
      masukan = JOptionPane.showInputDialog("Untuk berapa hari " +
                "Anda menghitung total penjualan?");
      hari = Integer.parseInt(masukan);

      //Menetapkan akumulator menjadi 0.
      totalPenjualan = 0.0;

      //Membaca tiap nilai penjualan dan menghitung total berjalan
      for (int cacah = 1; cacah <= hari; cacah++)
      {
         masukan = JOptionPane.showInputDialog("Masukka nilai penjualan " +
                   "untuk hari " + cacah + ": ");
         penjualan = Double.parseDouble(masukan);
         totalPenjualan += penjualan; //Menjumlahkan penjualan pada totalPenjualan
      }

      //Menampilkan total penjualan
      JOptionPane.showMessageDialog(null,
      String.format("Total penjualan sebesar Rp. %,.2f", totalPenjualan));

      System.exit(0);
   }
}