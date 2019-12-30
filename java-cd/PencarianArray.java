/**
 Program ini secara sekuensial melakukan pencarian nilai
 pada sebuah array int.
 */

public class PencarianArray
{
   public static void main(String[] args)
   {
     int[] ujian = { 87, 75, 98, 100, 82 };
      int hasil;

      //Mencari nilai 100 di dalam array
      hasil = pencarianSekuensial(ujian, 100);

      //Menentukan apakah 100 ditemukan dan
      //menampilkan pesan yang sesuai.
      if (hasil == -1)
      {
         System.out.println("Anda tidak mendapatkan " +
                            "nilai 100 pada ujian apapun.");
      }
      else
      {
         System.out.println("Anda mendapatkan nilai 100 " +
                            "pada ujian " + (hasil + 1));
      }
   }

   /**
    Metode pencarianSekuensial melakukan pencarian nilai
    pada sebuah array.
    @param array Array tempat pencarian.
    @param nil Nilai yang akan dicari.
    @return Subskrip dari nilai yang dicari jika ditemukan
    di dalam array, jika tidak -1.
   */

   public static int pencarianSekuensial(int[] array,
                     int nil)
   {
      int indeks; 			//Variabel kendali loop
      int elemen; 			//Elemen dimana nil ditemukan
      boolean ditemukan; 	//Bendera yang mengindikasikan hasil pencarian

      //Elemen 0 adalah titik awal pencarian
      indeks = 0;

      //Menyimpan nilai-nilai default
      elemen = -1;
      ditemukan = false;

      //Melakukan pencarian
      while (!ditemukan && indeks < array.length)
      {
         if (array[indeks] == nil)
         {
            ditemukan = true;
            elemen = indeks;
         }
         indeks++;
      }

      return elemen;
   }
}