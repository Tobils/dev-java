 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

 public class DemoJendelaJamak extends JFrame {
 private JTextArea jta;
 private JButton jbtTampilHistogram = new JButton("Tampil Histogram");
 private Histogram histogram = new Histogram();

 // Menciptakan suatu frame baru untuk memuat panel histogram
 private JFrame histogramFrame = new JFrame();

 public DemoJendelaJamak() {
 // Menyimpan area teks di dalam scroll pane
 JScrollPane scrollPane = new JScrollPane(jta = new JTextArea());
 scrollPane.setPreferredSize(new Dimension(300, 200));
 jta.setWrapStyleWord(true);
 jta.setLineWrap(true);

 // Menempatkan scroll pane dan tombol dalam frame
 add(scrollPane, BorderLayout.CENTER);
 add(jbtTampilHistogram, BorderLayout.SOUTH);

 // Meregistrasi listener
 jbtTampilHistogram.addActionListener(new ActionListener() {
 /** Menangani aksi tombol */
 public void actionPerformed(ActionEvent e) {
 // Menghitung kemunculan huruf di dalam area teks
 int[] hitung = hitungHuruf();

 // Menetakan jumlah huruf pada histogram untuk ditampilkan
 histogram.tampilHistogram(hitung);

 // Menampilkan frame
 histogramFrame.setVisible(true);
 }
 });

 // Menciptakan suatu frame baru untuk memuat panel histogram
 histogramFrame.add(histogram);
 histogramFrame.pack();
 histogramFrame.setTitle("Histogram");
 }

 /** Menghitung huruf di dalam area teks */
 private int[] hitungHuruf() {
 // Menghitung untuk 26 huruf
 int[] hitung = new int[26];

 // Mendapatkan isi dari area teks
 String teks = jta.getText();

 // Menghitung jumlah kemunculan setiap huruf (huruf besar dibedakan dari huruf kecil)
 for (int i = 0; i < teks.length(); i++) {
 char karakter = teks.charAt(i);

 if ((karakter >= 'A') && (karakter <= 'Z')) {
 hitung[karakter - 'A']++;
 }
 else if ((karakter >= 'a') && (karakter <= 'z')) {
 hitung[karakter - 'a']++;
 }
 }

 return hitung; // Mengembalikan array hitung
 }

 public static void main(String[] args) {
 DemoJendelaJamak frame = new DemoJendelaJamak();
 frame.setLocationRelativeTo(null); // pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setTitle("DemoJendelaJamak");
 frame.pack();
 frame.setVisible(true);
 }
 }