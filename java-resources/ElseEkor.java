import javax.swing.JOptionPane;   //Diperlukan untuk kelas JOptionPane

/**
 Program ini meminta user untuk memasukkan suatu skor ujian
 numeris dan menampilkan sebuah nilai huruf untuk skor itu.
 Program menampilkan pesan error jika user
 memasukkan skor numeris tak valid.
 */

public class ElseEkor
{
   public static void main(String[] args)
   {
      int skorUjian; 	//Skor ujian numeris
      String masukan; 	//Untuk memuat masukan user

      //Membaca skor ujian numeris
      masukan = JOptionPane.showInputDialog("Masukkan skor ujian " +
                "numeris Anda dan Saya akan memberitahu Anda nilai huruf ekivalen: ");
      skorUjian = Integer.parseInt(masukan);

      //Menampilkan nilai huruf
      if (skorUjian < 60)
         JOptionPane.showMessageDialog(null, "Nilai Anda adalah F.");
      else if (skorUjian < 70)
         JOptionPane.showMessageDialog(null, "Nilai Anda adalah D.");
      else if (skorUjian < 80)
         JOptionPane.showMessageDialog(null, "Nilai Anda adalah C.");
      else if (skorUjian < 90)
         JOptionPane.showMessageDialog(null, "Nilai Anda adalah B.");
      else if (skorUjian <= 100)
         JOptionPane.showMessageDialog(null, "Nilai Anda adalah A.");
      else
      	  JOptionPane.showMessageDialog(null, "Skor tak valid.");

   System.exit(0);
   }
}