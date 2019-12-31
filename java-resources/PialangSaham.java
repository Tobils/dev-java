import java.util.Scanner;

/**
 Program ini membantu Anda untuk membeli saham dari 
 perusahaa XYZ.
*/

public class PialangSaham
{
   public static void main(String[] args)
   {
      int sahamDibeli; // Banyak saham yang akan dibeli

      // Menciptakan sebuah objek Saham untuk perusahaan pialang.
      // Simbol perdagangan adalah XYZ dan harga per lembar saham
      // adalah Rp. 9.62.
      Saham perusahaanXYZ = new Saham("XYZ", 9.62);

      // Menciptakan sebuah objek Scanner untuk masukan papantik
      Scanner keyboard = new Scanner(System.in);

      // Menampilkan harga per lembar saham
      System.out.printf("Harga per lembar saham dari perusahaan XYZ adalah Rp. %,.2f.\n",
         perusahaanXYZ.getHargaSaham());

      // Mendapatkan banyak saham yang akan dibeli
      System.out.print("Berapa lembar saham yang ingin Anda beli? ");
      sahamDibeli = keyboard.nextInt();

      // Menciptakan sebuah objek BeliSaham untuk transaksi
      BeliSaham beli =
         new BeliSaham(perusahaanXYZ, sahamDibeli);

      // Menampilkan biaya transaksi
      System.out.printf("Biaya pembelian saham: Rp. %,.2f",
         beli.getBiaya());
   }
}