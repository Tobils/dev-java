 import java.awt.*;
 import javax.swing.*;
 import java.util.*;

 public class JamDiam extends JPanel {
 private int jam;
 private int menit;
 private int detik;

 /** Menciptakan suatu jam default dengan waktu sekarang*/
 public JamDiam(){
 tetapkanWaktuSekarang();
 }

 /** Menciptakan suatu jam dengan jam, menit, dan detik tertentu */
 public JamDiam(int jam, int menit, int detik){
 this.jam = jam;
 this.menit = menit;
 this.detik = detik;
 }

 /** Mengembalikan jam */
 public int dapatJam() {
 return jam;
 }

 /** Menetapkan suatu jam baru */
 public void tetapkanJam(int jam) {
 this.jam = jam;
 repaint();
 }

 /** Mengembalikan menit */
 public int dapatMenit() {
 return menit;
 }

 /** Menetapkan suatu menit baru */
 public void tetapkanMenit(int menit) {
 this.menit = menit;
 repaint();
 }

 /** Mengembalikan detik */
 public int dapatDetik() {
 return detik;
 }

 /** Menetaipkan suatu detik baru */
 public void tetapkanDetik(int detik) {
 this.detik = detik;
 repaint();
 }

 /** Menggambar jam */
 protected void paintComponent(Graphics g) {
 super.paintComponent(g);

 // Menginisialisasi jam
 int radiusJam =
 (int)(Math.min(getWidth(), getHeight()) * 0.8 * 0.5);
 int xTengah = getWidth() / 2;
 int yTengah = getHeight() / 2;

 // Menggambar lingkaran
 g.setColor(Color.BLACK);
 g.drawOval(xTengah - radiusJam, yTengah - radiusJam,
 2 * radiusJam, 2 * radiusJam);
 g.drawString("12", xTengah - 5, yTengah - radiusJam + 12);
 g.drawString("9", xTengah - radiusJam + 3, yTengah + 5);
 g.drawString("3", xTengah + radiusJam - 10, yTengah + 3);
 g.drawString("6", xTengah - 3, yTengah + radiusJam - 3);

 // Menggambar lengan detik
 int sPanjang = (int)(radiusJam * 0.8);
 int xDetik = (int)(xTengah + sPanjang *
 Math.sin(detik * (2 * Math.PI / 60)));
 int yDetik = (int)(yTengah - sPanjang *
 Math.cos(detik * (2 * Math.PI / 60)));
 g.setColor(Color.red);
 g.drawLine(xTengah, yTengah, xDetik, yDetik);

 // Menggambar lengan menit
 int mPanjang = (int)(radiusJam * 0.65);
 int xMenit = (int)(xTengah + mPanjang *
 Math.sin(menit * (2 * Math.PI / 60)));
 int yMenit = (int)(yTengah - mPanjang *
 Math.cos(menit * (2 * Math.PI / 60)));
 g.setColor(Color.blue);
 g.drawLine(xTengah, yTengah, xMenit, yMenit);

 // Menggambar lengan jam
 int hPanjang = (int)(radiusJam * 0.5);
 int xJam = (int)(xTengah + hPanjang *
 Math.sin((jam % 12 + menit / 60.0) * (2 * Math.PI / 12)));
 int yJam = (int)(yTengah - hPanjang *
 Math.cos((jam % 12 + menit / 60.0) * (2 * Math.PI / 12)));
 g.setColor(Color.green);
 g.drawLine(xTengah, yTengah, xJam, yJam);
 }

 public void tetapkanWaktuSekarang() {
 // Menciptakan suatu kalender untuk waktu dan tanggal saat ini
 Calendar kalender = new GregorianCalendar();

 // Menetapkan jam, menit, dan detik
 this.jam = kalender.get(Calendar.HOUR_OF_DAY);
 this.menit = kalender.get(Calendar.MINUTE);
 this.detik = kalender.get(Calendar.SECOND);
 }

 public Dimension getPreferredSize() {
 return new Dimension(200, 200);
 }
  }