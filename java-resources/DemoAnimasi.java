 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

 public class DemoAnimasi extends JFrame {
 public DemoAnimasi() {
 // Menciptakan suatu PanelPesanBergerak untuk menampilkan suatu pesan bergerak
 add(new PanelPesanBergerak("Pesan bergerak?"));
 }

 /** Metode utama */
 public static void main(String[] args) {
 DemoAnimasi frame = new DemoAnimasi();
 frame.setTitle("DemoAnimasi");
 frame.setSize(280, 100);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }

 // Kelas inner: Menampilkan suatu pesan bergerak
 static class PanelPesanBergerak extends JPanel {
 private String pesan = "JAVA itu Tangguh!";
 private int xKoordinat = 0;
 private int yKoordinat = 20;

 public PanelPesanBergerak(String pesan) {
 this.pesan = pesan;

 // Menciptakan suatu timer
 Timer timer = new Timer(1000, new TimerListener());
 timer.start();
 }

 /** Menggambar pesan */
 protected void paintComponent(Graphics g) {
 super.paintComponent(g);

 if (xKoordinat > getWidth()) {
 xKoordinat = -20;
 }
 xKoordinat += 5;
 g.drawString(pesan, xKoordinat, yKoordinat);
 }

 class TimerListener implements ActionListener {
 /** Menangani ActionEvent */
 public void actionPerformed(ActionEvent e) {
 repaint();
 }
 }
 }
 }