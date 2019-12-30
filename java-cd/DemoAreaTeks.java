 import java.awt.*;
 import javax.swing.*;

 public class DemoAreaTeks extends JFrame {
 // Mendeklarasikan dan menciptakan suatu panel deskripsi
private PanelDeskripsi panelDeskripsi = new PanelDeskripsi();

 public static void main(String[] args) {
 DemoAreaTeks frame = new DemoAreaTeks();
 frame.pack();
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setTitle("DemoAreaTeks");
 frame.setVisible(true);
 }

 public DemoAreaTeks() {
 // Menetapkan judul, teks, dan citra dalam deskripsi panel
 panelDeskripsi.tetapkanJudul("Sistem Operasi");
 String deskripsi = "Sistem Operasi \n\n" +
 "Sistem operasi melakukan beberapa tugas dasar, seperti  " +
 "mengenali masukan dari keyboard, mengirim keluaran ke monitor,  " +
 "menjejak file dan direktori pada disk, dan mengendalikan " +
 "divais-divais periferal (disk drive dan printer). " +
 "Sistem operasi juga harus menjamin bahwa beberapa program   " +
 "dan beberapa pengguna yang berbeda yang berjalan pada saat " +
 "bersamaan tidak akan saling menginterferensi satu sama lain. " +
 "Sistem operasi bertanggung jawab atas keamanan data.";
 panelDeskripsi.tetapkanDeskripsi(deskripsi);
 panelDeskripsi.tetapkanCitraIkon(new ImageIcon("Gambar/Logo.gif"));

 // Menambahkan panel deskripsi pada frame
 setLayout(new BorderLayout());
 add(panelDeskripsi, BorderLayout.CENTER);
 }
 }