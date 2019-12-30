/**
 Program ini menggunakan metode equals dari kelas Saham
 untuk membandingkan dua objek Saham.
*/

public class BandingSaham
{
   public static void main(String[] args)
   {
      // Menciptakan dua objek Saham dengan nilai-nilai sama
      Saham perusahaan1 = new Saham("XYZ", 9.62);
      Saham perusahaan2 = new Saham("XYZ", 9.62);

      // Menggunakan metode equals untuk membandingkan objek-objek.
      if (perusahaan1.equals(perusahaan2))
         System.out.println("Kedua objek sama.");
      else
         System.out.println("Kedua objek berbeda.");
   }
}