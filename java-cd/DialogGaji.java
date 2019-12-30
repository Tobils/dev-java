import javax.swing.JOptionPane;

/**
 Program ini mendemonstrasikan penggunaan dialog-dialog dengan
 JOptionPane.
 */

public class DialogGaji
{
   public static void main(String[] args)
   {
      String stringMasukan; //Untuk membaca masukan
      String nama; 			//Nama user
      int jamKerja; 		//Banyak jam kerja
      double gajiPerJam; 	//Gaji per jam user
      double gajiKotor; 	//Gaji kotor user

      //Membaca nama user
      nama = JOptionPane.showInputDialog("Siapakah " +
                "nama Anda?");

     //Membaca jumlah jam kerja
     stringMasukan =
        JOptionPane.showInputDialog("Berapa banyak jam " +
           "kerja Anda minggu ini? ");

      //Mengkonversi masukan menjadi sebuah int
      jamKerja = Integer.parseInt(stringMasukan);

      //Membaca gaji per jam
      stringMasukan =
         JOptionPane.showInputDialog("Berapakah " +
            "gaji per jam Anda? ");

      //Mengkonversi masukan menjadi sebuah double
      gajiPerJam = Double.parseDouble(stringMasukan);

      //Menghitung gaji kotor
      gajiKotor = jamKerja * gajiPerJam;

      //Menampilkan hasil
      JOptionPane.showMessageDialog(null, "Halo " +
         nama + ". Gaji kotor Anda sebesar Rp. " +
         gajiKotor);

      //Mengakhiri program
      System.exit(0);
   }
}