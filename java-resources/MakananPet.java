import java.util.Scanner; //Diperlukan untuk kelas Scanner

/**
 Program ini mendemonstrasikan statemen switch
 */

public class MakananPet
{
   public static void main(String[] args)
   {
      String masukan; 			//Untuk menampung masukan user
      char peringkatMakanan; 	//Peringkat makanan pet

      //Menciptakan sebuah objek Scanner untuk masukan papantik
      Scanner keyboard = new Scanner(System.in);

      //Meminta user untuk memasukkan peringkat makanan pet
      System.out.println("Makanan pet tersedia dalam " +
                         "tiga peringkat.");
      System.out.print("A, B, dan C. Peringkat manakah " +
                       "yang Anda pilih? ");
      masukan = keyboard.nextLine();
      peringkatMakanan = masukan.charAt(0);

      //Menampilkan harga dari makanan pet terseleksi
      switch(peringkatMakanan)
      {
         case 'a':
         case 'A':
            System.out.println("30 ribu per Kg.");
            break;
         case 'b':
         case 'B':
            System.out.println("20 ribu per Kg.");
            break;
         case 'c':
         case 'C':
            System.out.println("15 ribu per Kg.");
            break;
         default:
            System.out.println("Pilih tak valid.");
      }
   }
}