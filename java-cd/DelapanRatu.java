 import java.awt.*;
 import javax.swing.*;

 public class DelapanRatu extends JApplet {
 public static final int UKURAN = 8; // Ukuran papan catur
 private int[] ratu = new int[UKURAN]; // Posisi ratu

 public DelapanRatu() {
 cari(0); // Mencari solusi dari baris 0
 add(new PapanCatur(), BorderLayout.CENTER); // Menampilkan solusi
 }

 /** Memeriksa apakah suatu ratu dapat ditempatkan pada baris i dan kolom j */
 private boolean apaValid(int baris, int kolom) {
 for (int i = 1; i <= baris; i++)
 if (ratu[baris - i] == kolom // Memeriksa kolom
 || ratu[baris - i] == kolom - i // Memeriksa diagonal atas-kiri
 || ratu[baris - i] == kolom + i) // Memeriksa diagonal atas-kanan
 return false; // Ada konflik
 return true; // Tidak ada konflik
 }

 /** Mencari solusi mulai dari baris tertentu */
 private boolean cari(int baris) {
 if (baris == UKURAN) //kondisi penghenti
  return true; // Silusi ditemukan untuk menempatkan 8 ratu pada 8 baris

 for (int kolom = 0; kolom < UKURAN; kolom++) {
 ratu[baris] = kolom; // Menempatkan ratu pada (baris, kolom)
 if (apaValid(baris, kolom) && cari(baris + 1))
 return true; // Ditemukan, mengembalikan true untuk keluar loop
 }

 // Tidak ada solusi untuk suatu ratu yang ditempatkan pada sembarang kolom dalam baris ini
 return false;
 }

 class PapanCatur extends JPanel {
 private Image citraRatu =
 new ImageIcon("Gambar/ratu.jpg").getImage();

 PapanCatur() {
 this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
 }

 protected void paintComponent(Graphics g) {
 super.paintComponent(g);

 // Menggambar ratu
 for (int i = 0; i < UKURAN; i++) {
 int j = ratu[i]; // Posisi ratu pada baris i
 g.drawImage(citraRatu, j * getWidth() / UKURAN,
 i * getHeight() / UKURAN, getWidth() / UKURAN,
 getHeight() / UKURAN, this);
 }

 // Menggambar garis horisontal dan fertikal
 for (int i = 1; i < UKURAN; i++) {
 g.drawLine(0, i * getHeight() / UKURAN,
 getWidth(), i * getHeight() / UKURAN);
 g.drawLine(i * getWidth() / UKURAN, 0,
 i * getWidth() / UKURAN, getHeight());
 }
 }
 }
 }