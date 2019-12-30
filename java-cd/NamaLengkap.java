/**
 Kelas ini menyimpan nama depan, nama belakang, dan nama
 tengah dari seseorang. Kelas ini berbahaya karena ia tidak
 mencegah operasi pada bidang referensi null.
*/

public class NamaLengkap
{
   private String namaBelakang; 	// Nama belakang
   private String namaDepan; 		// Nama depan
   private String namaTengah; 		// Nama tengah

   /**
   Metode setNamaBelakang menetapkan bidang namaBelakang.
   @param str String yang akan ditetapkan menjadi namaBelakang.
   */

   public void setNamaBelakang(String str)
   {
      namaBelakang = str;
   }

   /**
   Metode setNamaDepan menetapkan bidang namaDepan.
   @param str String yang akan ditetapkan menjadi namaDepan.
   */

   public void setNamaDepan(String str)
   {
      namaDepan = str;
   }

   /**
   Metode setNamaTengah menetapkan bidang namaTengah.
   @param str String yang akan ditetapkan menjadi namaTengah.
   */

   public void setNamaTengah(String str)
   {
      namaTengah = str;
   }

   /**
   Metode getPanjang menghasilkan panjang 
   dari nama lengkap.
   @return Panjang.
   */

   public int getPanjang()
   {
      return namaBelakang.length() + namaDepan.length()
             + namaTengah.length();
   }

   /**
   Metode toString menghasilkan nama lengkap.
   @return Sebuah referensi ke sebuah String.
   */

   public String toString()
   {
      return namaDepan + " " + namaTengah + " "
             + namaBelakang;
   }
}