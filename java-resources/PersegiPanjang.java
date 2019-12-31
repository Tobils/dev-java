/**
 Kelas PersegiPanjang, fase 5
 Sedang dalam pengembangan!
 */

public class PersegiPanjang
{
   private double panjang;
   private double lebar;

   /**
    Konstruktor
    @param pjg Panjang dari persegi-panjang.
    @param w Lebar dari persegi-panjang.
   */

   public PersegiPanjang(double pjg, double w)
   {
      panjang = pjg;
      lebar = w;
   }

   /**
    Metode setPanjang menyimpan suatu nilai di dalam
    bidang panjang.
    @param pjg Nilai yang disimpan di dalam panjang.
   */

   public void setPanjang(double pjg)
   {
      panjang = pjg;
   }
   
   /**
    Metode setLebar menyimpan suatu nilai di dalam
    bidang lebar.
    @param w Nilai yang disimpan di dalam lebar.
   */
  
   public void setLebar(double w)
   {
      lebar = w;
   }
   
   /**
    Metode getPanjang menghasilkan panjang dari
    sebuah objek PersegiPanjang.
    @return Nilai di dalam bidang panjang.
   */

   public double getPanjang()
   {
      return panjang;
   }

   /**
    Metode getLebar menghasilkan lebar dari
    sebuah objek PersegiPanjang.
    @return Nilai di dalam bidang lebar.
   */

   public double getLebar()
   {
      return lebar;
   }
   
   /**
    The getArea method returns a Rectangle
    object's area.
    @return The product of length times width.
   */

    public double getLuas()
   {
      return panjang * lebar;
   }
}