 public class GraphView extends javax.swing.JPanel {
 private Graph<? extends Displayable> graf;

 public GraphView(Graph<? extends Displayable> graf) {
 this.graf = graf;
 }

 protected void paintComponent(java.awt.Graphics g) {
 super.paintComponent(g);

 // Menggambar verteks
 java.util.List<? extends Displayable> verteks
 = graf.getVertices();
 for (int i = 0; i < graf.getSize(); i++) {
 int x = verteks.get(i).getX();
 int y = verteks.get(i).getY();
 String nama = verteks.get(i).getName();

 g.fillOval(x - 8, y - 8, 16, 16); // Menampilkan suatu verteks
 g.drawString(nama, x - 12, y - 12); // Menampilkan nama
 }

 // Menggambar tepi untuk sepasang verteks
 for (int i = 0; i < graf.getSize(); i++) {
 java.util.List<Integer> tetangga = graf.getNeighbors(i);
 for (int j = 0; j < tetangga.size(); j++) {
 int v = tetangga.get(j);
 int x1 = graf.getVertex(i).getX();
 int y1 = graf.getVertex(i).getY();
 int x2 = graf.getVertex(v).getX();
 int y2 = graf.getVertex(v).getY();

 g.drawLine(x1, y1, x2, y2);// Menggambar tepi untuk (i, v)
 }
 }
 }
 }