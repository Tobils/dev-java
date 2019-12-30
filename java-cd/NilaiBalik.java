/**
 Program ini mendemonstrasikan sebuah metode penghasil-nilai.
 */

public class NilaiBalik
{
   public static void main(String[] args)
   {
      int total, nilai1 = 20, nilai2 = 40;

      //Memanggil metode jum, melewatkan isi dari
      //nilai1 dan nilai2 sebagai argumen. Menugaskan
      //nilai balik kepada variabel lokal.
      total = jum(nilai1, nilai2);

      //Menampilkan isi dari variabel-variabel ini
      System.out.println("Penjumlahan atas " + nilai1 +
                         " dan " + nilai2 + " adalah " +
                         total);
   }

   /**
    Metode jum menghasilkan penjumlahan atas kedua parameternya
    @param nil1 Nilai pertama yang dijumlahkan
    @param nil2 Nilai kedua yang dijumlahkan
    @return Penjumlahan atas nil1 dan nil2
   */

   public static int jum(int nil1, int nil2)
   {
      int hasil; //hasil adalah variabel lokal

      //Menugaskan nil1+nil2 kepada hasil
      hasil = nil1 + nil2;

      //Menghasilkan nilai disimpan dalam variabel hasil
      return hasil;
   }
}