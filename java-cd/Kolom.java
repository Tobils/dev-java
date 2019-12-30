/**
 Program ini menampilkan sejumlah varietas dari
 nilai titik-mengambang pada sebuah kolom
 dengan titik desimal disejajarkan.
 */

public class Kolom
{
   public static void main(String[] args)
   {
      //Mendeklarasikan sejumlah varietas dari variabel double
      double angka1 = 127.899;
      double angka2 = 3465.148;
      double angka3 = 3.776;
      double angka4 = 264.821;
      double angka5 = 88.081;
      double angka6 = 1799.999;

      //Menampilkan tiap variabel pada sebuah bidang dengan
      //8 spasi dengan 2 titik desimal (di belakang titik desimal)
      System.out.printf("%8.2f\n", angka1);
      System.out.printf("%8.2f\n", angka2);
      System.out.printf("%8.2f\n", angka3);
      System.out.printf("%8.2f\n", angka4);
      System.out.printf("%8.2f\n", angka5);
      System.out.printf("%8.2f\n", angka6);
   }
}