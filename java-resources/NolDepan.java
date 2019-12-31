/**
 Program ini menampilkan sejumlah nilai yang diganjal dengan nol-nol depan
*/

public class NolDepan
{
   public static void main(String[] args)
   {
      //Mendeklarasikan sejumlah variabel double
      double angka1 = 1.234;
      double angka2 = 12.345;
      double angka3 = 123.456;

      //Menampilkan tiap variabel dengan nol-nol depan
      //di dalam sebuah bidang 9 spasi, yang dibulatkan
      //menjadi 2 titik desimal
      System.out.printf("%09.2f\n", angka1);
      System.out.printf("%09.2f\n", angka2);
      System.out.printf("%09.2f\n", angka3);
   }
}