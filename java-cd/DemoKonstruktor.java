/**
 Program ini mendemonstrasikan konstruktor dari
 kelas PersegiPanjang.
 */

public class DemoKonstruktor
{
   public static void main(String[] args)
   {
      //Menciptakan sebuah objek PersegiPanjang, melewatkan 5.0 dan
      //15.0 sebagai argumen kepada konstruktor.
      PersegiPanjang kotak = new PersegiPanjang(5.0, 15.0);

      //Menampilkan panjang
      System.out.println("Panjang kotak adalah " +
                         kotak.getPanjang());

      //Menampilkan lebar
      System.out.println("Lebar kotak adalah " +
                         kotak.getLebar());

      //Menampilkan luas
      System.out.println("Luas kotak adalah " +
                         kotak.getLuas());
   }
}