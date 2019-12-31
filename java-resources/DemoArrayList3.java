import java.util.ArrayList; //Diperlakukan untuk kelas ArrayList 

/**
 Program ini mendemonstrasikan sebuah ArrayList.
 */

public class DemoArrayList3
{
   public static void main(String[] args)
   {
      //Menciptakan sebuah ArrayList untuk memuat beberapa nama
      ArrayList<String> namaList = new ArrayList<String>();

      //Menambahkan sejumlah nama ke dalam ArrayList.
      namaList.add("John");
      namaList.add("Kristof");
      namaList.add("Bonar");

      //Menampilkan item-item di dalam namaList dan indeksnya
      for (int indeks = 0; indeks < namaList.size(); indeks++)
      {
         System.out.println("Indeks: " + indeks + " Nama: " +
         namaList.get(indeks));
      }

      //Sekarang, hapus item pada indeks 1.
      namaList.remove(1);

      System.out.println("Item pada indeks 1 dihapus. " +
                         "Berikut adalah item-item sekarang.");

      //Menampilkan item-item di dalam namaList dan indeksnya
      for (int indeks = 0; indeks < namaList.size(); indeks++)
      {
         System.out.println("Indeks: " + indeks + " Nama: " +
         namaList.get(indeks));
      }
   }
}