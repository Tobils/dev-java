/**
 Program ini mendemonstrasikan pelewatan elemen individual array
 sebagai argumen kepada suatu metode.
 */

public class MelewatkanElemen
{
   public static void main(String[] args)
   {
      int[] angka = {5, 10, 15, 20, 25, 30, 35, 40};

      for (int indeks = 0; indeks < angka.length; indeks++)
         tampilNilai(angka[indeks]);
   }

   /**
    Metode tampilNilai menampilkan argumennya
    @param n Nilai yang akan ditampilkan
   */
 
   public static void tampilNilai(int n)
   {
      System.out.print(n + " ");
   }
}