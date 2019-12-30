import java.util.Scanner; //Diperlukan untuk kelas Scanner

/**
 Program ini menunjukkan sebuah array yang diproses dengan loop
*/

public class DemoArray2
{
   public static void main(String[] args)
   {
      final int KARYAWAN = 3; 			//Banyak karyawan
      int[] jam = new int[KARYAWAN]; 	//Array yang memuat sejumlah jam kerja

      //Menciptakan sebuah objek Scanner untuk masukan papantik.
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Masukkan jam kerja untuk " +
                         KARYAWAN + " karyawan.");

      //Menyimpan tiap elemen dari array jam.
      for (int indeks = 0; indeks < KARYAWAN; indeks++)
      {
         System.out.print("Karyawan " + (indeks + 1) + ": ");
         jam[indeks] = keyboard.nextInt();
      }

      System.out.println("Jam-jam yang dimasukkan adalah:");
      
       //Menampilkan nilai-nilai yang dimasukkan
      for (int indeks = 0; indeks < KARYAWAN; indeks++)
         System.out.println(jam[indeks]);
   }
}