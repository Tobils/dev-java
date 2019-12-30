 import java.awt.FontMetrics;
 import java.awt.Dimension;
 import java.awt.Graphics;
 import javax.swing.JPanel;

 public class PanelPesan extends JPanel{
 /** Pesan yang akan ditampilkan*/
 private String pesan = "JAVA itu Tangguh!";

 /** Koordinat-x dimana pesan ditampilkan */
 private int koordinatX = 20;

  /** Koordinat-y dimana pesan ditampilkan */
 private int koordinatY = 20;

 /** Mengindikasikan apakah pesan ditampilkan di tengah atau tidak */
 private boolean ditengah;

 /** Interval untuk menggerakkan pesan secara horisontal dan
     secara vertikal */
 private int interval = 10;

 /** Menciptakan properti-properti default */
 public PanelPesan(){
 }

 /** Menciptakan suatu panel pesan dengan pesan tertentu */
 public PanelPesan(String pesan){
 this.pesan = pesan;
 }

 /** Mengembalikan pesan */
 public String dapatPesan() {
 return pesan;
 }

 /** Menetapkan suatu pesan baru */
 public void tetapkanPesan(String pesan) {
 this.pesan = pesan;
 repaint();
 }

 /** Mengembalikan koordinatX */
 public int dapatKoordinatX() {
 return koordinatX;
 }

 /** Menetapkan suatu koordinatX baru */
 public void tetapkanKoordinatX(int x) {
 this.koordinatX = x;
 repaint();
 }

 /** Mengembalikan koordinatY */
 public int dapatKoordinatY() {
 return koordinatY;
 }

 /** Menetapkan suatu koordinatY baru */
 public void tetapkanKoordinatY(int y) {
 this.koordinatY = y;
 repaint();
 }

 /** Mengembalikan properti ditengah */
 public boolean apaDitengah() {
 return ditengah;
 }

 /** menetapkan nilai ditengah yang baru */
 public void tetapkanDitengah(boolean ditengah) {
 this.ditengah = ditengah;
 repaint();
 }

 /** Mengembalikan interval */
 public int dapatInterval() {
 return interval;
 }

 /** Menetapkan suatu interval baru */
 public void tetapkanInterval(int interval) {
 this.interval = interval;
 repaint();
 }

 /** Menampilkan pesan */
 protected void paintComponent(Graphics g) {
 super.paintComponent(g);

 if (ditengah){
 // Mendapatkan metrik font untuk font saat ini
 FontMetrics fm = g.getFontMetrics();

 // Mencari lokasi tengah untuk menampilkan
 int stringWidth = fm.stringWidth(pesan);
 int stringAscent = fm.getAscent();
 // Mencari posisi karakter paling-kiri dalam baseline
 koordinatX = getWidth() / 2 - stringWidth / 2;
 koordinatY = getHeight() / 2 + stringAscent / 2;
 }

 g.drawString(pesan, koordinatX, koordinatY);
 }

 /** Menggerakkan pesan ke kiri */
 public void geserKiri() {
 koordinatX -= interval;
 repaint();
 }

 /** Menggerakkan pesan ke kanan */
 public void geserKanan() {
 koordinatX += interval;
 repaint();
 }

 /** Menggerakkan pesan ke atas */
 public void geserAtas() {
 koordinatY -= interval;
 repaint();
 }

 /** Menggerakkan pesan ke bawah */
 public void geserBawah() {
 koordinatY += interval;
 repaint();
 }

 /** Mengoverride metode preferredSize */
 public Dimension getPreferredSize() {
 return new Dimension(200, 30);
 }
  }