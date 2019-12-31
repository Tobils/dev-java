import javax.swing.JOptionPane;

/**
 Program ini mengkonversi cangkir menjadi ons.
 */

public class KonverterCangkir
{
   public static void main(String[] args)
   {
      double cangkir; 	//Untuk memuat banyak cangkir
      double ons; 		//Untuk memuat banyak ons ekivalen

      //Membaca banyak cangkir
      cangkir = bacaCangkir();

      //Mengkonversi cangkir menjadi ons
      ons = cangkirKeOns(cangkir);

      //Menampilkan hasil
      tampilHasil(cangkir, ons);
      System.exit(0);
   }

   /**
     Metode bacaCangkir meminta user untuk memasukkan
     banyak cangkir.
     @return Banyak cangkir yang dimasukkan oleh user.
   */ 

   public static double bacaCangkir()
   {
      String masukan; 		//Untuk memuat masukan.
      double banyakCangkir; //Untuk memuat banyak cangkir.

      //Membaca banyak cangkir dari user
      masukan = JOptionPane.showInputDialog(
                "Program ini mengkonversi pengukuran\n" +
                "dalam cangkir menjadi ons. Untuk\n" +
                "referensi Anda, formulanya adalah:\n" +
                " 1 cangkir = 8 ons\n\n" +
                "Masukkan banyak cangkir.");

      //Mengkonversi masukan menjadi double
      banyakCangkir = Double.parseDouble(masukan);

      //Menghasilkan banyak cangkir
      return banyakCangkir;
   }

   /**
    Metode cangkirKeOns mengkonversi banyak cangkir
    menjadi onse, dengan formula
    1 cangkir = 8 ons.
    @param banyakCangkir Banyak cangkir yang akan dikonversi.
    @return Banyak ons ekivalen.
   */

   public static double cangkirKeOns(double banyakCangkir)
   {
      return banyakCangkir * 8.0;
   } 

   /**
    Metode tampilHasil menampilkan sebuah pesan yang menunjukkan
    hasil konversi.
    @param cangkir Banyak cangkir.
    @param ons Banyak ons ekivalen.
   */

   public static void tampilHasil(double cangkir, double ons)
   {
      //Menampilkan banyak ons
      JOptionPane.showMessageDialog(null,
                  cangkir + " cangkir sama dengan " +
                  ons + " ons.");
   }
}