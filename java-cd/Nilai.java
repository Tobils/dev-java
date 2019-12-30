/**
 Kelas Nilai menghitung rerata atas
 sebuah array yang memuat beberapa skor ujian, dengan
 skor terendah diabaikan.
 */

public class Nilai
{
   //Bidang skorUjian adalah sebuah variabel
   //yang mereferensi sebuah array yang memuat
   //sejumlah skor ujian.
   private double[] skorUjian;

   /**
    Konstruktor
    @param arraySkor Sebuah array yang memuat beberapa skor ujian.
   */

   public Nilai(double[] arraySkor)
   {
      //Menugaskan argumen array kepada
      //bidang skorUjian.
      skorUjian = arraySkor;
   }

   /**
      Metode getSkorTerendah 
      @return Skor ujian terendah.
   */

   public double getSkorTerendah()
   {
      double terendah; //Untuk memuat skor terendah

      //Membaca skor ujian pertama di dalam array.
      terendah = skorUjian[0];

      //Menjejak sisa array. Ketika sebuah nilai
      //lebih rendah dari terendah ditemukan, maka tugaskan
      //nilai itu kepada terendah.
      for (int indeks = 1; indeks < skorUjian.length; indeks++)
      {
         if (skorUjian[indeks] < terendah)
            terendah = skorUjian[indeks];
      }

      //Menghasilkan skor ujian terendah
      return terendah;
   }

   /**
    Metode getRerata 
    @return Rerata atas skor-skor ujian
    dengan skor terendah diabaikan.
   */

   public double getRerata()
   {
      double total = 0; 	//Untuk memuat total skor
      double terendah; 		//Untuk memuat skor terendah
      double rerata; 		//Untuk memuat rerata

      //Jika array memuat kurang dari dua skor ujia,
      //maka tampilkan pesan error dan tetapkan
      //rerata menjadi 0.
      if (skorUjian.length < 2)
      {
         System.out.println("ERROR: Anda sedikitnya harus memiliki " +
                            "dua skor ujian!");
                            rerata = 0;
      }
      else
      {
         //Pertama, menghitung total skor
         for (double skor : skorUjian)
            total += skor;

         //Selanjutnya, mencari skor terendah
         terendah = getSkorTerendah();

         //Mengurangkan skor terendah dari total
         total -= terendah;

         //Menghitung rerata terperbarui
         rerata = total / (skorUjian.length - 1);
      }

      //Menghasilkan rerata terpebarui
      return rerata;
   }
}