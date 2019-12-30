import javax.swing.JOptionPane; //Diperlukan untuk JOptionPane

/**
 Program ini mendemonstrasikan statemen if
 */

public class SkorRerata
{
   public static void main(String[] args)
   {
      double skor1; 	//Untuk memuat skor #1
      double skor2; 	//Untuk memuat skor #2
      double skor3; 	//Untuk memuat skor #3
      double rerata; 	//Untuk memuat skor rerata
      String masukan; 	//Untuk memuat masukan user

      //Membaca skor pertama
      masukan = JOptionPane.showInputDialog("Masukkan skor #1:");
      skor1 = Double.parseDouble(masukan);

      //Membaca skor kedua
      masukan = JOptionPane.showInputDialog("Masukkan skor #2:");
      skor2 = Double.parseDouble(masukan);

      //Membaca skor ketiga
      masukan = JOptionPane.showInputDialog("Masukkan skor #3:");
      skor3 = Double.parseDouble(masukan);

      //Menghitung skor rerata
      rerata = (skor1 + skor2 + skor3) / 3.0;

      //Menampilkan skor rerata
      JOptionPane.showMessageDialog(null,
         "Rerata adalah " + rerata);

      //Jika skor lebih besar dari 95, maka user
      //akan diberitahu dan diselamati
      if (rerata > 95)
         JOptionPane.showMessageDialog(null,
           "Selamat, Anda mendapat skor tinggi!");

      System.exit(0);
    }
}