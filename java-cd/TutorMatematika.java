import java.util.Scanner; 	//Diperlukan untuk kelas Scanner
import java.util.Random; 	//Diperlukan untuk kelas Random

/**
 Program ini mendemonstrasikan kelas Random
 */

public class TutorMatematika
{
   public static void main(String[] args)  
   { 
      int angka1; 	//Sebuah nilai
      int angka2; 	//Nilai lain
      int jum; 		//Penjumlahan atas nilai-nilai
      int jawabanUser; //Jawaban user

      //Menciptakan sebuah Scanner untuk masukan papantik
      Scanner keyboard = new Scanner(System.in);

      //Menciptakan sebuah objek kelas Random
      Random nilaiAcak = new Random();

      //Membaca dua nilai acak
      angka1 = nilaiAcak.nextInt(100);
      angka2 = nilaiAcak.nextInt(100);

      // Display an addition problem.
      System.out.println("Apa jawaban dari " +
                         "permasalahan ini?");
      System.out.print(angka1 + " + " +
                       angka2 + " = ? ");

      //Menghitung jawaban
      jum = angka1 + angka2;

      //Mendapatkan jawaban user
      jawabanUser = keyboard.nextInt();

      //Menampilkan hasil user
      if (jawabanUser == jum)
         System.out.println("Tepat!");
      else
      {
         System.out.println("Maaf, jawaban salah. " +
                            "Jawaban yang tepat adalah " +
                            jum);
      }
   }
}