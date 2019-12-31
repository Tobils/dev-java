 import javax.swing.*;
 import java.awt.*;

 public class Histogram extends JPanel{
 // Menghitung jumlah kemunculan 26 huruf
 private int[] hitung;

 /** Menetapkan hitung dan menampilkan histogram */
 public void tampilHistogram(int[] hitung) {
 this.hitung = hitung;
 repaint();
 }

 /** Menggambar histogram */
 protected void paintComponent(Graphics g) {
 if (hitung == null) return; // No display if hitung is null

 super.paintComponent(g);

 // Mencari ukuran panel dan lebar batang dan interval secara dinamis
 int lebar = getWidth();
 int tinggi = getHeight();
 int interval = (lebar - 40) / hitung.length;
 int lebarIndividu = (int)(((lebar - 40) / 24) * 0.60);

 // Find the maximum hitung. The maximum hitung has the highest bar
 int hitungMaks = 0;
 for (int i = 0; i < hitung.length; i++) {
 if (hitungMaks < hitung[i])
 hitungMaks = hitung[i];
 }

 // x adalah posisi awal untuk batang pertama dalam histogram
 int x = 30;

 // Menggambar garis basis horisontal
 g.drawLine(10, tinggi - 45, lebar - 10, tinggi - 45);
 for (int i = 0; i < hitung.length; i++) {
 // Mencari tinggi batang
 int tinggiBatang =
 (int)(((double)hitung[i] / (double)hitungMaks) * (tinggi - 55));

 // Menampilkan batang (i.e. persegi-panjang)
 g.drawRect(x, tinggi - 45 - tinggiBatang, lebarIndividu,
 tinggiBatang);

 // Menampilkan karakter di bawah garis basis
 g.drawString((char)(65 + i) + "", x, tinggi - 30);

 // Menggerakkan x untuk menampilkan karakter berikutnya
 x += interval;
 }
 }

 /** Mengoverride getPreferredSize */
 public Dimension getPreferredSize() {
 return new Dimension(300, 300);
 }
  }