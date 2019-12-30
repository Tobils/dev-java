//Program ini menghitung harga jual dari
//sebuah item yang dihargai Rp. 59, dengan
//diskon 20 persen.

public class Diskon
{
   public static void main(String[] args)
   {
      //Variabel-variabel untuk memuat harga biasan, 
      //besar diskon, dan harga jual
      double hargaBiasa = 59.0;
      double diskon;
      double hargaJual;

      //Menghitung besar diskon
      diskon = hargaBiasa * 0.2;

      //Menghitung harga jual dengan mengurangkan
      //diskon dari harga biasa
      hargaJual = hargaBiasa - diskon;

      //Menampilkan hasil
      System.out.println("Harga biasa: Rp. " + hargaBiasa);
      System.out.println("Besar diskon: Rp. " + diskon);
      System.out.println("Harga jual: Rp. " + hargaJual);
   }
}