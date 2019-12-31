 import java.util.*;

 public class HitungJumlahKemunculanKata {
 public static void main(String[] args) {
 // Menetapkan teks di dalam suatu string
 String teks = "Teknik Elektro Universitas Gadjah Mada " +
 "Teknik Elektro Universitas Mataram ";

 // Menciptakan suatu TreeMap untuk menampung kata-kata sebagai kunci dan jumlah kemunculan sebagai nilai
 TreeMap<String, Integer> peta = new TreeMap<String, Integer>();

 String[] kata = teks.split(" ");
 for (int i = 0; i < kata.length; i++) {
 String kunci = kata[i].toLowerCase();

 if (kunci.length() > 0) {
 if (peta.get(kunci) == null) {
 peta.put(kunci, 1);
 }
 else {
 int nilai = peta.get(kunci).intValue();
 nilai++;
 peta.put(kunci, nilai);
 }
 }
 }

 // Get all entries into a set
 Set<Map.Entry<String, Integer>> entrySet = peta.entrySet();

 // Get kunci and nilai from each entry
 for (Map.Entry<String, Integer> entry: entrySet)
 System.out.println(entry.getValue() + "\t" + entry.getKey());
 }
 }