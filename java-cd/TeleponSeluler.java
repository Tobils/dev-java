/**
 Kelas TeleponSeluler memuat data tentang telepon seluler.
 */

public class TeleponSeluler
{
   //Bidang-bidang 
   private String manufaktur; 	//Manufaktur
   private String model; 		//Model
   private double hargaRitel; 	//Harga ritel

   /**
    Konstruktor
    @param man Manufaktur dari telepon seluler.
    @param mod Nomor model dari telepon seluler. 
    @param harga Harga ritel dari telepon seluler.
   */

   public TeleponSeluler(String man, String mod, double harga)
   {
      manufaktur = man;
      model = mod;
      hargaRitel = harga;
   }

   /**
    Metode setManufaktur menetapkan nama manufaktur
    dari telepon seluler.
    @param man Manufaktur dari telepon seluler.
   */

   public void setManufaktur(String man)
   {
      manufaktur = man;
   }

   /**
    Metode setModel menetapkan nomor model
    dari telepon seluler.
    @param mod Nomor model telepon seluler.
   */

   public void setModel(String mod)
   {
      model = mod;
   }

   /**
    Metode setHargaRitel menetapkan harga
    ritel dari telepon seluler.
    @param harga harga ritel dari telepon seluler.
   */

   public void setHargaRitel(double harga)
   {
      hargaRitel = harga;
   }

   /**
    Metode getManufaktur 
    @return Nama dari manufaktur dari telepon seluler.
   */

   public String getManufaktur()
   {
      return manufaktur;
   }

   /**
    Metode getModel
    @return Nomor model telepon seluler.
   */

   public String getModel()
   {
      return model;
   }

   /**
    Metode getHargaRitel
    @return Harga ritel dari telepon seluler.
   */

   public double getHargaRitel()
   {
      return hargaRitel;
   }
}