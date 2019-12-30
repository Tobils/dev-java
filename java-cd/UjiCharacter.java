import javax.swing.JOptionPane;

/**
 Program ini mendemonstrasikan beberapa metode statis
 dari kelas Character.
*/

public class UjiCharacter
{
   public static void main(String[] args)
   {
      String masukan; 	// Memuat masukan user
      char ch; 			// Memuat satu karakter

      // Membaca sebuah karakter dari user dan menyimpannya
      // ke dalam variabel ch.
      masukan = JOptionPane.showInputDialog("Masukkan " +
              "sembarang satu karakter.");
      ch = masukan.charAt(0);

      // Menguji karakter
      if (Character.isLetter(ch))
      {
         JOptionPane.showMessageDialog(null,
            "Ini adalah sebuah huruf.");
      }

      if (Character.isDigit(ch))
      {
         JOptionPane.showMessageDialog(null,
            "Ini adalah sebuah dijit.");
      }

      if (Character.isLowerCase(ch))
      {
         JOptionPane.showMessageDialog(null,
            "Ini adalah sebuah huruf kecil.");
      }

      if (Character.isUpperCase(ch))
      {
         JOptionPane.showMessageDialog(null,
            "Ini adalah sebuah huruf besar.");
      }

      if (Character.isSpaceChar(ch))
      {
         JOptionPane.showMessageDialog(null,
            "Ini adalah sebuah spasi.");
      }

      if (Character.isWhitespace(ch))
      {
         JOptionPane.showMessageDialog(null,
            "Ini adalah sebuah karakter spasi-putih.");
      }

      System.exit(0);
   }
}