import javax.swing.JOptionPane;  //Diperlukan untuk JOptionPane

/**
 Program ini mendemonstrasikan bagaimana variabel-variabel dapat
 dideklarasikan di sejumlah lokasi di dalam suatu program.
*/

public class SkopVariabel
{
   public static void main(String[] args)
   {
      //Membaca nama depan user
      String namaDepan;
      namaDepan = JOptionPane.showInputDialog("Masukkan " +
                  "nama depan Anda.");

      //Membaca nama belakang Anda
      String namaBelakang;
      namaBelakang = JOptionPane.showInputDialog("Masukkan " +
                  "nama belakang Anda.");

      JOptionPane.showMessageDialog(null, "Halo, " + namaDepan +
         " " + namaBelakang);
      System.exit(0);
    }
}