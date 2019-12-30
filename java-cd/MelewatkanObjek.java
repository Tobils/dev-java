/**
 Program ini melewatkan sebuah objek sebagai argumen.
 */

public class MelewatkanObjek
{
   public static void main(String[] args)
   {
      //Menciptakan sebuah objek PersegiPanjang 
      PersegiPanjang kotak = new PersegiPanjang(12.0, 5.0);

      //Melewatkan sebuah referensi yang menunjuk ke objek 
      //kepada metode tampilPersegiPanjang.
      tampilPersegiPanjang(kotak);
   }

   /**
    Metode tampilPersegiPanjang menampilkan
    panjang dan lebar dari sebuah persegipanjang.
    @param r Sebuah referensi yang menunjuk ke sebuah
    objek PersegiPanjang.
   */

   public static void tampilPersegiPanjang(PersegiPanjang r)
   {
      //Menampilkan panjang dan lebar
      System.out.println("Panjang : " + r.getPanjang() +
                         " Lebar : " + r.getLebar());
   }
}