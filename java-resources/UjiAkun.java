import javax.swing.JOptionPane; //Untuk kelas JOptionPane 

/**
 Program ini mendemonstrasikan kelas AkunBank.
 */

public class UjiAkun
{
   public static void main(String[] args)
   {
      String masukan; //Untuk memuat masukan user
       
      //Membaca saldo awal
      masukan = JOptionPane.showInputDialog(
              "Berapa saldo awal pada akun Anda?");

      //Menciptakan sebuah objek AkunBank 
      AkunBank akun = new AkunBank(masukan);

      //Membaca jumlah gaji
      masukan = JOptionPane.showInputDialog(
                "Berapa gaji Anda bulan ini?");

      //Menabung gaji user ke dalam akun 
      akun.tabung(masukan);       

      //Menampilka saldo baru
      JOptionPane.showMessageDialog(null,
         String.format("Gaji Anda telah ditabung.\n" +
         "Saldo Anda sekarang adalah Rp. %,.2f",
         akun.getSaldo())); 

      //Menarik sejumlah uang dari akun
      masukan = JOptionPane.showInputDialog(
         "Berapa banyak uang yang ingin Anda tarik?");
         akun.tarik(masukan);    

      //Menampilkan saldo baru    
      JOptionPane.showMessageDialog(null,
         String.format("Sekarang saldo Anda adalah Rp. %,.2f",
         akun.getSaldo()));    

      System.exit(0);
   }
}