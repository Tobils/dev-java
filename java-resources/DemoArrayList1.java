import java.util.ArrayList; //Diperlukan untuk kelas ArrayList

/**
 Program ini mendemonstrasikan sebuah ArrayList.
 */

public class DemoArrayList1
{
   public static void main(String[] args)
   {
      //Menciptakan sebuah ArrayList untuk memuat beberapa nama
      ArrayList<String> namaList = new ArrayList<String>();

      //Menambahkan sejumlah nama ke dalam ArrayList.
      namaList.add("John");
      namaList.add("Kristof");
      namaList.add("Bonar");

      //Menampilkan ukuran dari ArrayList.
      System.out.println("ArrayList memiliki " +
                         namaList.size() +
                         " objek disimpan di dalamnya.");

      //Sekarang menampilkan item-item di dalam namaList.
      for (int indeks = 0; indeks < namaList.size(); indeks++)
         System.out.println(namaList.get(indeks));
   }
}