/**
 Program ini mendemonstrasikan sebuah tipe enumerasi.
 */

public class DemoEnum
{
   // Mendeklarasikan tipe enumerasi Hari
   enum Hari { MINGGU, SENIN, SELASA, RABU,
               KAMIS, JUMAT, SABTU }

   public static void main(String[] args)
   {
      // Mendeklarasikan sebuah variabel Hari dan menugaskannya sebuah nilai
      Hari hariKerja = Hari.RABU;

      // Statemen berikut menampilkan RABU
      System.out.println(hariKerja);

      // Statemen berikut menampilkan nilai ordinal
      // untuk Hari.MINGGU, yaitu 0.
      System.out.println("Nilai ordinal untuk " +
                          Hari.MINGGU + " adalah " +
                          Hari.MINGGU.ordinal());

      // Statemen berikut menampilkan nilai ordinal
      // untuk Hari.SABTU, yaitu 6.
      System.out.println("Nilai ordinal untuk " +
                          Hari.SABTU + " adalah " +
                          Hari.SABTU.ordinal());

      // Statemen berikut membandingkan dua konstanta enumerasi
      if (Hari.JUMAT.compareTo(Hari.SENIN) > 0)
         System.out.println(Hari.JUMAT + " lebih besar dari " +
                            Hari.SENIN);
      else
         System.out.println(Hari.JUMAT + " tidak lebih besar dari " +
                            Hari.SENIN);
   }
}