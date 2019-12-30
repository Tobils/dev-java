/**
 Program ini menampilkan suatu tabel kecepatan dimana
 kpj dikonversi menjadi mpj.
 */

public class KonverterKecepatan
{
   public static void main(String[] args)
   {
      //Konstanta-konstanta
      final int KPJ_AWAL = 60; 		//Kecepatan awal
      final int MAKS_KPJ = 130; 	//Kecepatan maksimum
      final int INKREMEN = 10; 		//Inkremen kecepatan

      //Variabel-variabel
      int kpj; 		//Untuk memuat kecepatan dalam kpj
      double mpj; 	//Untuk memuat kecepatan dalam mpj

      //Menampilkan kepala tabel
      System.out.println("KPJ\t\tMPJ");
      System.out.println("-------------------");

      //Menampilkan kecepatan
      for (kpj = KPJ_AWAL; kpj <= MAKS_KPJ; kpj += INKREMEN)
      {
         //Menghitung mpj.
         mpj = kpj * 0.6214;

         //Menampilkan kecepatan dalam kpj dan mpj
         System.out.printf("%d\t\t%.1f\n", kpj, mpj);
      }
   }
}