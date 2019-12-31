 import javax.swing.*;

 public class TampilGraf extends JApplet {
 private Kota[] verteks = {new Kota("Balige", 75, 50),
 new Kota("Parapat", 50, 210),
 new Kota("Raya", 75, 275), new Kota("Siantar", 275, 175),
 new Kota("Perdagangan", 400, 245),
 new Kota("Tebing", 450, 100), new Kota("Binjai", 700, 80),
 new Kota("Medan", 675, 120), new Kota("Asahan", 575, 295),
 new Kota("Kisaran", 600, 400), new Kota("Sipirok", 408, 325),
 new Kota("Tanjung", 450, 360) };

 // Array tepi untuk graf pada Gambar 12.1
 private int[][] tepi = {
      {0, 1}, {0, 3}, {0, 4},
      {1, 0}, {1, 2}, {1, 4},
      {2, 1}, {2, 4}, {2, 5}, {2, 6},
      {3, 0}, {3, 4}, {3, 5}, {3, 8}, {3, 9},
      {4, 0}, {4, 1}, {4, 2}, {4, 3}, {4, 5}, 
      {5, 2}, {5, 3}, {5, 4}, {5, 6}, {5, 9}, {5, 10},
      {6, 2}, {6, 5}, {6, 7}, {6, 10},
      {7, 6}, {7, 10}, {7, 11}, 
      {8, 3}, {8, 9}, 
      {9, 3}, {9, 5}, {9, 8}, {9, 10},
      {10, 5}, {10, 6}, {10, 7}, {10, 9}, {10, 11},
      {11, 7}, {11, 10}
    };

 private Graph<Kota> graf
 = new UnweightedGraph<Kota>(tepi, verteks);

 public TampilGraf() {
 add(new GraphView(graf));
 }

 static class Kota implements Displayable {
 private int x, y;
 private String nama;

 Kota(String nama, int x, int y) {
 this.nama = nama;
 this.x = x;
 this.y = y;
 }

 public int getX() {
 return x;
 }

 public int getY() {
 return y;
 }

 public String getName() {
 return nama;
 }
 }
 
 }