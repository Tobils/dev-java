/**
 Program ini mendemonstrasikan metode setPanjang, setLebar,
 getPanjang, dan getLebar dari kelas PersegiPanjang.
 */

public class DemoPanjangLebar
{
   public static void main(String[] args)
   {
      //Menciptakan sebuah objek PersegiPanjang 
      PersegiPanjang kotak = new PersegiPanjang();

      //Memanggil metode setPanjang dari objek kotak
      //dan melewatkan 10.0 sebagai argumen 
      kotak.setPanjang(10.0); 

      //Memanggil metode setLebar dari objek kotak
      //dan melewatkan 20.0 sebagai argumen 
      kotak.setLebar(20.0);
      
      //Menampilkan panjang dan lebar dari objek
      System.out.println("Panjang dari objek kotak adalah " +
                         kotak.getPanjang());
      System.out.println("Lebar dari objek kotak adalah " +
                         kotak.getLebar());
   }
}