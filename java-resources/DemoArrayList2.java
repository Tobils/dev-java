import java.util.ArrayList; //Diperlukan untuk kelas ArrayList 

/**
 Program ini mendemonstrasikan bagaimana loop for terperbaiki
 dapat dipakai pada ArrayList.
 */

public class DemoArrayList2
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

      //Sekarang menampilkan item-item di dalam namaList
      for (String nama : namaList)
         System.out.println(nama);
   }
}