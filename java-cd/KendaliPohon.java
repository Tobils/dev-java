 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

 public class KendaliPohon extends JFrame {
 private BinaryTree<Integer> pohon; // Suatu pohon biner ditampilkan
 private JTextField jtfKunci = new JTextField(5);
 private TampilPohon view = new TampilPohon();
 private JButton jbtSisip = new JButton("Sisip");
 private JButton jbtHapus = new JButton("Hapus");

 /** Menciptakan suatu view untuk pohon biner */
 public KendaliPohon(BinaryTree<Integer> pohon) {
 this.pohon = pohon; // Menetapkan pohon biner untuk ditampilkan
 setUI();
 }

 /** Menginisialiasai UI untuk pohon biner */
 private void setUI() {
 this.setLayout(new BorderLayout());
 add(view, BorderLayout.CENTER);
 JPanel panel = new JPanel();
 panel.add(new JLabel("Masukkan suatu kunci: "));
 panel.add(jtfKunci);
 panel.add(jbtSisip);
 panel.add(jbtHapus);
 add(panel, BorderLayout.SOUTH);

 // Listener untuk tombol Sisip
 jbtSisip.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 int kunci = Integer.parseInt(jtfKunci.getText());
 if (pohon.search(kunci)) { // kunci sudah ada di dalam pohon
 JOptionPane.showMessageDialog(null,
 kunci + " sudah ada di dalam pohon");
 }
 else {
 pohon.insert(kunci); // Sisipkan suatu kunci
 view.repaint(); // Menampilkan kembali pohon
 }
 }
 });

 // Listener untuk tombol Hapus
 jbtHapus.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 int kunci = Integer.parseInt(jtfKunci.getText());
 if (!pohon.search(kunci)) { // kunci tidak ada di dalam pohon
 JOptionPane.showMessageDialog(null,
 kunci + " tidak ada di dalam pohon");
 }
 else {
 pohon.delete(kunci); // Hapus kunci
 view.repaint(); // Menampilkan-ulang pohon
 }
 }
 });
 }

 // Kelas inner TampilPohon untuk menampilkan suatu pohon pada panel
 class TampilPohon extends JPanel {
 private int radius = 20; // radius simpul pohon
 private int vGap = 50; // Jarak antara dua level di dalam suatu pohon

 protected void paintComponent(Graphics g) {
 super.paintComponent(g);

 if (pohon.getRoot() != null) {
 // Menampilkan pohon secara rekursif
 tampilPohon(g, pohon.getRoot(), getWidth() / 2, 30,
 getWidth() / 4);
 }
 }

 /** Menampilkan suatu subpohon yang berakar pada posisi (x, y) */
 private void tampilPohon(Graphics g, BinaryTree.TreeNode akar,
 int x, int y, int hGap) {
 // Menampilkan akar
 g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
 g.drawString(akar.elemen + "", x - 6, y + 4);

 if (akar.kiri != null) {
 // Menggambar suatu garis ke simpul kiri
 hubungAnakKiri(g, x - hGap, y + vGap, x, y);
 // Menggambar subpohon kiri secara rekursif
 tampilPohon(g, akar.kiri, x - hGap, y + vGap, hGap / 2);
 }

 if (akar.kanan != null) {
 // Menggambar suatu garis ke simpul kanan
 hubungAnakKanan(g, x + hGap, y + vGap, x, y);
 // Menggambar subpohon kanan secara rekursif
 tampilPohon(g, akar.kanan, x + hGap, y + vGap, hGap / 2);
 }
 }

 /** Menghubungkan suatu orangtua pada (x2, y2) dengan
   * anak kirinya pada (x1, y1) */
 private void hubungAnakKiri(Graphics g,
 int x1, int y1, int x2, int y2) {
 double d = Math.sqrt(vGap * vGap + (x2 - x1) * (x2 - x1));
 int x11 = (int)(x1 + radius * (x2 - x1) / d);
 int y11 = (int)(y1 - radius * vGap / d);
 int x21 = (int)(x2 - radius * (x2 - x1) / d);
 int y21 = (int)(y2 + radius * vGap / d);
 g.drawLine(x11, y11, x21, y21);
 }

 /** Menghubungkan suatu orangtua pada (x2, y2) dengan
   * anak kanannya pada (x1, y1) */
 private void hubungAnakKanan(Graphics g,
 int x1, int y1, int x2, int y2) {
 double d = Math.sqrt(vGap * vGap + (x2 - x1) * (x2 - x1));
 int x11 = (int)(x1 - radius * (x1 - x2) / d);
 int y11 = (int)(y1 - radius * vGap / d);
 int x21 = (int)(x2 + radius * (x1 - x2) / d);
 int y21 = (int)(y2 + radius * vGap / d);
 g.drawLine(x11, y11, x21, y21);
 }
 }
 }

