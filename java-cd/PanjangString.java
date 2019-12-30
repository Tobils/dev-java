//Program ini mendemonstrasikan metode length dari kelas String

public class PanjangString
{
   public static void main(String[] args)
   {
      String nama = "Herman";
      int ukuranString;

      ukuranString = nama.length();
      System.out.println(nama + " memiliki " + ukuranString +
         " karakter.");
   }
}