 /**
 Program ini mendemonstrasikan bahwa hanya salinan argumen
 yang dilewatkan ke suatu metode
 */

public class PelewatanDenganNilai
{
   public static void main(String[] args)
   {
      int angka = 99; //angka diawali dengan nilai 99

      //Menamilkan nilai di dalam angka
      System.out.println("angka adalah " + angka);

      //Memanggil ubahSaya, melewatkan nilai di dalam angka
      //sebagai sebuah argumen
      ubahSaya(angka);

      //Menampilkan nilai di dalam angka kembali
      System.out.println("angka adalah " + angka);
   }

   /**
    Metode ubahSata menerima sebuah argumen dan kemudian
    mengubah nilai dari parameter
   */

   public static void ubahSaya(int nilaiKu)
   {
      System.out.println("Saya mengubah nilai.");

      //Mengubah variabel parameter nilaiKu menjadi 0.
      nilaiKu = 0;

      //Menampilkan nilai di dalam variabel nilaiKu
      System.out.println("Sekarang nilai adalah " + nilaiKu);
   }
}