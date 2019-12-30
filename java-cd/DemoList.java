 import java.awt.*;
 import javax.swing.*;
 import javax.swing.event.*;

 public class DemoList extends JFrame {
 final int JUMLAH_BENDERA = 4;

 // Mendeklarasikan suatu array yang memuat String-String untuk judul bendera
 private String[] judulBendera= {"Indonesia", "Singapura", "Thailand", 
 "Vietnam"};
 
 // List untuk negara-negara
 private JList jlst = new JList(judulBendera);

 // Mendeklarasikan suatu array ImageIcon untuk 4 bendera negara
 private ImageIcon[] ikonCitra= {
 new ImageIcon("Gambar/bendera_merah_putih.gif"),
 new ImageIcon("Gambar/bendera_singapura.gif"),
 new ImageIcon("Gambar/bendera_thailand.gif"),
 new ImageIcon("Gambar/bendera_vietnam.gif"),
 };

 // Arrays label-label untuk menampilkan citra
 private JLabel[] jlblViewerCitra = new JLabel[JUMLAH_BENDERA];

 public static void main(String[] args) {
 DemoList frame = new DemoList();
 frame.setSize(650, 500);
 frame.setTitle("DemoList");
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }

 public DemoList() {
 // Menciptakan panel untuk memuat empat label
 JPanel p = new JPanel(new GridLayout(2, 2, 2, 2));

 for (int i = 0; i < JUMLAH_BENDERA; i++) {
 p.add(jlblViewerCitra[i] = new JLabel());
 jlblViewerCitra[i].setHorizontalAlignment
 (SwingConstants.CENTER);
 }

 // Menambahkan p dan list pada frame
 add(p, BorderLayout.CENTER);
 add(new JScrollPane(jlst), BorderLayout.WEST);

 // Meregistrasi listener
 jlst.addListSelectionListener(new ListSelectionListener() {
 /** Manangani seleksi list */
 public void valueChanged(ListSelectionEvent e) {
 // Mendapatkan indeks-indeks terpilih
 int[] indeks = jlst.getSelectedIndices();

 int i;
 // Menetapkan ikon-ikon dalam label
 for (i = 0; i < indeks.length; i++) {
 jlblViewerCitra[i].setIcon(ikonCitra[indeks[i]]);
 }

 // Remove icons from the rest of the labels
 for (; i < JUMLAH_BENDERA; i++) {
	 jlblViewerCitra[i].setIcon(null);
 }
 }
 });
 }
 }