/**
  Kelas ini menyimpan data tentang seorang pengajar.
*/

public class Pengajar
{
   private String namaBelakang; 	// Nama belakang
   private String namaDepan; 		// Nama depan
   private String nomorNIP; 		// Nomor NIP

   /**
   Konstruktor ini menginisialisasi nama belakang,
   nama depan, dan nomor NIP.
   @param namaBlkg nama belakang dari pengajar.
   @param namaDpn nama depan dari pengajar.
   @param nip Nomor nip.
   */

   public Pengajar(String namaBlkg, String namaDpn,
      String nip)
   {
      namaBelakang = namaBlkg;
      namaDepan = namaDpn;
      nomorNIP = nip;
   }

   /**
   Konstruktor penyalin menginisialisasi objek sebagai
   salinan dari objek Pengajar yang lain.
   @param objek2 objek yang akan disalin.
   */

   public Pengajar(Pengajar objek2)
   {
      namaBelakang = objek2.namaBelakang;
      namaDepan = objek2.namaDepan;
      nomorNIP = objek2.nomorNIP;
   }

   /**
   Metode set menetapkan nilai untuk tiap bidang.
   @param namaBlkg Nama belakang dari pengajar.
   @param namaDpn Nama depan dari pengajar.
   @param nip Nomor NIP dari pengajar.
   */

   public void set(String namaBlkg, String namaDpn,
      String nip)
   {
      namaBelakang = namaBlkg;
      namaDepan = namaDpn;
      nomorNIP = nip;
   }

   /**
   Metode toString 
   @return Sebuah string yang memuat informasi
   tentang pengajar.
   */

   public String toString()
   {
      // Menciptakan sebuah string yang merepresentasikan objekt.
      String str = "Nama Belakang: " + namaBelakang +
                   "\nNama Depan: " + namaDepan +
                   "\nNomor NIP: " + nomorNIP;

      // Menghasilkan string
      return str;
   }
}