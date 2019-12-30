 import java.awt.*;
 import javax.swing.JPanel;

 public class BangunPanel extends JPanel {
 // Mendefinisikan konstanta-konstanta
 public static final int GARIS = 1;
 public static final int PERSEGIPANJANG = 2;
 public static final int BUNDAR_PERSEGIPANJANG = 3;
 public static final int OVAL = 4;

 private int tipe = 1;
 private boolean terisi = false;

 /** Menciptakan BangunPanel default */
 public BangunPanel() {
 }

 /** Menciptakan suatu BangunPanel dengan tipe tertentu */
 public BangunPanel(int tipe) {
 this.tipe = tipe;
 }

 /** Menciptakan suatu BangunPanel dengan tipe dan terisi tertentu */
 public BangunPanel(int tipe, boolean terisi) {
 this.tipe = tipe;
 this.terisi = terisi;
 }

 /** Menggambar suatu bangun pada panel */
 protected void paintComponent(Graphics g) {
 super.paintComponent(g);

 // Mendapatkan ukuran sesuai untuk bangun
 int lebar = getWidth();
 int tinggi = getHeight();

 switch (tipe){
 case GARIS: // Menampilkan dua garis silang
 g.setColor(Color.BLACK);
 g.drawLine(10, 10, lebar - 10, tinggi - 10);
 g.drawLine(lebar - 10, 10, 10, tinggi - 10);
 break;
 case PERSEGIPANJANG: // Menampilkan suatu persegi-panjang
 g.setColor(Color.BLUE);
 if (terisi)
 g.fillRect((int)(0.1 * lebar), (int)(0.1 * tinggi),
 (int)(0.8 * lebar), (int)(0.8 * tinggi));
 else
 g.drawRect((int)(0.1 * lebar), (int)(0.1 * tinggi),
 (int)(0.8 * lebar), (int)(0.8 * tinggi));
 break;
 case BUNDAR_PERSEGIPANJANG: // Menampilkan suatu persegi-panjang ujung bundar
 g.setColor(Color.RED);
 if (terisi)
 g.fillRoundRect((int)(0.1 * lebar), (int)(0.1 * tinggi),
 (int)(0.8 * lebar), (int)(0.8 * tinggi), 20, 20);
 else
 g.drawRoundRect((int)(0.1 * lebar), (int)(0.1 * tinggi),
 (int)(0.8 * lebar), (int)(0.8 * tinggi), 20, 20);
 break;
 case OVAL: // Menampilkan suatu oval
 g.setColor(Color.BLACK);
 if (terisi)
 g.fillOval((int)(0.1 * lebar), (int)(0.1 * tinggi),
 (int)(0.8 * lebar), (int)(0.8 * tinggi));
 else
 g.drawOval((int)(0.1 * lebar), (int)(0.1 * tinggi),
 (int)(0.8 * lebar), (int)(0.8 * tinggi));
 }
 }

 /** Menetapkan suatu tipe bangun baru */
 public void tetapkanTipe(int tipe) {
 this.tipe = tipe;
 repaint();
 }

 /** Mengembalikan tipe bangun */
 public int dapatTipe() {
 return tipe;
 }

 /** Menetapkan suatu properti terisi baru */
 public void tetapkanTerisi(boolean terisi) {
 this.terisi = terisi;
 repaint();
 }

 /** Memeriksa apakah bangun terisi atau tidak */
 public boolean apaTerisi() {
 return terisi;
 }

 /** Menentukan ukuran yang diinginkan */
 public Dimension dapatUkuranDiinginkan() {
 return new Dimension(80, 80);
 }
  }