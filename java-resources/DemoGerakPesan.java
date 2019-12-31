 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

 public class DemoGerakPesan extends JFrame {
 public DemoGerakPesan() {
 // Menciptakan suatu instans PanelGerakPesan untuk memindahkan pesan
 PanelGerakPesan p = new PanelGerakPesan
 ("JAVA itu Tangguh!");

 // Menempatkan panel pesan di dalam frame
 setLayout(new BorderLayout());
 add(p);
 }

 /** Metode utama */
 public static void main(String[] args) {
 DemoGerakPesan frame = new DemoGerakPesan();
 frame.setTitle("DemoGerakPesan");
 frame.setSize(200, 100);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }

 // Kelas inner: PanelGerakPesan menggambar pesan
 static class PanelGerakPesan extends JPanel {
 private String pesan = "JAVA itu Tangguh!";
 private int x = 20;
 private int y = 20;

 /** Menciptakan suatu panel untuk menggambar string s */
 public PanelGerakPesan(String s) {
 pesan = s;
 addMouseMotionListener(new MouseMotionAdapter() {
 /** Menangani event penggeretan mouse */
 public void mouseDragged(MouseEvent e) {
 // Mendapatkan lokasi baru dan menggambar di layar
 x = e.getX();
 y = e.getY();
 repaint();
 }
 });
 }

 /** Menggambar komponen */
 protected void paintComponent(Graphics g) {
 super.paintComponent(g);
 g.drawString(pesan, x, y);
 }
 }
 }