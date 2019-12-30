/**
 Program ini menggunakan subskrip tak valid pada sebuah array.
 */

public class SubskripTakValid
{
   public static void main(String[] args)
   {
      int[] nilai = new int[3];

      System.out.println("Saya akan mencoba untuk menyimpan empat " +
                         "nilai di dalam array tiga-elemen.");

      for (int indeks = 0; indeks < 4; indeks++)
      {
         System.out.println("Sekarang memproses elemen " + indeks);
                            nilai[indeks] = 10;
      }
   }
}