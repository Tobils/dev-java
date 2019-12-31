/**
 Program ini mendefinisikan dan memanggil sebuah metode.
 */

public class MetodeSederhana
{
   public static void main(String[] args)
   {
      System.out.println("Halo dari metode main.");
      tampilkanPesan();
      System.out.println("Kembali ke metode main.");
   }

   /**
    Metode tampilkanPesan menampilkan pesan.
   */

   public static void tampilkanPesan()
   {
      System.out.println("Halo dari metode tampilkanPesan.");
   }
}