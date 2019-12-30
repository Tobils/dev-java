 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

 public class DemoEventKunci extends JFrame {
 private PanelPapanKunci panelPapanKunci = new PanelPapanKunci();

 /** Menginisialisasi */
 public DemoEventKunci() {
 // Menambahkan panel papankunci untuk menerima dan menampilkan masukan pengguna
 add(panelPapanKunci);

 // Menetapkan fokus
 panelPapanKunci.setFocusable(true);
 }

 /** Metode utama */
 public static void main(String[] args) {
 DemoEventKunci frame = new DemoEventKunci();
 frame.setTitle("DemoEventKunci");
 frame.setSize(300, 300);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }

 // Kelas inner: PanelPapanKunci untuk menerima masukan kunci
 static class PanelPapanKunci extends JPanel {
 private int x = 100;
 private int y = 100;
 private char karKunci = 'J'; // Kunci default

 public PanelPapanKunci() {
 addKeyListener(new KeyAdapter() {
 public void keyPressed(KeyEvent e) {
 switch (e.getKeyCode()) {
 case KeyEvent.VK_DOWN: y += 10; break;
 case KeyEvent.VK_UP: y -= 10; break;
 case KeyEvent.VK_LEFT: x -= 10; break;
 case KeyEvent.VK_RIGHT: x += 10; break;
 default: karKunci = e.getKeyChar();
 }

 repaint();
 }
 });
 }

 /** Menggambar karakter */
 protected void paintComponent(Graphics g) {
 super.paintComponent(g);

 g.setFont(new Font("TimesRoman", Font.PLAIN, 24));
 g.drawString(String.valueOf(karKunci), x, y);
 }
 }
 }