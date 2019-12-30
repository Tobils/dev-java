/**
  Kelas ini mendemonstrasikan sebuah bidang statis.
 */

public class Tercacahkan
{
   private static int cacahObjek = 0;

   /**
    Konstruktor menginkremen bidang statis
    cacahObjek. Ini akan mencacah 
    banyak objek dari kelas ini 
    yang diciptakan.
   */

   public Tercacahkan()
   {
      cacahObjek++;
   }

   /**
    Metode getCacakObjek menghasilkan 
    banyak objek dari kelas ini 
    yang telah diciptakan.
    @return Nilai pada bidang cacahObjek.
   */

   public int getCacahObjek()
   {
      return cacahObjek;
   }
}