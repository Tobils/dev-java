/**
 Program ini mendemonstrasikan operator ++ dan --
 */

public class Prefiks
{
   public static void main(String[] args)
   {
      int angka = 4; //angka diawali dengan nilai 4

      //Menampilkan nilai dari angka
      System.out.println("Variabel angka bernilai " + angka);
      System.out.println("Saya akan menginkremen angka.");

      //Menginkremen angka
      ++angka;

      //Menampilkan nilai dari angka kembali
      System.out.println("Sekarang, angka menjadi " + angka);
      System.out.println("Saya akan mendekremen angka.");

      //Mendekremen angka
      --angka;

      //Menampilkan nilai dari angka sekali lagi
      System.out.println("Sekarang, angka menjadi " + angka);
   }
}