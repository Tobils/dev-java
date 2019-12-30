 public class TestLinkedList {
 public static void main(String[] args) {
 // Menciptakan suatu list
 MyLinkedList<String> list = new MyLinkedList<String>();

 // Menambah elemen-elemen ke list
 list.add("Siantar"); // Menambahnya ke list
 System.out.println("(1) " + list);

 list.add(0, "Klaten"); // Menambahnya pada awal list
 System.out.println("(2) " + list);

 list.add("Balige"); // Menambahnya pada ujung list
 System.out.println("(3) " + list);

 list.addLast("Jogja"); // Menambahnya pada ujung list
 System.out.println("(4) " + list);

 list.add(2, "Batam"); // Menambahnya ke list pada indeks 2
 System.out.println("(5) " + list);

 list.add(5, "Mataram"); // Menambahnya ke list pada indeks 5
 System.out.println("(6) " + list);

 // Menghapus elemen-elemen dari list
 list.remove("Klaten"); // Sama dengan list.remove(0) 
 System.out.println("(7) " + list);

 list.remove(2); // Menghapus elemen pada indeks 2
 System.out.println("(8) " + list);

 list.remove(list.size() - 1); // Menghapus elemen terakhir
 System.out.println("(9) " + list);
 }
 }