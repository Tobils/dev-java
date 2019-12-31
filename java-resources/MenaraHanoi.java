 import java.util.Scanner;

 public class MenaraHanoi {
 /** Metode utama */
 public static void main(String[] args) {
 // Menciptakan suatu Scanner
 Scanner masukan = new Scanner(System.in);
 System.out.print("Masukkan sejumlah disk: ");
 int n = masukan.nextInt();

 // Mencari solusi secara rekursif
 System.out.println("Perpindahan yang dilakukan adalah:");
 pindahDisk(n, 'A', 'B', 'C');
 }

 /** Metode untuk mencari solusi untuk memindahkan n disk 
     dari dariMenara ke keMenara dengan bantuan bantuanMenara */
 public static void pindahDisk(int n, char dariMenara,
 char keMenara, char bantuanMenara) {
 if (n == 1) // Kondisi penghenti
 System.out.println("Memindahkan disk " + n + " dari " +
 dariMenara + " ke " + keMenara);
 else {
 pindahDisk(n - 1, dariMenara, bantuanMenara, keMenara);
 System.out.println("Memindahkan disk " + n + " dari " +
 dariMenara + " ke " + keMenara);
 pindahDisk(n - 1, bantuanMenara, keMenara, dariMenara);
 }
 }
 }
