 import java.util.*;

 public class DemoAntrianPrioritas {
 public static void main(String[] args) {
 PriorityQueue<String> antrian1 = new PriorityQueue<String>();
 antrian1.offer("Gaby");
 antrian1.offer("Artha");
 antrian1.offer("Glory");
 antrian1.offer("Philip");

 System.out.println("Antrian prioritas menggunakan Comparable:");
 while (antrian1.size() > 0) {
 System.out.print(antrian1.remove() + " ");
 }

 PriorityQueue<String> antrian2 = new PriorityQueue<String>(
 4, Collections.reverseOrder());
 antrian2.offer("Gaby");
 antrian2.offer("Artha");
 antrian2.offer("Glory");
 antrian2.offer("Philip");

 System.out.println("\nAntrian prioritas menggunakan komparator:");
 while (antrian2.size() > 0) {
 System.out.print(antrian2.remove() + " ");
 }
 }
 }