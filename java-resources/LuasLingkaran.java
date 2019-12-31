import java.util.Scanner;

/**
 Program ini mendemonstrasikan metode toUpperCase
 dari kelas Character.
*/

public class LuasLingkaran
{
   public static void main(String[] args)
   {
      double radius; 	// Radius lingkaran
      double luas; 		// Luas lingkaran
      String masukan; 	// Memuat sebaris masukan
      char pilihan; 	// Memuat karakter tunggal

      // Menciptakan sebuah objek Scanner untuk membaca masukan user
      Scanner keyboard = new Scanner(System.in);

      do
      {
         // Membaca radius lingkaran
         System.out.print("Masukkan radius lingkaran: ");
         radius = keyboard.nextDouble();

         // Menghapus karakter baris-baru tersisa
         keyboard.nextLine();

         // Menghitung dan menampilkan luas
         luas = Math.PI * radius * radius;
         System.out.printf("The luas is %.2f.\n", luas);

         // Ulangi lagi?
         System.out.print("Apakah Anda ingin melakukannya " +
            "kembali? (Y atau N) ");
         masukan = keyboard.nextLine();
         pilihan = masukan.charAt(0);

      } while (Character.toUpperCase(pilihan) == 'Y');
   }
}