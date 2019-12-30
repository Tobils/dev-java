 public class UjiMetodeDlmKoleksi {
 public static void main(String[] args) {
 // Menciptakan set1
 java.util.Set<String> set1 = new java.util.HashSet<String>();

 // Menambahkan string ke dalam set1
 set1.add("Batam");
 set1.add("Siantar");
 set1.add("Tebing Tinggi");
 set1.add("Bandung");
 set1.add("Bekasi");

 System.out.println("set1 adalah " + set1);
 System.out.println(set1.size() + " elemen di dalam set1");

 // Menghapus suatu string dari set1
 set1.remove("Batam");
 System.out.println("\nset1 adalah " + set1);
 System.out.println(set1.size() + " elemen di dalam set1");

 // Menciptakan set2
 java.util.Set<String> set2 = new java.util.HashSet<String>();

 // Menambahkan string ke dalam set2
 set2.add("Batam");
 set2.add("Mataram");
 set2.add("Bekasi");
 System.out.println("\nset2 adalah " + set2);
 System.out.println(set2.size() + " elemen di dalam set2");

 System.out.println("\nApakah Klaten di dalam set2? "
 + set2.contains("Klaten"));

 set1.addAll(set2);
 System.out.println("\nSetelah menambah set2 ke dalam set1, set1 adalah "
 + set1);

 set1.removeAll(set2);
 System.out.println("Setelah menghilangkan set2 dari set1, set1 adalah "
 + set1);

 set1.retainAll(set2);
 System.out.println("Setelah menghilangkan elemen-elemen sama di dalam set2 "
 + "dari set1, set1 adalah " + set1);
 }
 }