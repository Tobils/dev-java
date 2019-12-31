 import java.util.*;

 public class UjiArrayAndLinkedList {
 public static void main(String[] args) {
 List<Integer> arrayList = new ArrayList<Integer>();
 arrayList.add(1); // 1 diautobox menjadi new Integer(1)
 arrayList.add(2);
 arrayList.add(3);
 arrayList.add(1);
 arrayList.add(4);
 arrayList.add(0, 10);
 arrayList.add(3, 30);

 System.out.println("Suatu list integer di dalam list array:");
 System.out.println(arrayList);

 LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
 linkedList.add(1, "merah");
 linkedList.removeLast();
 linkedList.addFirst("hijau");

 System.out.println("Menampilkan list berantai secara maju:");
 ListIterator<Object> listIterator = linkedList.listIterator();
 while (listIterator.hasNext()) {
 System.out.print(listIterator.next() + " ");
 }
 System.out.println();

 System.out.println("Menampilkan list berantai secara  mundur:");
 listIterator = linkedList.listIterator(linkedList.size());
 while (listIterator.hasPrevious()) {
 System.out.print(listIterator.previous() + " ");
 }
 }
 }