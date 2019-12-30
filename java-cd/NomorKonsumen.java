import javax.swing.JOptionPane;

/**
 Program ini menguji sebuah nomor untuk memverifikasi
 apakah nomor itu sesuai dengan format yang diinginkan.
*/

public class NomorKonsumen
{
   public static void main(String[] args)
   {
      String masukan; // Memuat masukan user

      // Membaca nomor konsumen
      masukan = JOptionPane.showInputDialog("Masukkan " +
         "sebuah nomor konsumen dalam format LLLNNNN\n" +
         "(LLL = huruf dan NNNN = dijit)");

      // Memvalidasi masukan
      if (apaValid(masukan))
      {
         JOptionPane.showMessageDialog(null,
            "Ini adalah nomor konsumen yang valid.");
      }
      else
      {
         JOptionPane.showMessageDialog(null,
            "Ini bukanlah format sesuai dari sebuah " +
            "nomor konsumen.\nBerikut adalah sebuah " +
            "contohnya: ABC1234");
      }

      System.exit(0);
   }

   /**
   Metode apaValid menentukan apakah sebuah
   String merupakan sebuah nomor konsumen yang valid.
   Jika ya, menghasilkan true.
   @param noKonsumen String yang akan diuji.
   @return true jika valid, sebaliknya false.
   */

   private static boolean apaValid(String noKonsumen)
   {
      boolean baik = true;  // Bendera
      int i = 0; 			// Variabel kendali

      // Menguji panjang
      if (noKonsumen.length() != 7)
         baik = false;

      // Menguji tiga karakter pertama apakah huruf
      while (baik && i < 3)
      {
         if (!Character.isLetter(noKonsumen.charAt(i)))
            baik = false;
         i++;
      }

      // Menguji empat karakter terakhir apakah dijit
      while (baik && i < 7)
      {
         if (!Character.isDigit(noKonsumen.charAt(i)))
            baik = false;
         i++;
     }

      return baik;
   }
}