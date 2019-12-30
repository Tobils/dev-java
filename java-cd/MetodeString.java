//Program ini mendemonstrasikan beberapa metode String

public class MetodeString
{
   public static void main(String[] args)
   {
      String pesan = "Java itu menyenangkan!";
      String besar = pesan.toUpperCase();
      String kecil = pesan.toLowerCase();
      char huruf = pesan.charAt(2);
      int ukuranString = pesan.length();

      System.out.println(pesan);
      System.out.println(besar);
      System.out.println(kecil);
      System.out.println(huruf);
      System.out.println(ukuranString);
   }
}