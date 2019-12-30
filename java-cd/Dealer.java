/**
 Kelas Dealer untuk permainan Cho-Han
*/

public class Dealer
{
   private int nilaiDadu1; 	//Nilai dari dadu #1
   private int nilaiDadu2; 	//Nilai dari dadu #2

   /**
    Konstruktor
   */

   public Dealer()
   {
      nilaiDadu1 = 0;
      nilaiDadu2 = 0;
   }

   /**
    Metode lemparDadu melempar dua dadu dan menyimpan
    nilai-nilainya.
   */

   public void lemparDadu()
   {
      final int SISI = 6; //Banyak sisi dari kedua dadu

      //Menciptakan dua dadu
      Dadu dadu1 = new Dadu(SISI);
      Dadu dadu2 = new Dadu(SISI);

      //Menyimpan nilai-nilai dadu
      nilaiDadu1 = dadu1.getNilai();
      nilaiDadu2 = dadu2.getNilai();
   }        

   /**
    Metode getChoAtauHan memberikan hasil dari
    pelemparan dadu, Cho atau Han.
    @return Menghasilkan "Cho (genap)" atau "Han (ganjil)"
   */

   public String getChoAtauHan()
   {
      String hasil; //Untuk memuat hasil   

      //Menentukan penjumlahan atas dua nilai dadu
      int jum = nilaiDadu1 + nilaiDadu2;    

      //Menentukan genap atau ganjil
      if (jum % 2 == 0)
         hasil = "Cho (genap)";
      else
         hasil = "Han (ganjil)";

      //Memberikan hasil
      return hasil;
   }

   /**
    Metode getNilaiDadu1 menghasilkan nilai dari
    dadu #1.
   @return Bidang nilaiDadu1 
  */

   public int getNilaiDadu1()
   {
      return nilaiDadu1;
   }

   /**
    Metode getNilaiDadu2 menghasilkan nilai dari
    dadu #2.
    @return Bidang nilaiDadu2 
   */

   public int getNilaiDadu2()
   {
      return nilaiDadu2;
   }
}