 public class DemoWildCard1 {
 public static void main(String[] args ) {
 GenericStack<Integer> tumpukanInt = new GenericStack<Integer>();
 tumpukanInt.push(1); // 1 diautobox menjadi new Integer(1)
 tumpukanInt.push(2);
 tumpukanInt.push(-2);

 System.out.print("Angka maksimum adalah " + max(tumpukanInt));
 }

 /** Mencari angka maksimum di dalam tumpukan */
 public static double max(GenericStack<Number> tumpukan) {
 double max = tumpukan.pop().doubleValue(); // Inisialisasi max

 while (!tumpukan.isEmpty()) {
 double nilai = tumpukan.pop().doubleValue();
 if (nilai > max)
 max = nilai;
 }

 return max;
 }
 }