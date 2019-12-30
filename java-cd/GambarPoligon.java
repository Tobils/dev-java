 import javax.swing.JFrame;
 import javax.swing.JPanel;
 import java.awt.Graphics;
 import java.awt.Polygon;

 public class GambarPoligon extends JFrame {
 public GambarPoligon() {
 setTitle("GambarPoligon");
 add(new PolygonsPanel());
 }

 /** Metode utama */
 public static void main(String[] args) {
 GambarPoligon frame = new GambarPoligon();
 frame.setSize(200, 250);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
 }

 // Menggambar suatu poligon dalam panel
 class PolygonsPanel extends JPanel {
 protected void paintComponent(Graphics g){
 super.paintComponent(g);

 int xTengah = getWidth() / 2;
 int yTengah = getHeight() / 2;
 int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

 // Menciptakan suatu objek Polygon
 Polygon polygon = new Polygon();

 // Menambahkan titik-titik kepada poligon dengan urutan ini
 polygon.addPoint(xTengah + radius, yTengah);
 polygon.addPoint((int)(xTengah + radius *
 Math.cos(2 * Math.PI / 6)), (int)(yTengah - radius *
 Math.sin(2 * Math.PI / 6)));
 polygon.addPoint((int)(xTengah + radius *
 Math.cos(2 * 2 * Math.PI / 6)), (int)(yTengah - radius *
 Math.sin(2 * 2 * Math.PI / 6)));
 polygon.addPoint((int)(xTengah + radius *
 Math.cos(3 * 2 * Math.PI / 6)), (int)(yTengah - radius *
 Math.sin(3 * 2 * Math.PI / 6)));
 polygon.addPoint((int)(xTengah + radius *
 Math.cos(4 * 2 * Math.PI / 6)), (int)(yTengah - radius *
 Math.sin(4 * 2 * Math.PI / 6)));
 polygon.addPoint((int)(xTengah + radius *
 Math.cos(5 * 2 * Math.PI / 6)), (int)(yTengah - radius * 
 Math.sin(5 * 2 * Math.PI / 6)));

 // Menggambar poligon
 g.drawPolygon(polygon);
 }
 }