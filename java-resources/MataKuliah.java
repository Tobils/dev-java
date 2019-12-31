/**
 Kelas ini menyimpan data seputar sebuah mata kuliah.
 */

public class MataKuliah
{
   private String namaMtKuliah; 	// Nama matakuliah
   private Pengajar pengajar; 		// Pengajar
   private BukuTeks bukuTeks; 		// Buku teks

   /**
   Konstruktor ini menginisialisasi bidang namaMtKuliah,
   pengajar, dan bukuTeks.
   @param nama Nama dari matakuliah.
   @param pengajar Sebuah objek Pengajar.
   @param teks Sebuah objek BukuTeks.
   */

   public MataKuliah(String nama, Pengajar ajar,
      BukuTeks teks)
   {
      // Menugaskan nama matakuliah
      namaMtKuliah = nama;

      // Menciptakan sebuah objek Pengajar, melewatkan
      // ajar sebagai argumen kepada konstruktor penyalin.
      pengajar = new Pengajar(ajar);

      // Menciptakans sebuah objek BukuTeks, melewatkan teks
      // sebagai argumen kepada konstruktor penyalin.
      bukuTeks = new BukuTeks(teks);
   }

   /**
   Metode getNama
   @return Nama dari matakuliah.
   */

   public String getNama()
   {
      return namaMtKuliah;
   }

   /**
   Metode getPengajar
   @return Sebuah referensi ke sebuah salinan dari
   objek Pengajar.
   */

   public Pengajar getPengajar()
   {
      // Menghasilkan sebuah salinan dari objek pengajar.
      return new Pengajar(pengajar);
   }

   /**
   Metode getBukuTeks
   @return Sebuah referensi ke suatu salinan dari
   objek BukuTeks.
   */

   public BukuTeks getBukuTeks()
   {
      // Menghasilkan sebuah salinan dari objek bukuTeks
      return new BukuTeks(bukuTeks);
   }

   /**
   Metode toString 
   @return Sebuah string yang memuat informasi mata kuliah
   */

   public String toString()
   {
      // Menciptakan sebuah string yang mereprsentasikan objek
      String str = "Nama mata kuliah: " + namaMtKuliah +
                   "\nInformasi pengajar:\n" +
                   pengajar +
                   "\nInformasi buku teks:\n" +
                   bukuTeks;

      // Menghasilkan string
      return str;
   }
}