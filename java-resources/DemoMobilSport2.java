/**
 Program ini menunjukkan bahwa Anda dapat menguji sebuah
 tipe enumerasi.
*/

public class DemoMobilSport2
{
   public static void main(String[] args)
   {
      // Create a SportsCar object.
      MobilSport mobilBaruAnda = new MobilSport(JenisMobil.PORSCHE,
         WarnaMobil.MERAH, 100000);

      // Membaca buatan mobil dan mengujinya.
      switch (mobilBaruAnda.getBuatan())
      {
         case PORSCHE :
            System.out.println("Mobil Anda dibuat di Jerman.");
            break;
         case FERRARI :
            System.out.println("Mobil Anda dibuat di Italia.");
            break;
         case JAGUAR :
            System.out.println("Mobil Anda dibuat di Inggris.");
            break;
         default:
            System.out.println("Saya tidak yakin dimana mobil Anda "
               + "dibuat.");
      }
   }
}