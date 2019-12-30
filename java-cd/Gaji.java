import java.util.Scanner; //Diperlukan untuk kelas Scanner

/**
 Program ini mendemonstrasikan kelas Scanner
 */

public class Gaji
{
   public static void main(String[] args)
   {
      String nama; 			//Untuk memuat nama
      int jam; 				//Jumlah jam kerja
      double gajiPerJam; 	//Gaji per jam
      double gajiKotor; 	//Gaji kotor

      //Menciptakan sebuah objek Scanner untuk membaca masukan
      Scanner keyboard = new Scanner(System.in);

      //Membaca nama user
      System.out.print("Siapakah nama Anda? ");
      nama = keyboard.nextLine();

      //Membanyak banyak jam kerja minggu ini
      System.out.print("Berapakah banyak jam kerja Anda minggu ini? ");
      jam = keyboard.nextInt();

      //Membaca gaji per jam dari user
      System.out.print("Berapakah gaji per jam Anda? ");
      gajiPerJam = keyboard.nextDouble();

      //Menghitung gaji kotor
      gajiKotor = jam * gajiPerJam;

      //Menampilkan informasi yang dihasilkan
      System.out.println("Halo, " + nama);
      System.out.println("Gaji kotor Anda adalah Rp. " + gajiKotor);
   }
}