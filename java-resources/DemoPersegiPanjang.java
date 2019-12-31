/**
 Program ini mendemonstrasikan metode setPanjang, setLebar,
 getPanjang, getLebar, dan getLuas dari kelas PersegiPanjang.
 */

public class DemoPersegiPanjang
{
   public static void main(String[] args)
   {
      //Menciptakan sebuah objek PersegiPanjang 
      PersegiPanjang kotak = new PersegiPanjang();

      //Menetapkan panjang 10.0 dan lebar 20.0
      kotak.setPanjang(10.0); 
      kotak.setLebar(20.0);
      
      //Menampilkan panjang 
      System.out.println("Panjang dari objek kotak adalah " +
                         kotak.getPanjang());
      
      //Menampilkan lebar
      System.out.println("Lebar dari objek kotak adalah " +
                         kotak.getLebar());
      
      //Menampilkan luas
      System.out.println("Luas dari objek kotak adalah " +
                         kotak.getLuas());
   }
}