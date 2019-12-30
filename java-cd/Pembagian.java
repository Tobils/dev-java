import java.util.Scanner;  //Diperlukan untuk kelas Scanner

/**
 Program ini mendemonstrasikan statemen if-else
 */

public class Pembagian
{
   public static void main(String[] args)
   {
      double angka1, angka2; 	//Operand-operand pembagian
      double hasilBagi; 		//Hasil pembagian

      //Menciptakan sebuah objek Scanner untuk masukan papantik
      Scanner keyboard = new Scanner(System.in);

      //Membaca nilai pertama
      System.out.print("Masukkan sebuah nilai: ");
      angka1 = keyboard.nextDouble();

      //Membaca nilai kedua
      System.out.print("Masukkan nilai lain: ");
      angka2 = keyboard.nextDouble();

      if (angka2 == 0)
      {
         System.out.println("Pembagian nol tidak dimungkinkan.");
         System.out.println("Silahkan jalankan program kembali dan ");
         System.out.println("masukkan sebuah nilai selain nol.");
      }
      else
      {
         hasilBagi = angka1 / angka2;
         System.out.print("Hasil pembagian " + angka1);
         System.out.print(" dengan" + angka2);
         System.out.println(" adalah " + hasilBagi);
      }
   }
}