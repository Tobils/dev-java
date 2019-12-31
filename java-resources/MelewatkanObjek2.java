/**
 Program ini melewatkan sebuah objek sebagai argumen.
 Objek dimodifikasi oleh metode penerima.
 */

public class MelewatkanObjek2
{
   public static void main(String[] args)
   {
      //Menciptakan sebuah objek PersegiPanjang.
      PersegiPanjang kotak = new PersegiPanjang(12.0, 5.0);

      //Menampilkan isi objek.
      System.out.println("Isi dari objek kotak:");
      System.out.println("Panjang : " + kotak.getPanjang() +
                         " Lebar : " + kotak.getLebar());

      //Melewatkan sebuah referensi ke objek kepada
      //metode ubahPersegiPanjang method.
      ubahPersegiPanjang(kotak);

      //Menampilkan isi objek kembali.
      System.out.println("\nSekarang isi dari " +
                         "objek kotak adalah:");
      System.out.println("Panjang : " + kotak.getPanjang() +
                         " Lebar : " + kotak.getLebar());
   }

   /**
    Metode ubahPersegiPanjang menetapkan panjang dan lebar
    dari sebuah objek PersegiPanjang menjadi 0.
    @param r Objek PersegiPanjang yang akan diubah.
   */

   public static void ubahPersegiPanjang(PersegiPanjang r)
   {
      r.setPanjang(0.0);
      r.setLebar(0.0);
  }
}