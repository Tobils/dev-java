/**
 Program ini mendemonstrasikan metode toString dari kelas
 Saham.
 */

public class DemoSaham1
{
   public static void main(String[] args)
   {
      // Menciptakan sebuah objek Saham untuk perusahaan XYZ.
      // Simbol perdagangan adalah XYZ dan harga saham
      // terkini adalah Rp. 9.62.
      Saham xyzPerusahaan = new Saham("XYZ", 9.62);

      // Menampilkan nilai-nilai dari objek
      System.out.println(xyzPerusahaan);
   }
}