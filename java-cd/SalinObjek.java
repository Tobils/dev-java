/**
 Program ini menggunakan metode salin dari kelas Saham
 untuk menciptakan sebuah salinan dari objek Saham.
*/

public class SalinObjek
{
   public static void main(String[] args)
   {
      // Menciptakan sebuah objek Saham
      Saham perusahaan1 = new Saham("XYZ", 9.62);

      // Mendeklarasikan sebuah variabel Saham
      Saham perusahaan2;

      // Membuat perusahaan2 mereferensi sebuah salian dari objek
      // yang direferensi oleh perusahaan1.
      perusahaan2 = perusahaan1.salin();

      // Menampilkan isi dari kedua objek
      System.out.println("Perusahaan 1:\n" + perusahaan1);
      System.out.println();
      System.out.println("Perusahaan 2:\n" + perusahaan2);

      // Memastikan bahwa Anda memiliki dua objek
      if (perusahaan1 == perusahaan2)
      {
         System.out.println("Variabel perusahaan1 dan perusahaan2 " +
            "mereferensi objek-objek yang sama.");
      }
      else
      {
         System.out.println("Variabel perusahaan1 dan perusahaan2 " +
            "mereferensi objek-objek yang berbeda.");
      }
   }
}