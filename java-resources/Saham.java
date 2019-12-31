/**
 Kelas Saham memuat data tentang saham dari suatu perusahaan
*/

public class Saham
{
   private String simbol; 		// Simbol perdagangan dari saham
   private double hargaSaham; 	// Harga terkini per lembar saham

   public Saham(Saham objek2)
   {
      simbol = objek2.simbol;
      hargaSaham = objek2.hargaSaham;
   }

   /**
    Konstruktor
    @param sim simbol perdagangan dari saham.
    @param harga harga per lembar saham.
   */

   public Saham(String sim, double harga)
   {
     simbol = sim;
     hargaSaham = harga;
   }

   /**
    Metode getSimbol
    @return simbol perdagangan dari saham.
   */

   public String getSimbol()
   {
      return simbol;
   }

   /**
    Metode getHargaSaham
    @return harga per lembar saham
   */

   public double getHargaSaham()
   {
      return hargaSaham;
   }

   /**
    Metode toString 
    @return Sebuah string yang mengindikasikan simbol
    perdaganan dan harga saham.
   */

   public String toString()
   {
      // Menciptakan sebuah string yang menjelaskan sebuah saham.
      String str = "Simbol perdagangan: " + simbol +
                   "\nHarga saham: " + hargaSaham;

      // Menghasilkan string
      return str;
   }
   
   public boolean equals(Saham objek2)
   {
      boolean status;
      // Menentukan apakan simbol dan hargaSaham dari objek ini
      // sama dengan simbol dan hargaSaham
      // dari objek2.
      if (simbol.equals(objek2.simbol) &&
         hargaSaham == objek2.hargaSaham)
         status = true; 	// ya, kedua objeksama.
      else
         status = false; 	// Tidak, kedua objek berbeda.

      // Menghasilkan nilai dalam status
      return status;
   }
   
   public Saham salin()
   {
      // Menciptakan sebuah objek Saham baru dan menginisialisasinya
      // dengan data yang sama yang dimuat oleh objek pemanggil.
      Saham salinObjek = new Saham(simbol, hargaSaham);
   
      // Menghasilkan sebuah referensi ke objek baru.
      return salinObjek;
   }
}