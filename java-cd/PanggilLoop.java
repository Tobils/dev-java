/**
 Program ini mendefinisikan dan memanggil suatu metode
 */

public class PanggilLoop
{
   public static void main(String[] args)
   {
      System.out.println("Halo dari metode main.");
      for (int i = 0; i < 5; i++)
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