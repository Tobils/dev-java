 import java.util.*;

 public class UjiTreeSet {
 public static void main(String[] args) {
 // Menciptakan suatu set hash
 Set<String> set = new HashSet<String>();

 // Menambah string ke dalam set
 set.add("Klaten");
 set.add("Balige");
 set.add("Jogjakarta");
 set.add("Mataram");
 set.add("Siantar");
 set.add("Jogjakarta");

TreeSet<String> treeSet = new TreeSet<String>(set);
 System.out.println("Set tree terurut: " + treeSet);

 // Menggunakan metode-metode dalam antarmuka SortedSet
 System.out.println("first(): " + treeSet.first());
 System.out.println("last(): " + treeSet.last());
 System.out.println("headSet(): " + treeSet.headSet("Jogjakarta"));
 System.out.println("tailSet(): " + treeSet.tailSet("Jogjakarta"));

 // Menggunakan metode-metode dalam antarmuka NavigableSet
 System.out.println("lower(\"P\"): " + treeSet.lower("P"));
 System.out.println("higher(\"P\"): " + treeSet.higher("P"));
 System.out.println("floor(\"P\"): " + treeSet.floor("P"));
 System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P"));
 System.out.println("pollFirst(): " + treeSet.pollFirst());
 System.out.println("pollLast(): " + treeSet.pollLast());
 System.out.println("New tree set: " + treeSet);
 }
 }
