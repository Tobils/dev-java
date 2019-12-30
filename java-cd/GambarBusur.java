 import javax.swing.JFrame;
 import javax.swing.JPanel;
 import java.awt.Graphics;

 public class GambarBusur extends JFrame {
 public GambarBusur() {
 setTitle("GambarBusur");
 add(new PanelBusur());
 }

 /** Metode utama */
 public static void main(String[] args) {
 GambarBusur frame = new GambarBusur();
 frame.setSize(250, 300);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
 }

 // Kelas untuk menggambar busur pada panel
 class PanelBusur extends JPanel {
 // Menggambar empat baling-baling dari suatu kipas
 protected void paintComponent(Graphics g){
 super.paintComponent(g);

 int xCenter = getWidth() / 2;
 int yCenter = getHeight() / 2;
 int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

 int x = xCenter - radius;
 int y = yCenter - radius;

 g.fillArc(x, y, 2 * radius, 2 * radius, 0, 30);
 g.fillArc(x, y, 2 * radius, 2 * radius, 90, 30);
 g.fillArc(x, y, 2 * radius, 2 * radius, 180, 30);
 g.fillArc(x, y, 2 * radius, 2 * radius, 270, 30);
 }
 }