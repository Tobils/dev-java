import javax.swing.JOptionPane;

/**
 Program ini menghitung banyak tim soccer yang
 dapat diciptakan dari sejumlah pemain yang
 tersedia. Validasi masukan didemonstrasikan
 dengan loop while.
 */

public class TimSoccer
{
   public static void main(String[] args)
   {
      final int PEMAIN_MIN = 9; 	//Banyak pemain min per tim
      final int PEMAIN_MAKS = 15; 	//Banyak pemain maks per tim
      int pemain; 					//Banyak pemain yang tersedia
      int ukuranTim; 				//Jumlah pemain per tim
      int tim; 						//Jumlah tim
      int sisaPemain; 				//Jumlah sisa pemain
      String masukan; 				//Untuk memuat masukan user

      //Membaca banyak pemain per tim
      masukan = JOptionPane.showInputDialog("Masukkan banyak " +
                                          "pemain per tim.");
      ukuranTim = Integer.parseInt(masukan);

      //Memvalidasi nilai yang dimasukkan
      while (ukuranTim < PEMAIN_MIN || ukuranTim > PEMAIN_MAKS)
      {
         masukan = JOptionPane.showInputDialog("Nilai harus " +
                                   "sedikitnya " + PEMAIN_MIN +
                                   " dan tidak lebih dari " +
                                   PEMAIN_MAKS + ".\n Masukkan " +
                                   "banyak pemain.");
         ukuranTim = Integer.parseInt(masukan);
      }

      //Membaca banyak pemain tersedia
      masukan = JOptionPane.showInputDialog("Masukkan banyak " +
                                   "pemain yang tersedia.");
      pemain = Integer.parseInt(masukan);

      //Memvalidasi nilai yang dimasukkan
      while (pemain < 0)
      {
         masukan = JOptionPane.showInputDialog("Masukkan 0 atau " +
                                               "lebih besar.");
         pemain = Integer.parseInt(masukan);
      }

      //Menghitung banyak tim
      tim = pemain / ukuranTim;

      //Menghitung banyak sisa pemain
      sisaPemain = pemain % ukuranTim;

      //Menampilkan hasil
      JOptionPane.showMessageDialog(null, "Terdapat sebantak " +
                                    tim + " tim dengan " +
                                    sisaPemain +
                                    " sisa pemain.");
      System.exit(0);
   }
}