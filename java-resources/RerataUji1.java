import java.util.Scanner; //Diperlukan untuk kelas Scanner

/**
 Program ini mendemonstrasikan loop yang dikendalikan user
 */

public class RerataUji1
{
   public static void main(String[] args)
   {
      int skor1, skor2, skor3; 	//Tiga skor ujian
      double rerata; 			//Skor rerata ujian
      char ulangi; 				//Untuk memuat 'y' atau 't'
      String masukan; 			// To hold masukan

      System.out.println("Program ini menghitung rerata " +
                         "dari tiga skor ujian.");

      //Menciptakan sebuah Scanner untuk masukan papantik
      Scanner keyboard = new Scanner(System.in);

      //Membaca sebanyak skor ujian yang diingikan user
      do
      {
         //Membaca skor pertama
         System.out.print("Masukkan skor #1: ");
         skor1 = keyboard.nextInt();

         //Membaca skor kedua
         System.out.print("Masukkan skor #2: ");
         skor2 = keyboard.nextInt();

         //Membaca skor ketiga
         System.out.print("Masukkan skor #3: ");
         skor3 = keyboard.nextInt();

         //Membuag karakter garis-baru
         keyboard.nextLine();

         //Menghitung dan menampilkan skor rerata
         rerata = (skor1 + skor2 + skor3) / 3.0;
         System.out.println("Rerata adalah " + rerata);
         System.out.println(); //Menampilkan baris kosong

         //Apakah user ingin menghitung rerata dari tiga skor lain?
         System.out.println("Apakah Anda ingin menghitung rerata " +
                            "atas tiga skor ujian lagi?");
         System.out.print("Masukkan Y jika ya atau T jika tidak: ");
         masukan = keyboard.nextLine(); //Membaca satu baris
         ulangi = masukan.charAt(0); 	//Membaca karakter pertama

      } while (ulangi == 'Y' || ulangi == 'y');
   }
}