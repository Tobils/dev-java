public class UjiKelasRasional {
 /** Metode utama */
 public static void main(String[] args) {
 // Menciptakan dan menginisialisasi dua angka rasional r1 dan r2.
 Rasional r1 = new Rasional(4, 2);
 Rasional r2 = new Rasional(2, 3);
  // Menampilkan hasil-hasil
 System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
 System.out.println(r1 + " - " + r2 + " = "+ r1.subtract(r2));
 System.out.println(r1 + " * " + r2 + " = "+ r1.multiply(r2));
 System.out.println(r1 + " / " + r2 + " = "+ r1.divide(r2));
 System.out.println(r2 + " is "+ r2.doubleValue());
 }
 }