import java.util.Random;

/**
 Kelas Pemain untuk permainan Cho-Han
 */

public class Pemain
{
   private String nama; 	//Nama pemain
   private String tebakan; 	//Tebakan dari pemain
   private int poin; 		//Poin dari pemain

   /**
    Konstruktor
    @param namaPemain Nama dari pemain.
   */    

   public Pemain(String namaPemain)
   {
      nama = namaPemain;
      tebakan = "";
      poin = 0;
   }

   /**  
    Metode buatTebakan menyebabkan pemain untuk menebak
    "Cho (genap)" atau "Han (ganjil)".
   */

   public void buatTebakan()
   {
      //Menciptakan sebuah objek Random
      Random acak = new Random();

      //Mendapatkan nilai acak, apakah 0 atau 1
      int nilaiTebakan = acak.nextInt(2);

      //Mengkonversi nilai acak menjadi sebuah tebakan
      //"Cho (genap)" atau "Han (ganjil)".
      if (nilaiTebakan == 0)
         tebakan = "Cho (genap)";
      else
         tebakan = "Han (ganjil)";
   }

   /**
    Metode tambahPoin menambahkan poin tertentu pada
    poin terkini dari pemain.
    @poinBaru Poin yang akan ditambahkan.
   */

   public void tambahPoin(int poinBaru)
   {
      poin += poinBaru;
   }

   /**
    Metode getNama menghasilkan nama pemain.
    @return Nilai dari bidang nama.
   */

   public String getNama()
   {
      return nama;
   }

   /**
    Metode getTebakan menghasilkan tebakan dari pemain.
    @return Nilai dari bidang tebakan.
   */

   public String getTebakan()
   {
      return tebakan;
   }

   /**
    Metode getPoin menghasilkan poin dari pemain
    @return Nilai dari bidang poin.
   */

   public int getPoin()
   {
      return poin;
   }
}