 import java.awt.*;
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
 import javax.swing.*;

 public class DemoTombol extends JFrame {
 // Menciptakan panel untuk menampilkan pesan
 protected PanelPesan panelPesan
 = new PanelPesan("JAVA itu Tangguh!");

 // Mendeklarasikan dua tombol untuk menggerakkan pesan ke kiri dan ke kanan
 private JButton jbtKiri = new JButton("<=");
 private JButton jbtKanan = new JButton("=>");

 public static void main(String[] args) {
 DemoTombol frame = new DemoTombol();
 frame.setTitle("DemoTombol");
 frame.setSize(250, 100);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }

 public DemoTombol() {
 // Menetapkan warna latar belakang untuk panelPesan
 panelPesan.setBackground(Color.white);

 // Menciptakan Panel jpTombol untuk memuat dua tombol "<=” dan “right =>"
 JPanel jpTombol = new JPanel();
 jpTombol.add(jbtKiri);
 jpTombol.add(jbtKanan);

 // Menetapkan papankunci mnemonik
 jbtKiri.setMnemonic('I');
 jbtKanan.setMnemonic('A');

 // Menetapkan ikon dan menghapus teks
  jbtKiri.setIcon(new ImageIcon("Gambar/kiri.gif"));
  jbtKanan.setIcon(new ImageIcon("Gambar/kanan.gif"));
  jbtKiri.setText(null);
  jbtKanan.setText(null);

 // Menetapkan perangkat tool tip text pada tombol
 jbtKiri.setToolTipText("Menggerakkan pesan ke kiri");
 jbtKanan.setToolTipText("Menggerakkan pesan ke kanan");

 // Menampilkan panel di dalam frame
 setLayout(new BorderLayout());
 add(panelPesan, BorderLayout.CENTER);
 add(jpTombol, BorderLayout.SOUTH);

 // Meregistrasi listener dengan tombol
 jbtKiri.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 panelPesan.geserKiri();
 }
 });
 jbtKanan.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 panelPesan.geserKanan();
 }
 });
 }
 }