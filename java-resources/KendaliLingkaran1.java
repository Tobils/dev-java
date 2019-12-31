 import javax.swing.*;
 import java.awt.*;

 public class KendaliLingkaran1 extends JFrame {
 private JButton jbtPerbesar = new JButton("Perbesar");
 private JButton jbtPerkecil = new JButton("Perkecil");
 private PanelLingkaran kanvas = new PanelLingkaran();

 public KendaliLingkaran1() {
 JPanel panel = new JPanel(); // Menggunakan panel untuk mengelompokkan tombol-tombol
 panel.add(jbtPerbesar);
 panel.add(jbtPerkecil);

 this.add(kanvas, BorderLayout.CENTER); // Menambah kanvas ke tengah
 this.add(panel, BorderLayout.SOUTH); // Menambahkan tombol ke frame
 }

 /** Metode utama */
 public static void main(String[] args) {
 JFrame frame = new KendaliLingkaran1();
 frame.setTitle("KendaliLingkaran1");
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(200, 200);
 frame.setVisible(true);
 }
 }

 class PanelLingkaran extends JPanel {
 private int radius = 5; // Radius lingkaran default

 /** Menggambar lingkaran */
 protected void paintComponent(Graphics g) {
 super.paintComponent(g);
 g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius,
 2 * radius, 2 * radius);
 }
 }