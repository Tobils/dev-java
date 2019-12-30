 import java.awt.event.*;
 import javax.swing.*;

 public class AnimasiJam extends JFrame {
 private JamDiam jam = new JamDiam();

 public AnimasiJam() {
 add(jam);

 // Mencitpakan suatu timer dengan tunda 1000 ms
 Timer timer = new Timer(1000, new TimerListener());
 timer.start();
 }

 private class TimerListener implements ActionListener {
 /** Menangani event aksi */
 public void actionPerformed(ActionEvent e) {
 // Menetapkan waktu baru dan menggambar-ulang jam untuk menampilkan waktu sekarang
 jam.tetapkanWaktuSekarang();
 jam.repaint();
 }
 }

 /** Metode utama */
 public static void main(String[] args) {
 JFrame frame = new AnimasiJam();
 frame.setTitle("AnimasiJam");
 frame.setSize(200, 200);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
 }