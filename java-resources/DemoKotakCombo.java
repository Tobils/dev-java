 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

 public class DemoKotakCombo extends JFrame{
 // Mendeklarasikan suatu array yang memuat String-String untuk judul bendera
 private String[] judulBendera= {"Indonesia", "Singapura", "Thailand", 
 "Vietnam"};

 // Mendeklarasikan suatu array ImageIcon untuk 4 bendera negara
 private ImageIcon[] citraBendera= {
 new ImageIcon("Gambar/bendera_merah_putih.gif"),
 new ImageIcon("Gambar/bendera_singapura.gif"),
 new ImageIcon("Gambar/bendera_thailand.gif"),
 new ImageIcon("Gambar/bendera_vietnam.gif"),
 };

 // Mendeklarasikan array string untuk deskripsi bendera
 private String[] deskripsiBendera= new String[9];

 // Mendeklarasikan dan menciptakan suatu panel deskripsi
 private PanelDeskripsi panelDeskripsi = new PanelDeskripsi();

 // Menciptakan suatu kotak combo untuk menyeleksi negara
 private JComboBox jcbo = new JComboBox(judulBendera);

 public static void main(String[] args) {
 DemoKotakCombo frame = new DemoKotakCombo();
 frame.pack();
 frame.setTitle("DemoKotakCombo");
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }

 public DemoKotakCombo() {
 // Set text description
 deskripsiBendera[0] = "Sang Saka Merah Putih \n\n" +
 "Pada Tanggal 17 Agustus 1945, Indonesia meraih kemerdekaannya " +
 "dari penjajahan dan penindasan Bangsa Belanda. Proklamator " +
 "Republik Indonesia, Soekarno dan Hatta, mengumumkan kemerdekaan " +
 "Bangsa Indonesia. Simbol negara, Bendera Merah Putih, dikibarkan " +
 "dan seluruh Rakyat Indonesia bersuka citra dari Sabang sampai " +
 "Merauke. Cit-cita Bangsa Indonesia adalah mendidik seluruh anak " +
 "bangsa agar terlepas pula dari kebodohan. Karena kebodohanlah, " +
 "saat itu, Indonesia dijajah oleh Belanda.";
 deskripsiBendera[1] = "Deskripsi untuk Singapura ... ";
 deskripsiBendera[2] = "Deskripsi untuk Thailand ... ";
 deskripsiBendera[3] = "Deskripsi untuk Vietnam ... ";

 // Menetapkan negara pertama (Indonesia) untuk ditampilkan
 setDisplay(0);

 // Menambahkan kotak combo dan panel deskripsi pada daftar
 add(jcbo, BorderLayout.NORTH);
 add(panelDeskripsi, BorderLayout.CENTER);

 // Meregistrasikan listener
 jcbo.addItemListener(new ItemListener() {
 /** Menangani seleksi item */
 public void itemStateChanged(ItemEvent e) {
 setDisplay(jcbo.getSelectedIndex());
 }
 });
 }

 /** Menetapkan penampila informasi pada panel deskripsi */
 public void setDisplay(int index) {
 panelDeskripsi.tetapkanJudul(judulBendera[index]);
 panelDeskripsi.tetapkanCitraIkon(citraBendera[index]);
 panelDeskripsi.tetapkanDeskripsi(deskripsiBendera[index]);
 }
  }