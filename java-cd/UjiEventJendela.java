 import java.awt.event.*;
 import javax.swing.JFrame;

 public class UjiEventJendela extends JFrame {
 public static void main(String[] args) {
 UjiEventJendela frame = new UjiEventJendela();
 frame.setSize(220, 80);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setTitle("UjiEventJendela");
 frame.setVisible(true);
 }

 public UjiEventJendela() {
 addWindowListener( new WindowListener() {
 /**
* Handler untuk event deikonifikasi jendela
 * Dipanggil ketika suatu jendela diubah dari keadaaan terminimisasi
 * menjadi keadaan normal.
 */
 public void windowDeiconified(WindowEvent event) {
 System.out.println("Jendela dideikonifikasi");
 }

 /**
 * Handler untuk event ikonifikasi jendela
 * Dipanggil ketika suatu jendela diubah dari keadaan normal
 * menjadi keadaan terminimisasi. Pada banyak platform, jendela terminimisasi
 * ditampilkan sebagai ikon tertentu pada properti 
 * iconImage jendela.
 */
 public void windowIconified(WindowEvent event) {
 System.out.println("Jendela diikonifikasi");
 }

 /**
 * Handler untuk event aktifasi jendela
 * Dipanggil ketika jendela ditetapkan menjadi jendela aktif
 * bagi pengguna, berarti bahwa jendela (atau salah satu dari
 * sub-subkomponennya) akan menerima event papankunci (keyboard).
 */
 public void windowActivated(WindowEvent event) {
 System.out.println("Jendela diaktivasi");
 }

 /**
 * Handler untuk event deaktivasi jendela
 * Dipanggil ketika jendela tidak lagi menjadi jendela aktif
 * bagi pengguna, berarti bahwa event papankunci tidak lagi
 * dikirim kepada jendela atau sub-subkomponennya.
 */
 public void windowDeactivated(WindowEvent event) {
 System.out.println("Jendela dideaktivasi");
 }

 /**
 * Handler untuk event pembukaan jendela
 * Dipanggil saat pertama kali jendela terlihat atau muncul.
 */
 public void windowOpened(WindowEvent event) {
 System.out.println("Jendela dibuka");
 }

 /**
 * Handler untuk event percobaan penutupan jendela
 * Dipanggil ketika pengguna mencoba untuk menutup jendela
 * dari menu sistem jendela. Jika program tidak secara eksplisit
 * menyembunyikan atau menutup jendela pada saat memproses
 * event ini, operasi penutupan jendela akan dibatalkan.
 */
 public void windowClosing(WindowEvent event) {
 System.out.println("Jendela akan ditutup");
 }

 /**
 * Handler untuk event penutupan jendela
 * Dipanggil ketika jendela telah ditutup akibat hasil dari
 * pemanggilan handler percobaaan penutupan jendela.
 */
 public void windowClosed(WindowEvent event) {
 System.out.println("Jendela ditutup");
 }
 });
 }
 }