import java.util.Scanner;

/**
 Program ini menjalankan pengujian sederhana atas 
 kelas TeleponSeluler.
 */

public class UjiTeleponSeluler
{
   public static void main(String[] args)
   {
      String ujiMan; 	//Untuk memuat manufaktur
      String ujiMod; 	//Untuk memuat manufaktur nomor model
      double ujiHarga; 	//Untuk memuat manufaktur harga ritel

      //Menciptakan sebuah objek Scanner untuk masukan papantik
      Scanner keyboard = new Scanner(System.in);

      //Membaca nama manufaktur
      System.out.print("Masukkan manufaktur: ");
      ujiMan = keyboard.nextLine();

      //Membaca nomor model
      System.out.print("Masukkan nomor model: ");
      ujiMod = keyboard.nextLine();

      //Membaca harga ritel
      System.out.print("Masukkan harga ritel: ");
      ujiHarga = keyboard.nextDouble();

      //Menciptakan sebuah objek dari kelas TeleponSeluler,
      //melewatkan data yang dimasukkan sebagai argumen-argumen
      //kepada konstruktor   
      TeleponSeluler telp = new TeleponSeluler(ujiMan, ujiMod, ujiHarga);

      //Membaca data dari telepon dan menampilkannya.
      System.out.println();
      System.out.println("Berikut adalah data yang Anda sediakan:");
      System.out.println("Manufaktur: " + telp.getManufaktur());
      System.out.println("Nomor model: " + telp.getModel());
      System.out.println("Harga ritel: " + telp.getHargaRitel());
   }
}