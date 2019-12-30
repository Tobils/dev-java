 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;

 public class SegitigaSierpinski extends JApplet {
 private JTextField jtfOrde = new JTextField("0", 5); // Orde
 private PanelSegitigaSierpinski panelSegitiga =
 new PanelSegitigaSierpinski(); // Menampilkan pola

 public SegitigaSierpinski() {
 // Panel untuk memuat label, bidang teks, dan suatu tombol
 JPanel panel = new JPanel();
 panel.add(new JLabel("Masukkan orde fraktal: "));
 panel.add(jtfOrde);
 jtfOrde.setHorizontalAlignment(SwingConstants.RIGHT);

 // Menambahkan suatu panel segitiga Sierpinski kepada applet
 add(panelSegitiga);
 add(panel, BorderLayout.SOUTH);

 // Meregistrasi suatu listener
 jtfOrde.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 panelSegitiga.tetapkanOrde(Integer.parseInt(jtfOrde.getText()));
 }
 });
 }

 static class PanelSegitigaSierpinski extends JPanel {
 private int orde = 0;

 /** Menetapkan suatu orde baru */
 public void tetapkanOrde(int orde) {
 this.orde = orde;
 repaint();
 }

 protected void paintComponent(Graphics g) {
 super.paintComponent(g);

 // Memilih tiga titik proporsional dengan ukuran panel
 Point p1 = new Point(getWidth() / 2, 10);
 Point p2 = new Point(10, getHeight() - 10);
 Point p3 = new Point(getWidth() - 10, getHeight() - 10);

 tampilSegitiga(g, orde, p1, p2, p3);
 }

 private static void tampilSegitiga(Graphics g, int orde,
 Point p1, Point p2, Point p3) {
 if (orde >= 0) {
 // Menggambar suatu segitiga untuk menghubungkan tiga titik
 g.drawLine(p1.x, p1.y, p2.x, p2.y);
 g.drawLine(p1.x, p1.y, p3.x, p3.y);
 g.drawLine(p2.x, p2.y, p3.x, p3.y);

 // Mendapatkan titik-tengah pada setiap sisi segitiga
 Point p12 = titikTengah(p1, p2);
 Point p23 = titikTengah(p2, p3);
 Point p31 = titikTengah(p3, p1);

 // Menampilkan secara rekursif tiga segitiga
 tampilSegitiga(g, orde - 1, p1, p12, p31);
 tampilSegitiga(g, orde - 1, p12, p2, p23);
 tampilSegitiga(g, orde - 1, p31, p23, p3);
 }
 }

 private static Point titikTengah(Point p1, Point p2) {
 return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
 }
 }
  }