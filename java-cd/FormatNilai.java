/**
 Program ini mendemonstrasikan bagaimana menggunakan metode System.out.printf
 System.out.printf untuk memformat suatu nilai
*/

public class FormatNilai
{
   public static void main(String[] args)
   {
      double gajiBulanan = 5000000.0;
      double gajiTahunan = gajiBulanan * 12;
      System.out.printf("Gaji Anda per tahun adalah Rp. %,.2f\n", gajiTahunan);
   }
}