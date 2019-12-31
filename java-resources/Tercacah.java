/**
 Kelas ini mendemonstrasikan sebuah bidang statis.
 */

public class Tercacah
{
   private static int cacahObjek = 0;

   /**
    Konstruktor menginkremen bidang statis
    cacahObjek. Ini akan menjejak
    banyak objek dari kelas ini
    yang telah diciptakan.
   */

   public Tercacah()
   {
      cacahObjek++;
   }

   /**
    Metode getCacahObjek menghasilkan banyak
    objek dari kelas ini yang telah
    diciptakan.
    @return Nilai di dalam bidang cacahObjek.
   */

   public int getCacahObjek()
   {
      return cacahObjek;
   }
}