 import java.awt.*;
 import javax.swing.*;

 public class TampilJam extends JFrame {
 public TampilJam() {
 // Menciptakan suatu jam analog untuk waktu sekarang
 JamDiam jam = new JamDiam();

 // Menampilkan jam, menit, dan detik dalam panel pesan
 PanelPesan panelPesan = new PanelPesan(jam.dapatJam() +
 ":" + jam.dapatMenit() + ":" + jam.dapatDetik());
 panelPesan.tetapkanDitengah(true);
 panelPesan.setForeground(Color.blue);
 panelPesan.setFont(new Font("Courier", Font.BOLD, 16));

 // Menambahkan jam dan panel pesan pada frame
 add(jam);
 add(panelPesan, BorderLayout.SOUTH);
 }

 public static void main(String[] args) {
 TampilJam frame = new TampilJam();
 frame.setTitle("TampilJam");
 frame.setSize(300, 350);
 frame.setLocationRelativeTo(null); // Pusatframe
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
  }