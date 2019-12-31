import java.util.Scanner; 			//Untuk kelas Scanner
import java.io.*; 					//Untuk kelas-kelas I/O
import javax.swing.JOptionPane; 	//Untuk kelas JOptionPane 

/**
 Program ini membuka sebuah file yang memuat nilai
 penjualan untuk 30 hari. Ia menghitung dan menampilkan
 total penjualan dan rerata penjualan harian.
*/

public class LaporanPenjualan
{
   public static void main(String[] args) throws IOException
   {
      final int BANYAK_HARI = 30; 	//Banyak hari penjualan
      String namaFile; 				//Nama file yang akan dibuka
      double totalPenjualan; 		//Total penjualan 
      double rerataPenjualan; 		//Rerata penjualan harian

      //Membaca nama file
      namaFile = bacaNamaFile();

      //Menghitung total penjualan dari file.
      totalPenjualan = hitungTotalPenjualan(namaFile);

      //Menghitung rerata penjualan harian
      rerataPenjualan = totalPenjualan / BANYAK_HARI;

      //Menampilkan total dan rerata penjualan
      tampilHasil(totalPenjualan, rerataPenjualan);

      System.exit(0);
   }

   /**
    Metode bacaNamaFile meminta user untuk memasukkan
    nama file yang akan dibuka.
    @return Sebuah referensi ke sebuah objek String yang
    memuat nama file.
   */

   public static String bacaNamaFile()
   {
      String file; // To hold the file name

      //Meminta user untuk memasukkan nama file
      file = JOptionPane.showInputDialog(
             "Masukkan nama file\n" +
             "yang memuat 30 hari penjualan.");

      //Menghasilkan nama file
      return file;
   }

   /**
    Metode hitungTotalPenjualan membuka sebuah file dan
    membaca nilai penjualan harian, dan mengakumulasikan
    total penjualan. Nilai total dijadikan nilai balik.
    @param namaFile Nama dari file yang akan dibuka.
    @return Total penjualan.
   */

   public static double hitungTotalPenjualan(String namaFile) throws IOException
   {
      double total = 0.0; 	//Akumulator
      double penjualan; 	//Penjualan harian

      //Membuka file
      File file = new File(namaFile);
      Scanner fileMasukan = new Scanner(file);

      //Loop ini memproses baris-baris data yang dibaca dari file,
      //sampai akhir file dijumpai.
      while (fileMasukan.hasNext())
      {
         //Membaca sebuah double dari file
         penjualan = fileMasukan.nextDouble();

         //Menjumlahkan penjualan pada nilai yang ada pada total.
         total += penjualan;
      }

      //Menutup file
      fileMasukan.close();

      //Menghasilkan total penjualan
      return total;
   }

   /**
    Metode tampilHasil menampilkan total penjualan dan
    rerata penjualan harian.
    @param total Total penjualan.
    @param rerata Rerata penjualan harian.
   */

   public static void tampilHasil(double total, double rerata)
   {
      //Menampilkan total penjualan dan rerata penjualan terformat.
      JOptionPane.showMessageDialog(null,
         String.format("Total penjualan untuk periode ini adalah Rp. %,.2f\n" +
         "Rerata penjualan harian adalah Rp. %,.2f",
         total, rerata));
   }
}