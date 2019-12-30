 import javax.swing.*;
 import java.awt.*;

 public class UjiPesanTengah extends JFrame{
 public UjiPesanTengah() {
 PesanTengah panelPesan = new PesanTengah();
 add(panelPesan);
 panelPesan.setBackground(Color.WHITE);
 panelPesan.setFont(new Font("Californian FB", Font.BOLD, 30));
 }

 /** Metode utama */
 public static void main(String[] args) {
 UjiPesanTengah frame = new UjiPesanTengah();
 frame.setSize(300, 150);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
 }

 class PesanTengah extends JPanel {
 /** Menggambar pesan */
 protected void paintComponent(Graphics g) {
 super.paintComponent(g);

 // Mendapatkan metrik font atas font saat ini
 FontMetrics fm = g.getFontMetrics();

 // Mencari lokasi pusat untuk menampilkan
 int stringWidth = fm.stringWidth("JAVA itu Tangguh!");
 int stringAscent = fm.getAscent();

 // Mendapatkan posisi karakter paling-kiri dalam baseline
 int koordinatX = getWidth() / 2 - stringWidth / 2;
 int koordinatY = getHeight() / 2 + stringAscent / 2;

 g.drawString("JAVA itu Tangguh!", koordinatX, koordinatY);
 }
 }