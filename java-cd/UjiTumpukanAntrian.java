 public class UjiTumpukanAntrian {
 public static void main(String[] args) {
 // Menciptakan suatu tumpukan
 GenericStack<String> tumpukan =
 new GenericStack<String>();

 // Menambah elemen ke tumpukan
 tumpukan.push("Jodi");// Mendorongnya ke tumpukan
 System.out.println("(1) " + tumpukan);

 tumpukan.push("Andri"); // Mendorongnya ke tumpukan
 System.out.println("(2) " + tumpukan);

 tumpukan.push("Aurora"); // Mendorongnya ke tumpukan
 tumpukan.push("Adam"); // Mendorongnya ke tumpukan
 System.out.println("(3) " + tumpukan);

 // Menghapus elemen dari tumpukan
 System.out.println("(4) " + tumpukan.pop());
 System.out.println("(5) " + tumpukan.pop());
 System.out.println("(6) " + tumpukan);

 // Menciptakan suatu antrian
 GenericQueue<String> antrian = new GenericQueue<String>();

 // Menambah elemen ke antrian
 antrian.enqueue("Jodi");// Menambahnya ke antrian
 System.out.println("(7) " + antrian);

 antrian.enqueue("Andri"); // Menambahnya ke antrian
 System.out.println("(8) " + antrian);

 antrian.enqueue("Aurora"); // Menambahnya ke antrian
 antrian.enqueue("Adam"); // Menambahnya ke antrian
 System.out.println("(9) " + antrian);

 // Menghapus elemen dari elemen
 System.out.println("(10) "+ antrian.dequeue());
 System.out.println("(11) " + antrian.dequeue());
 System.out.println("(12) " + antrian);
 }
 }