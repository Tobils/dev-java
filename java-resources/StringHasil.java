/**
 Program ini mendemonstrasikan sebuah metode yang
 menghasilkan sebuah referensi yang menunjuk ke objek String.
*/

public class StringHasil
{
   public static void main(String[] args)
   {
      String namaKonsumen;

      namaKonsumen = namaLengkap("John", "Kristof");
      System.out.println(namaKonsumen);
   }

   /**
    Metode namaLengkap menerima dua argumen String
    yang memuat nama depan dan nama belakang. Ia menyambung
    keduanya menjadi objek String tunggal.
    @param depan Nama depan.
    @param belakang Nama belakang.
    @return Sebuah referensi yang menunjuk ke suatu objek String
    yang memuat nama depan dan nama belakang.
   */

   public static String namaLengkap(String depan, String belakang)
   {
      String nama;

      nama = depan + " " + belakang;
      return nama;
   }
}