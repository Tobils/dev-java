/**
 Program ini mendemonstrasikan sebuah metode dengan satu parameter.
 */

public class LewatkanArgumen
{
   public static void main(String[] args)
   {
      int x = 10;

      System.out.println("Saya melewatkan nilai-nilai kepada tampilNilai.");
      tampilNilai(5); 		//Melewatkan 5
      tampilNilai(x); 		//Melewatkan 10
      tampilNilai(x * 4); 	//Melewatkan 40
      tampilNilai(Integer.parseInt("700")); //Melewatkan 700
      System.out.println("Sekarang saya kembali di dalam main.");
   }

   /**
    Metode tampilNilai menampilkan nilai dari
    dari parameter integernya.
   */

   public static void tampilNilai(int nil)
   {
      System.out.println("Nilai sebesar " + nil);
   }
}