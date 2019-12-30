/**
 Program ini mendemonstrasikan kelas MataKuliah.
*/

public class DemoMataKuliah
{
   public static void main(String[] args)
   {
      // Menciptakan sebuah objek Pengajar
      Pengajar pengajarKu =
         new Pengajar("Sianipar", "Rismon", "RHS1977");

      // Menciptakan sebuah objek BukuTeks
      BukuTeks bukuTeksKu =
         new BukuTeks("Java Untuk Programer",
           "Sianipar", "Rismon");

      // Menciptakan sebuah objek MataKuliah
      MataKuliah kuliahKu =
         new MataKuliah("Pengantar Java", pengajarKu,
           bukuTeksKu);

      // Menampilkan informasi matakuliah
      System.out.println(kuliahKu);
   }
}