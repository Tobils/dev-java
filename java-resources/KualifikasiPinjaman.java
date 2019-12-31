import javax.swing.JOptionPane;   //Diperlukan untuk kelas JOptionPane

/**
 Program ini mendemonstrasikan statemen if bersarang
 */

public class KualifikasiPinjaman
{
   public static void main(String[] args)
   {
      double gaji; 			//Gaji tahunan
      double tahunKerja; 	//Pengalaman kerja
      String masukan; 		//Untuk memuat string masukan

      //Membaca gaji tahunan
      masukan = JOptionPane.showInputDialog("Masukkan " +
                 "gaji Anda dalam setahun.");
      gaji = Double.parseDouble(masukan);

      //Membaca banyak tahun kerja
      masukan = JOptionPane.showInputDialog("Masukkan jumlah " +
              "tahun kerja pada pekerjaan Anda saat ini.");
      tahunKerja = Double.parseDouble(masukan);

      //Menentukan apakah user berkualifikasi menerima pinjaman
      if (gaji >= 30000000)
      {
         if (tahunKerja >= 2)
         {
            JOptionPane.showMessageDialog(null, "Anda berkualifikasi " +
                "untuk pinjaman ini.");
         }
         else
         {
            JOptionPane.showMessageDialog(null, "Anda harus sedikitnya " +
               "memiliki dua tahun pengalaman kerja " +
               "pada pekerjaan ini.");
         }
      }
      else
      {
         JOptionPane.showMessageDialog(null, "Anda harus " +
             "sedikitnya bergaji Rp. 30 juta pertahun.");
      }

      System.exit(0);
    }
}