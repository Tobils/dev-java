 import java.util.*;

 public class UjiKinerjaSetList {
 public static void main(String[] args) {
 // Menciptakan suatu set hash, dan menguji kinerjanya
 Collection<Integer> set1 = new HashSet<Integer>();
 System.out.println("Waktu untuk set hash adalah " +
 dapatWaktuUji(set1, 500000) + " milidetik");

 // Menciptakan suatu set hash berantai, dan menguji kinerjanya
 Collection<Integer> set2 = new LinkedHashSet<Integer>();
 System.out.println("Waktu untuk set hash berantai adalah " +
 dapatWaktuUji(set2, 500000) + " milidetik");

 // Menciptakan suatu set tree, dan menguji kinerjanya
 Collection<Integer> set3 = new TreeSet<Integer>();
 System.out.println("Waktu untuk set tree adalah " +
 dapatWaktuUji(set3, 500000) + " milidetik");

 // Menciptakan suatu list array, dan menguji kinerjanya
 Collection<Integer> list1 = new ArrayList<Integer>();
 System.out.println("Waktu untuk list array adalah " +
 dapatWaktuUji(list1, 60000) + " milidetik");

 // Menciptakan suatu list berantai, dan menguji kinerjanya
 Collection<Integer> list2 = new LinkedList<Integer>();
 System.out.println("Waktu untuk list berantai adalah " +
 dapatWaktuUji(list2, 60000) + " milidetik");
 }

 public static long dapatWaktuUji(Collection<Integer> c, int ukuran) {
 long waktuMulai = System.currentTimeMillis();

 // Menambah angka 0, 1, 2, ..., ukuran - 1 ke dalam list array
 List<Integer> list = new ArrayList<Integer>();
 for (int i = 0; i < ukuran; i++)
 list.add(i);

 Collections.shuffle(list);// Mengacak list array

 // Menambah elemen ke dalam kontainer
 for (int elemen: list)
 c.add(elemen);

 Collections.shuffle(list);// Mengacak list array

 // Menghapus elemen ke dalam kontainer
 for (int elemen: list)
 c.remove(elemen);

 long waktuAkhir = System.currentTimeMillis();
 return waktuAkhir - waktuMulai;// Mengembalikan waktu eksekusi
 }
 }