 public class UjiAntrianPrioritas {
 public static void main(String[] args) {
 Pasien pasien1 = new Pasien("Aurora", 2);
 Pasien pasien2 = new Pasien("Adam", 1);
 Pasien pasien3 = new Pasien("Andri", 5);
 Pasien pasien4 = new Pasien("Jody", 7);

 MyPriorityQueue antrianPrioritas = new MyPriorityQueue();
 antrianPrioritas.enqueue(pasien1);
 antrianPrioritas.enqueue(pasien2);
 antrianPrioritas.enqueue(pasien3);
 antrianPrioritas.enqueue(pasien4);

 while(antrianPrioritas.getSize() > 0)
 System.out.print( antrianPrioritas.dequeue() + " ");
 }

 static class Pasien implements Comparable {
 private String nama;
 private int prioritas;

 public Pasien(String nama, int prioritas) {
 this.nama = nama;
 this.prioritas = prioritas;
 }

 public String toString() {
 return nama + "(prioritas:" + prioritas + ")";
 }

 public int compareTo(Object o) {
 return this.prioritas - ((Pasien)o).prioritas;
 }
 }
 }