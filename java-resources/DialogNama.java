import javax.swing.JOptionPane;

/**
 Program ini mendemonstrasikan penggunaan dialog-dialog
 menggunakan kelas JOptionPane.
*/

public class DialogNama
{
   public static void main(String[] args)
   {
      String namaDepan; 	//Nama depan user
      String namaTengah; 	//Nama tengah user
      String namaBelakang; 	//Nama belakang user

      //Membaca nama depan user
      namaDepan =
         JOptionPane.showInputDialog("Apa " +
            "nama depan Anda? ");

      //Membaca nama tengah user
      namaTengah =
         JOptionPane.showInputDialog("Apa " +
            "nama tengah Anda? ");

      //Membaca nama belakang user
      namaBelakang =
         JOptionPane.showInputDialog("Apa " +
            "nama belakang Anda? ");

      //Menampilkan salah
      JOptionPane.showMessageDialog(null, "Halo " +
         namaDepan + " " + namaTengah +
         " " + namaBelakang);
      System.exit(0);
   }
}