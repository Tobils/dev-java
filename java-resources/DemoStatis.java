/**
 Program ini mendemonstrasikan kelas Tercacahkan
*/

public class DemoStatis
{
   public static void main(String[] args)
   {
      int cacahObjek;

      // Menciptakan tiga objek dari
      // kelas Tercacahkan.
      Tercacahkan objek1 = new Tercacahkan();
      Tercacahkan objek2 = new Tercacahkan();
      Tercacahkan objek3 = new Tercacahkan();

      // Mendapatkan banyak objek dari
      // bidang statis dari kelas Tercacahkan.
      cacahObjek = objek1.getCacahObjek();
      System.out.println(cacahObjek +
         " objek kelas " +
         "telah diciptakan.");
   }
}