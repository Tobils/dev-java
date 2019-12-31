 import javax.swing.*;
 import java.awt.*;

 public class PanelDeskripsi extends JPanel {
 /** Label untuk menampilkan ikon citra dan teks */
 private JLabel jlbCitraJudul = new JLabel();

 /** Area teks untuk menampilkan teks */
 private JTextArea jtaDeskripsi = new JTextArea();

 public PanelDeskripsi() {
 // Menengahkan ikon dan teks dan menempatkan teks di bawah ikon
 jlbCitraJudul.setHorizontalAlignment(JLabel.CENTER);
 jlbCitraJudul.setHorizontalTextPosition(JLabel.CENTER);
 jlbCitraJudul.setVerticalTextPosition(JLabel.BOTTOM);

 // Menetapkan font dalam label dan bidang teks
 jlbCitraJudul.setFont(new Font("SansSerif", Font.BOLD, 16));
 jtaDeskripsi.setFont(new Font("Serif", Font.PLAIN, 14));

 // Menetapkan lineWrap dan wrapStyleWord bernilai true untuk area teks
 jtaDeskripsi.setLineWrap(true);
 jtaDeskripsi.setWrapStyleWord(true);
 jtaDeskripsi.setEditable(false);

 // Menciptakan suatu scroll pane untuk memuat area teks
 JScrollPane scrollPane = new JScrollPane(jtaDeskripsi);

 // Menetapkan BorderLayout untuk panel, menambahkan label dan scrollpane
 setLayout(new BorderLayout(5, 5));
 add(scrollPane, BorderLayout.CENTER);
 add(jlbCitraJudul, BorderLayout.WEST);
 }

 /** Menetapkan judul */
 public void tetapkanJudul(String judul) {
 jlbCitraJudul.setText(judul);
 }

 /** Menetapkan ikon citra */
 public void tetapkanCitraIkon(ImageIcon ikon) {
 jlbCitraJudul.setIcon(ikon);
 }

 /** Menetapkan deskripsi teks */
 public void tetapkanDeskripsi(String teks) {
 jtaDeskripsi.setText(teks);
 }
 }