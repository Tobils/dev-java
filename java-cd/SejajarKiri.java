/**
 Program ini menampilkan sejumlah varietas
 dari nilai yang disejajarkan ke kiri.
 */

public class SejajarKiri
{
   public static void main(String[] args)
   {
      //Mendeklarasikan sejumlah variabel int
      int nil1 = 123;
      int nil2 = 12;
      int nil3 = 45678;
      int nil4 = 456;
      int nil5 = 1234567;
      int nil6 = 1234;

      //Menampilkan tiap variabel yang disejajarkan ke kiri
      //di dalam suatu bidang dengan lebar 8 spasi
      System.out.printf("%-8d%-8d\n", nil1, nil2);
      System.out.printf("%-8d%-8d\n", nil3, nil4);
      System.out.printf("%-8d%-8d\n", nil5, nil6);
   }
}