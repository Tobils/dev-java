 public class UjiAntrian {
 public static void main(String[] args) {
 java.util.Queue<String> antrian =
 new java.util.LinkedList<String>();
 antrian.offer("Aurora");
 antrian.offer("Adam");
 antrian.offer("Lizzy");
 antrian.offer("Nicholas");

 while(antrian.size() > 0)
 System.out.print(antrian.remove() + " ");
 }
 }