import javax.swing.JOptionPane;

/**
 Program ini mendemonstrasikan kelas Metrik.
 */

public class DemoMetrik
{
   public static void main(String[] args)
   {
      String masukan; 	//Untuk memuat masukan
      double mil; 		//Jarak dalam mil
      double kilo; 		//Jarak dalam kilometer

      //Membaca jarak dalam mil
      masukan = JOptionPane.showInputDialog("Masukkan " +
              "jarak dalam mil.");
      mil = Double.parseDouble(masukan);

      //Mengkonversi jarak menjadi kilometer
      kilo = Metrik.milKeKilometer(mil);
      JOptionPane.showMessageDialog(null,
            String.format("%,.2f mil sama dengan %,.2f kilometer.",
            mil, kilo));

      //Membaca jarak dalam kilometer
      masukan = JOptionPane.showInputDialog("Masukkan " +
              "jarak dalam kilometer: ");
      kilo = Double.parseDouble(masukan);

      //Mengkonversi jarak menjadi kilometer
      mil = Metrik.kilometerKeMil(kilo);
      JOptionPane.showMessageDialog(null,
              String.format("%,.2f kilometer sama dengan %,.2f mil.",
              kilo, mil));

      System.exit(0);
   }
}