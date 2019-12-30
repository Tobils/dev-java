 import java.util.Scanner;

 public class HitungFaktorial {
 /** Metode utama */
 public static void main(String[] args) {
 // Menciptakan suatu Scanner
 Scanner masukan = new Scanner(System.in);
 System.out.print("Masukkan suatu integer non-negatif: ");
 int n = masukan.nextInt();

 // Menampilkan faktorial
 System.out.println("Faktorial dari " + n + " adalah "+ faktorial(n));
 }

 /** Mengembalikan nilai faktorial untuk suatu nilai tertentu */
 public static long faktorial(int n){
 if (n == 0) // Kasus basis
 return 1;
 else
 return n * faktorial(n - 1); // Pemanggilan rekursif
 }
 }