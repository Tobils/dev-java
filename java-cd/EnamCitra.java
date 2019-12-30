 import javax.swing.*;
 import java.awt.*;

 public class EnamCitra extends JFrame {
 public EnamCitra() {
 Image citra1 = new ImageIcon("Gambar/sisinga.gif").getImage();
 Image citra2 = new ImageIcon("Gambar/Logo.gif").getImage();
 Image citra3 = new ImageIcon("Gambar/santai.gif").getImage();
 Image citra4 = new ImageIcon("Gambar/biomedik.gif").getImage();
 Image citra5 = new ImageIcon("Gambar/batak.gif").getImage();
 Image citra6 = new ImageIcon("Gambar/yamaguchi.gif").getImage();

 setLayout(new GridLayout(2, 0, 5, 5));
 add(new ImageViewer(citra1));
 add(new ImageViewer(citra2));
 add(new ImageViewer(citra3));
 add(new ImageViewer(citra4));
 add(new ImageViewer(citra5));
 add(new ImageViewer(citra6));
 }

 public static void main(String[] args) {
 EnamCitra frame = new EnamCitra();
 frame.setTitle("EnamCitra");
 frame.setSize(400, 320);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
 }