import java.util.ArrayList; //Diperlukan untuk kelas ArrayList 

/**
 Program ini mendemonstrasikan bagaimana menyimpan objek-objek
 AkunBank di dalam sebuah ArrayList.
 */

public class DemoArrayList5
{
   public static void main(String[] args)
   {
      //Menciptakan sebuah ArrayList untuk memuat objek-objek AkunBank
      ArrayList<AkunBank> list = new ArrayList<AkunBank>();

      //Menambahkan tiga objek AkunBank pada ArrayList
      list.add(new AkunBank(100.0));
      list.add(new AkunBank(500.0));
      list.add(new AkunBank(1500.0));

      //Menampilkan setiap item
      for (int indeks = 0; indeks < list.size(); indeks++)
      {
         AkunBank akun = list.get(indeks);
         System.out.println("Akun pada indeks " + indeks +
                            "\nSaldo: " + akun.getSaldo());
      }
   }
}