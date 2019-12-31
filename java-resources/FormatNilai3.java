import javax.swing.JOptionPane;

/**
 Program ini mendemonstrasikan bagaimana menggunakan metod 
 String.format untuk memformat sebuah nilai
 */

public class FormatNilai3
{
   public static void main(String[] args)
   {
      double gajiBulanan = 5000.0;
      double gajiTahunan = gajiBulanan * 12;

      JOptionPane.showMessageDialog(null, 
      	String.format("Gaji tahunan Anda sebesar Rp. %,.2f", gajiTahunan));
   }
}