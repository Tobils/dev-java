 import java.util.Scanner;

 public class HitungFibonacci {
 /** Metode utama */
 public static void main(String args[]) {
 // Menciptakan suatu Scanner
 Scanner masukan = new Scanner(System.in);
 System.out.print("Masukkan suatu indeks untuk bilangan Fibonacci: ");
 int indeks = masukan.nextInt();

 // Mencari dan menampilkan bilangan Fibonacci
 System.out.println(
 "Bilangan Fibonacci pada indeks " + indeks + " adalah " + fib(indeks));
 }

 /** Metode untuk mencari bilangan Fibonacci */
 public static long fib(long indeks){
 if (indeks == 0) // Kasus basis
 return 0;
 else if (indeks == 1) // Kasus basis
 return 1;
 else // Reduksi dan pemanggilan rekursif
 return fib(indeks - 1) + fib(indeks - 2);
 }
 }