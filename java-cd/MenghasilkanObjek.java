import javax.swing.JOptionPane;

/**
 Program ini mendemonstrasikan bagaimana sebuah metode
 dapat menghasilkan sebuah referensi ke suatu objek.
 */

public class MenghasilkanObjek
{
   public static void main(String[] args)
   {
      AkunBank akun;

      //Mendapatkan sebuah referensi ke suatu objek AkunBank.
      akun = getAkun();

      // Display the akun's balance.
      JOptionPane.showMessageDialog(null,
                  "Akun memiliki saldo sebesar Rp. " +
                   akun.getSaldo());

      System.exit(0);
   }

   /**
    Metode getAkun menciptakan sebuah objek AkunBank
    dengan saldo ditetapkan oleh
    user.
    @return Sebuah referensi ke objek.
   */

   public static AkunBank getAkun()
   {
      String masukan; 	//Untuk memuat masukan
      double saldo; 	//Saldo akun

      //Mendapatkan saldo dari user.
      masukan = JOptionPane.showInputDialog("Masukkan " +
              "saldo akun.");
      saldo = Double.parseDouble(masukan);

      //Menciptakan sebuah objek AkunBank dan mengahasilkan
      //sebuah referensi yang menunjuknya.
      return new AkunBank(saldo);
   }
}