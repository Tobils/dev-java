 /**
 Program ini mendemonstrasikan argumen-argumen String
 tidak dapat diubah.
 */

public class PelewatanString
{
   public static void main(String[] args)
   {
      //Menciptakan sebuah objek String yang memuat "Shakespeare".
      //Variabel nama mereferensi objek.
      String nama = "Shakespeare"; 

      //Menampilkan String yang direferensi oleh variabel nama
      System.out.println("Di dalam main, nama adalah " +
                         nama);

      //Memanggil metode ubahNama, melewatkan isi dari
      //variabel nama sebagai argumen.
      ubahNama(nama);

      //Menampilkan String yang direferensi oleh variabel nama
      System.out.println("Kembali di dalam main, nama adalah " +
                         nama);
   }

   /**
    Metode ubahNama menerima sebuah String sebagai argumennya
    dan menugaskan paramter str kepada String baru.
   */

   public static void ubahNama(String str)
   {
      //Menciptakan sebuah objek String yang memuat "Dickens".
      //Menugaskan alamatnya kepada variabel parameter str.
      str = "Dickens";

      //Menampilkan String yang direferensi oleh str.
      System.out.println("Di dalam ubahNama, nama " +
                         "sekarang adalah " + str);
 }
}