/**
 Kelas ini menyimpan data tentang sebuah buku teks.
*/

public class BukuTeks
{
   private String judul; 		// Judul dari buku
   private String pengarang; 	// Nama belakang dari pengarang
   private String penerbit; 	// Nama dari penerbit

   /**
   Konstruktor ini menginisialisasi bidang judul,
   pengarang, dan penerbit.
   @param jdl Judul buku
   @param peng Nama pengarang
   @param pen Nama penerbit
   */

   public BukuTeks(String jdl, String peng,
      String pen)
   {
      judul = jdl;
      pengarang = peng;
      penerbit = pen;
   }

   /**
   Konstruktor penyalin menginisialisasi objek
   sebagai salinan dari objek BukuTeks yang lain.
   @param objek2 Objek yang akan disalin.
   */

   public BukuTeks(BukuTeks objek2)
   {
      judul = objek2.judul;
      pengarang = objek2.pengarang;
      penerbit = objek2.penerbit;
   }

   /**
   Metode set menetapkan nilai untuk tiap bidang
   @param jdl Judul buku
   @param peng Nama pengarang
   @param pen Nama penerbit
   */

   public void set(String jdl, String peng,
      String pen)
   {
      judul = jdl;
      pengarang = peng;
      penerbit = pen;
   }

   /**
   Metode toString 
   @return Sebuah string yang memuat informasi tentang
   buku teks.
   */

   public String toString()
   {
      // Menyimpan sebuah string yang merepresentasikan objek
      String str = "Judul: " + judul +
                   "\nPengarang: " + pengarang +
                   "\nPenerbit: " + penerbit;

      // Return the string.
      return str;
   }
}