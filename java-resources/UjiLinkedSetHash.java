 import java.util.*;

 public class UjiLinkedSetHash {
 public static void main(String[] args) {
 // Menciptakan suatu set hash
 Set<String> set = new LinkedHashSet<String>();

 // Menambahkan string-string ke dalam set
 set.add("Klaten");
 set.add("Balige");
 set.add("Jogjakarta");
 set.add("Mataram");
 set.add("Siantar");
 set.add("Jogjakarta");

 System.out.println(set);

 // Mendapatkan suatu iterator untuk set hash
 Iterator<String> iterator = set.iterator();

 // Menampilkan elemen-elemen di dalam set hash
 while(iterator.hasNext()) {
 System.out.print(iterator.next().toUpperCase() + " ");
 }
 }
 }