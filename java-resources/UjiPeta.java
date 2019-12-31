 import java.util.*;

 public class UjiPeta {
 public static void main(String[] args) {
 // Menciptakan suatu HashMap
 Map<String, Integer> hashMap = new HashMap<String, Integer>();
 hashMap.put("Sintong", 30);
 hashMap.put("Munir", 31);
 hashMap.put("Agung", 29);
 hashMap.put("Nyoman", 29);

 System.out.println("Menampilkan entri di dalam HashMap");
 System.out.println(hashMap + "\n");

 // Menciptakan suatu TreeMap dari HashMap
 Map<String, Integer> treeMap=
 new TreeMap<String, Integer>(hashMap);
 System.out.println("Menampilkan entri dengan urutan kunci menaik");
 System.out.println(treeMap);

 // Menciptakan suatu LinkedHashMap
 Map<String, Integer> linkedHashMap =
 new LinkedHashMap<String, Integer>(16, 0.75f, true);
 linkedHashMap.put("Sintong", 30);
 linkedHashMap.put("Munir", 31);
 linkedHashMap.put("Agung", 29);
 linkedHashMap.put("Nyoman", 29);

 // Menampilkan umur untuk Agung
 System.out.println("Umur " + "Agung adalah " +
 linkedHashMap.get("Agung").intValue());

 System.out.println("\nMenampilkan entri dalam LinkedHashMap");
 System.out.println(linkedHashMap);
 }
 }