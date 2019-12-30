/**
 Program ini secara tepat membandingkan dua objek String
 menggunakan metode equals
*/

public class MembandingkanString
{
   public static void main(String[] args)
   {
      String nama1 = "John",
      nama2 = "John",
      nama3 = "Kristof";

      //Membandingkan "John" dan "John"

      if (nama1.equals(nama2))
      {
         System.out.println(nama1 + " dan " + nama2 +
                            " sama.");
      }
      else
      {
         System.out.println(nama1 + " dan " + nama2 +
                            " TIDAK sama.");
      }

      //Membandingkan "John" dan "Kristof"

      if (nama1.equals(nama3))
      {
         System.out.println(nama1 + " dan " + nama3 +
                            " sama.");
      }
      else
      {
         System.out.println(nama1 + " dan " + nama3 +
                            " TIDAK sama.");
      }
   }
}