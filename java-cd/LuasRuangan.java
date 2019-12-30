import javax.swing.JOptionPane;

/**
 Program ini menciptakan tiga objek dari
 kelas PersegiPanjang.
*/

public class LuasRuangan
{
   public static void main(String[] args)
   {
      double angka; 		//Untuk memuat suatu nilai
      double totalLuas; 	//Luas total
      String masukan; 		//Untuk memuat masukan user

      //Menciptakan tiga objek PersegiPanjang
      PersegiPanjang dapur = new PersegiPanjang();
      PersegiPanjang kamarTidur = new PersegiPanjang();
      PersegiPanjang kamarMandi = new PersegiPanjang();

      //Membaca dan menyimpan dimensi-dimensi dapur
      masukan = JOptionPane.showInputDialog("Berapa " +
                                            "panjang dapur?");
      angka = Double.parseDouble(masukan);
      dapur.setPanjang(angka); 
      masukan = JOptionPane.showInputDialog("Berapa " +
                                            "lebar dapur?");
      angka = Double.parseDouble(masukan);
      dapur.setLebar(angka);

      //Membaca dan menyimpan dimensi-dimensi kamarTidur
      masukan = JOptionPane.showInputDialog("Berapa " +
                                            "panjang kamar tidur?");
      angka = Double.parseDouble(masukan);
      kamarTidur.setPanjang(angka);
      masukan = JOptionPane.showInputDialog("Berapa " +
                                            "lebar kamar tidur?");
      angka = Double.parseDouble(masukan);
      kamarTidur.setLebar(angka);

      //Membaca dan menyimpan dimensi-dimensi kamarMandi
      masukan = JOptionPane.showInputDialog("Berapa " +
                                             "panjang kamar mandi?");
      angka = Double.parseDouble(masukan);
      kamarMandi.setPanjang(angka);
      masukan = JOptionPane.showInputDialog("Berapa " +
                                            "lebar kamar mandi?");
      angka = Double.parseDouble(masukan);
      kamarMandi.setLebar(angka);

     //Menghitung luas total dari semua kamar
     totalLuas = dapur.getLuas() + kamarTidur.getLuas()
                 + kamarMandi.getLuas();

      //Menampilkan luas total dari semua ruangan
      JOptionPane.showMessageDialog(null, "Luas total dari " +
                                    "semua ruangan adalah " + totalLuas);

      System.exit(0); 
   }  
}