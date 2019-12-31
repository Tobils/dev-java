 import javax.swing.*;
 import java.awt.event.*;

 public class DemoListenerTakBernama extends JFrame {
 public DemoListenerTakBernama() {
 // Menambahkan empat tombol
 JButton jbtBaru = new JButton("Baru");
 JButton jbtBuka = new JButton("Buka");
 JButton jbtSimpan = new JButton("Simpan");
 JButton jbtTampil = new JButton("Tampil");

 // Menciptakan panel untuk memuat empat tombol
 JPanel panel = new JPanel();
 panel.add(jbtBaru);
 panel.add(jbtBuka);
 panel.add(jbtSimpan);
 panel.add(jbtTampil);

 add(panel);

 // Menciptakan dan meregistrasi listener kelas inner tak-bernama
 jbtBaru.addActionListener(
 new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 System.out.println("Proses baru");
}
}
 );

 jbtBuka.addActionListener(
 new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 System.out.println("Proses membuka");
 }
 }
 );

 jbtSimpan.addActionListener(
 new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 System.out.println("Proses menyimpan");
 }
 }
 );

 jbtTampil.addActionListener(
 new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 System.out.println("Proses menampilkan");
 }
 }
 );
 }

 /** Metode utama */
 public static void main(String[] args) {
 JFrame frame = new DemoListenerTakBernama();
 frame.setTitle("DemoListenerTakBernama");
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.pack();
 frame.setVisible(true);
 }
  }