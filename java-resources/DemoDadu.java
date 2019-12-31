/**
 Program ini mensimulasikan pelemparan dadu.
 */

public class DemoDadu
{
   public static void main(String[] args)
   {
      final int SISI_DADU1 = 6; 	//Banyak sisi dari dadu #1
      final int SISI_DADU2 = 12; 	//Banyak sisi dari dadu #2
      final int LEMPARAN_MAKS = 5; 	//Banyak pelemparan yang dilakukan
      
      //Menciptakan dua objek dari kelas Dadu
      Dadu dadu1 = new Dadu(SISI_DADU1);
      Dadu dadu2 = new Dadu(SISI_DADU2);

      //Menampilkan keadaan awal dari dadu
      System.out.println("Ini mensimulasikan pelemparan atas sebuah dadu " +
                         SISI_DADU1 + " sisi dan sebuah dadu " +
                         SISI_DADU2 + " sisi.");

      System.out.println("Nilai awal dari dadu:");
      System.out.println(dadu1.getNilai() + " " + dadu2.getNilai());

      //Melempar dadu lima kali.
      System.out.println("Melempar dadu " + LEMPARAN_MAKS + " kali.");

      for (int i = 0; i < LEMPARAN_MAKS; i++)
      {
         //Melempar dadu
         dadu1.lempar();
         dadu2.lempar();

         //Menampilkan nilai-nilai dari dadu
         System.out.println(dadu1.getNilai() + " " + dadu2.getNilai());
      }
   }
}