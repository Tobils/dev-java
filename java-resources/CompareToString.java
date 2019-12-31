/**
 Program ini membandingkan dua objek String menggunakan
 metode compareTo.
 */

public class CompareToString
{
   public static void main(String[] args)
   {
      String nama1 = "Mary",
      nama2 = "Mark";

      //Membandingkan "John" dan "Kristof"

      if (nama1.compareTo(nama2) < 0)
      {
         System.out.println(nama1 + " bernilai kurang dari " + nama2);
      }
      else if (nama1.compareTo(nama2) == 0)
      {
         System.out.println(nama1 + " bernilai sama dengan " + nama2);
      }
      else if (nama1.compareTo(nama2) > 0)
      {
         System.out.println(nama1 + " bernilai lebih dari " + nama2);
      }
   }
}