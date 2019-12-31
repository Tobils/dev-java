import javax.swing.JOptionPane;

/**
 Program ini menampilkan banyak huruf, dijit,
 dan karakter spasi-putih di dalam sebuah string.
*/

public class AnalisisString
{
   public static void main(String [] args)
   {
      String masukan; 		// Memuat masukan
      char[] array; 		// Array untuk masukan
      int huruf = 0; 		// Banyak huruf
      int dijit = 0; 		// Banyak dijit
      int spasiPutih = 0; 	// Banyak spasi-putih

      // Membaca sebuah string dari user
      masukan = JOptionPane.showInputDialog("Masukkan " +
                "sebuah string: ");

      // Mengkonversi string menjadi sebuah array char
      array = masukan.toCharArray();

      // Menganalisa karakter-karakter
      for (int i = 0; i < array.length; i++)
      {
         if (Character.isLetter(array[i]))
            huruf++;
         else if (Character.isDigit(array[i]))
            dijit++;
         else if (Character.isWhitespace(array[i]))
            spasiPutih++;
      }

      // Menampilkan hasil
      JOptionPane.showMessageDialog(null,
         "String ini memuat " +
         huruf + " huruf, " +
         dijit + " dijit, dan " +
         spasiPutih +
         " karakter spasi-putih.");

      System.exit(0);
   }
}