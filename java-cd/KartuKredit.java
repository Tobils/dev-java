import javax.swing.JOptionPane; 

/**
 Program ini menggunakan dua metode void.
 */

public class KartuKredit
{
   public static void main(String[] args)
   {
      double gaji; 			//Gaji per tahun
      int peringkatKredit; 	//Peringkat kredit
      String masukan; 		//Untuk memuat masukan user

      //Membaca gaji per tahun dari user
      masukan = JOptionPane.showInputDialog("Berapakah " +
              "gaji per tahun Anda? (dalam juta)");
      gaji = Double.parseDouble(masukan);

      //Membaca peringkat kredit user (1 sampai 10)
      masukan = JOptionPane.showInputDialog("Dengan skala " +
              "1 sampai 10, berapakah peringkat kredit Anda?\n" +
              "(10 = sangat baik, 1 = sangat buruk)");
      peringkatKredit = Integer.parseInt(masukan);

     //Menentukan apakah user berkualifikasi
     if (gaji >= 200 && peringkatKredit >= 7)
        kualifikasi();
     else
        tidakKualifikasi();

      System.exit(0);
   }

   /**
    Metode kualifikasi memberitahu user bahwa ia
    berkualifikasi untuk kartu kredit.
   */

   public static void kualifikasi()
   {
      JOptionPane.showMessageDialog(null, "Selamat! " +
         "Anda berkualifikasi untuk kartu kredit!");
   }

   /**
    Metode tidakKualifikasi memberitahu user bahwa ia tidak
    berkualifikasi untuk kartu kredit.
   */

   public static void tidakKualifikasi()
   {
      JOptionPane.showMessageDialog(null, "Maaf. Anda " +
         "tidak berkualifikasi untuk kartu kredit.");
   }
}