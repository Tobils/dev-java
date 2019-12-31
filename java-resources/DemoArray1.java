import java.util.Scanner; //Diperlukan untuk kelas Scanner

/**
 Program ini menunjukkan nilai-nilai yang disimpan di dalam
 elemen-elemen array dan yang ditampilkan.
*/

public class DemoArray1
{
   public static void main(String[] args)
   {
      final int KARYAWAN = 3; 			//Banyak karyawan
      int[] jam = new int[KARYAWAN]; 	//Array yang memuat sejumlah jam kerja

      //Menciptakan sebuah objek Scanner untuk masukan papantik.
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Masukkan jam kerja untuk " +
                         KARYAWAN + " karyawan.");

      //Memasukkan jam kerja oleh karyawan 1.
      System.out.print("Karyawan 1: ");
      jam[0] = keyboard.nextInt();

      //Memasukkan jam kerja oleh karyawan 2.
      System.out.print("Karyawan 2: ");
      jam[1] = keyboard.nextInt();

      //Memasukkan jam kerja oleh karyawan 3.
      System.out.print("Karyawan 3: ");
      jam[2] = keyboard.nextInt();

      //Menampilkan nilai-nilai yang dimasukkan
      System.out.println("Jam-jam yang dimasukkan adalah:");
      System.out.println(jam[0]);
      System.out.println(jam[1]);
      System.out.println(jam[2]);
   }
}