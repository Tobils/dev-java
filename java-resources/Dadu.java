import java.util.Random;

/**
 Kelas Dadu mensimulasikan sebuah dadu enam-sisi.
 */

public class Dadu
{
   private int sisi; 	//Banyak sisi
   private int nilai; 	//Nilai dadu

   /**
    Konstruktor melakukan lemparan awal
    dari dadu.
    @param banyakSisi Banyak sisi dari dadu ini.
   */

   public Dadu(int banyakSisi)
   {
      sisi = banyakSisi;
      lempar();
   }

   /**
    Metode lempar mensimulasikan pelemparan
    dari dadu.
   */

   public void lempar()
   {
      //Menciptakan sebuah objek Random
      Random acak = new Random();

      //Mendapatkan sebuah nilai acak untuk dadu
      nilai = acak.nextInt(sisi) + 1;
   }

   /**
    Metode getSisi
    @return Banyak sisi dari dadu.
   */

   public int getSisi()
   {
      return sisi;
   }

   /**
    Metode getNilai
    @return Nilai dari dadu. 
   */

   public int getNilai()
   {
      return nilai;
   }
}