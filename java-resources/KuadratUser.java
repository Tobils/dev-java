import java.util.Scanner; //Diperlukan untuk kelas Scanner

/**
 Program ini mendemonstrasikan loop for dikendalikan user
 */

public class KuadratUser
{
   public static void main(String[] args)
   {
      int angka; 		//Variabel kendali loop
      int nilaiMaks; 	//Nilai maks yang akan ditampilkan

      System.out.println("Saya akan menampilkan sebuah tabel " +
                         "yang memuat nilai-nilai dan kuadratnya.");

      //Menciptakan sebuah objek Scanner untuk masukan papantik
      Scanner keyboard = new Scanner(System.in);

      //Membaca nilai maksimum yang akan ditampilkan
      System.out.print("Masukkan nilai maks yang akan ditampilkan? ");
      nilaiMaks = keyboard.nextInt();
 
      //Menampilkan tabel
      System.out.println("Angka  Angka Terkuadrat");
      System.out.println("------------------------");
      for (angka = 1; angka <= nilaiMaks; angka++)
      {
         System.out.println(angka + "\t\t" +
                            angka * angka);
      }
   }
}