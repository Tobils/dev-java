/**
 Program ini mendemonstrasikan metode setPanjang
 dari kelas PersegiPanjang.
 */

public class DemoPanjang
{
   public static void main(String[] args)
   {
      //Menciptakan sebuah objek PersegiPanjang dan menugaskan
      //alamatnya kepada variabel kotak.
      PersegiPanjang kotak = new PersegiPanjang();

      //Mengindikasikan apa yang sedang dilakukan
      System.out.println("Mengirim nilai 10.0 " +
         "kepada metode setPanjang.");

      //Memanggil metode setPanjang dari objek kotak
      kotak.setPanjang(10.0); 

      //Mengindikasikan telah selesai
      System.out.println("Selesai.");
   }
}