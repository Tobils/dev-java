 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;

 public class KendaliLingkaran2 extends JFrame {
 private JButton jbtPerbesar = new JButton("Perbesar");
 private JButton jbtPerkecil = new JButton("Perkecil");
 private PanelLingkaran kanvas = new PanelLingkaran();
 
 public KendaliLingkaran2() {
 JPanel panel = new JPanel(); // Menggunakan panel untuk mengelompokkan tombol
 panel.add(jbtPerbesar);
 panel.add(jbtPerkecil);

 this.add(kanvas, BorderLayout.CENTER); // Menambah kanvas ke tengah
 this.add(panel, BorderLayout.SOUTH); // Menambah tombol ke frame

 jbtPerbesar.addActionListener(new PerbesarListener());
 }

 /** Metode utama */
 public static void main(String[] args) {
 JFrame frame = new KendaliLingkaran2();
 frame.setTitle("KendaliLingkaran2");
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(200, 200);
 frame.setVisible(true);
 }

 class PerbesarListener implements ActionListener {// Kelas inner
 public void actionPerformed(ActionEvent e) {
 kanvas.perbesar();
 }
 }

 class PanelLingkaran extends JPanel {// Kelas inner
 private int radius = 5; // Radius lingkaran default

 /** Perbesar lingkaran */
 public void perbesar() {
 radius++;
 repaint();
 }

 /** Menggambar-ulang lingkaran */
 protected void paintComponent(Graphics g) {
 super.paintComponent(g);
 g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius,
 2 * radius, 2 * radius);
 }
 }
 }