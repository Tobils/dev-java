 import javax.swing.*;

 public class UjiIkonTombol extends JFrame {
 public static void main(String[] args) {
 // Menciptakan frame dan menetapkan propertinya
 JFrame frame = new UjiIkonTombol();
 frame.setTitle("IkonTombol");
 frame.setSize(200, 100);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }

 public UjiIkonTombol() {
 ImageIcon indoIkon = new ImageIcon("Gambar/bendera_merah_putih1.gif");
 ImageIcon singIkon = new ImageIcon("Gambar/bendera_singapura1.gif");
 ImageIcon thaiIkon = new ImageIcon("Gambar/bendera_thailand1.gif");

 JButton jbt = new JButton("Silahkan klik", indoIkon);
 jbt.setPressedIcon(singIkon);
 jbt.setRolloverIcon(thaiIkon);

 add(jbt);
 }
 }