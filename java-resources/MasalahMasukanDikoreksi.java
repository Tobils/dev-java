import java.util.Scanner; //Diperlukan untuk kelas Scanner

/*
 Program ini secara tepat membaca masukan numeris dan masukan string
 */

public class MasalahMasukanDikoreksi
{
   public static void main(String[] args)
   {
      String nama; 			//Untuk memuat nama user
      int usia; 			//Untuk memuat usia user
      double pemasukan; 	//Untuk memuat pemasukan user

 	  //Menciptakan sebuah objek Scanner untuk membaca masukan
 	  Scanner keyboard = new Scanner(System.in);

      //Membaca usia user
      System.out.print("Berapa usia Anda? ");
      usia = keyboard.nextInt();

      //Membaca pemasukan user
      System.out.print("Berapa pemasukan tahunan Anda? ");
      pemasukan = keyboard.nextDouble();
      
      //Membuang karakter garis-baru yang tersisa
	  keyboard.nextLine();

      //Membaca nama user
      System.out.print("Siapa nama Anda? ");
      nama = keyboard.nextLine();

      //Menampilkan informasi kembali kepada user
      System.out.println("Halo, " + nama + ". Usia Anda adalah " +
                         usia + " tahun dan pemasukan Anda sebesar Rp. " +
                         pemasukan);
      }
}