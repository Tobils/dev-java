import java.util.Scanner; //Diperlukan untuk kelas Scanner

 /**
 Program ini menghitung total berjalan dari poin-poin
 yang dimiliki tim soccer pada serangkaian permainan.
 User memasukkan serangkaian nilai, kemudian -1 untuk menghentikan.
 */

public class PoinSoccer
{
   public static void main(String[] args)
   {
      int poin; 			//Poin game
      int totalPoin = 0; 	//Akumulator diinisialisasi dengan 0

      //Menciptakan sebuah objek Scanner untuk masukan papantik
      Scanner keyboard = new Scanner(System.in);

      //Menampilkan instruksi
      System.out.println("Masukkan banyak nilai poin dari tim Anda");
      System.out.println("untuk tiap game musim ini.");
      System.out.println("Masukkan -1 untuk mengakhiri.");
      System.out.println();

      //Membaca poin pertama
      System.out.print("Masukkan poin game atau -1 untuk mengakhiri: ");
      poin = keyboard.nextInt();

      //Mengakumulasi poin sampai -1 dimasukkan
      while (poin != -1)
      {
         //Menambahkan poin pada totalPoin
         totalPoin += poin;

         //Membaca nilai poin selanjutnya
         System.out.print("Masukkan poin game atau -1 untuk mengakhiri: ");
         poin = keyboard.nextInt();
      }

      //Menampilkan total dari semau poin
      System.out.println("Total poin adalah " +
                         totalPoin);
   }
}