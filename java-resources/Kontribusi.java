//Program ini menghitung porsi gaji yang akan
//dikontribusikan untuk jaminan pensiun jika 5%,
// 8%, atau 10% dari gaji bulanan diberikan.

public class Kontribusi
{
   public static void main(String[] args)
   {
      //Variabel-variabel untuk memuat gaji bulanan dan
      //jumlah kontribusi untuk tabungan pensiun
      double gajiBilanan = 6000.0;
      double kontribusi;

      //Menghitung dan menampilkan kontribusi 5%
      kontribusi = gajiBilanan * 0.05;
      System.out.println("5 persen sebesar Rp. " +
                          kontribusi +
                         " per bulan.");

      ///Menghitung dan menampilkan kontribusi 8%
      kontribusi = gajiBilanan * 0.08;
      System.out.println("8 persen sebesar Rp. " +
                          kontribusi +
                         " per bulan.");

      ///Menghitung dan menampilkan kontribusi 10%
      kontribusi = gajiBilanan * 0.1;
      System.out.println("10 persen sebesar Rp. " +
                          kontribusi +
                         " per bulan.");
   }
}