 import java.awt.*;
 import javax.swing.*;

 public class TampilCitra extends JFrame {
 public TampilCitra() {
 add(new PanelCitra());
 }

 public static void main(String[] args) {
 JFrame frame = new TampilCitra();
 frame.setTitle("TampilCitra");
 frame.setSize(300, 300);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
 }

 class PanelCitra extends JPanel {
 private ImageIcon ikonCitra = new ImageIcon("Gambar/ratu.gif");
 private Image citra = ikonCitra.getImage();

 /** Menggambar citra pada panel */
 protected void paintComponent(Graphics g) {
 super.paintComponent(g);

 if (citra != null)
 g.drawImage(citra, 0, 0, getWidth(), getHeight(), this);
 }
 }