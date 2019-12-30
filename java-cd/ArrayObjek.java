import java.util.Scanner; //Diperlukan untuk kelas Scanner

/**
 Program ini bekerja dengan sebuah array yang berisi tiga
 objek AkunBank.
 */

public class ArrayObjek
{
   public static void main(String[] args)
   {
      final int BANYAK_AKUN = 3; //Banyak akun

      //Menciptakan sebuah array yang dapat mereferensi
      //objek-objek AkunBank.
      AkunBank[] akun = new AkunBank[BANYAK_AKUN];

      //Menciptakan objek-objek untuk array
      ciptakanAkun(akun);

      //Menampilkan saldo dari tiap elemen
      System.out.println("Berikut adalah saldo dari " +
                         "tiap akun:");

      for (int indeks = 0; indeks < akun.length; indeks++)
      {
         System.out.println("Akun " + (indeks + 1) +
                            ": Rp. " + akun[indeks].getSaldo());
      }
   }

   /**
    Metode ciptakanAkun menciptakan sebuah objek AkunBank
    untuk tiap elemen dari sebuah array. User diminta
    untuk memasukkan saldo dari tiap akun.
    @param array Array yang akan mereferensi akun
   */

   private static void ciptakanAkun(AkunBank[] array)
   {
      double saldo; //Untuk memuat sebuah saldo akun

      //Menciptakan sebuah objek Scanner
      Scanner keyboard = new Scanner(System.in);

      //Menciptakan akun
      for (int indeks = 0; indeks < array.length; indeks++)
      {
         //Mendapatkan saldo akun 
         System.out.print("Masukkan akun untuk " +
                          "akun ke-" + (indeks + 1) + ": ");
         saldo = keyboard.nextDouble();

         //Menciptakan akun
         array[indeks] = new AkunBank(saldo);
     }
   }
}