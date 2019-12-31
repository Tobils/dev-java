//Program ini memiliki sejumlah variabel dengan tipe data berbeda

public class VariabelInteger
{
   public static void main(String[] args)
   {
      int periksa; 	//Mendeklarasikan sebuah variabel int dengan nama periksa
      byte km; 		//Mendeklarasikan sebuah variabel int dengan nama km
      short menit; 	//Mendeklarasikan sebuah variabel int dengan nama menit
      long hari; 	//Mendeklarasikan sebuah variabel int dengan nama hari

      periksa = -20;
      km = 105;
      menit = 120;
      hari = 189000;
      System.out.println("Anda telah melakukan perjalanan sepanjang " + km +
                         " Km.");
      System.out.println("Diperlukan waktu " + menit + " menit.");
      System.out.println("Saldo saat ini adalah Rp. " + periksa);
      System.out.println("Sekitar " + hari + " hari yang lalu Columbus " +
                         "berdiri di tempat ini.");
   }
}