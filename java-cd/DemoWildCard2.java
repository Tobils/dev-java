 public class DemoWildCard2 {
 public static void main(String[] args ) {
 GenericStack<Integer> tumpukanInt = new GenericStack<Integer>();
 tumpukanInt.push(1); // 1 diautobox menjadi new Integer(1)
 tumpukanInt.push(2);
 tumpukanInt.push(-2);

 tampil(tumpukanInt);
 }

 /** Menampilkan objek dan mengosongkan tumpukan */
 public static void tampil(GenericStack<?> tumpukan) {
 while (!tumpukan.isEmpty()) {
 System.out.print(tumpukan.pop() + " ");
 }
 }
 }