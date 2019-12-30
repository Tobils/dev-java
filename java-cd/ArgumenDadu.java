/**
 Program ini melemparkan sebuah dadu 6 sisi dan
 sebauh dadu 20 sisi.
 */

public class ArgumenDadu
{
   public static void main(String[] args)
   {
      final int ENAM_SISI = 6;
      final int DUAPULUH_SISI = 20;

      //Menciptakan sebuah dadu 6 sisi
      Dadu daduEnam = new Dadu(ENAM_SISI);

      //Menciptakan sebuah dadu 20 sisi
      Dadu daduDuaPuluh = new Dadu(DUAPULUH_SISI);

      //Melempar dua dadu
      lemparDadu(daduEnam);
      lemparDadu(daduDuaPuluh);
   }

   /**
    Metode ini mensimulasikan sebuah pelemparan dadu, yang 
    menampilkan banyak sisi dadu dan nilai dadu.
    @param d Objek Dadu yang dilempar.
   */

   public static void lemparDadu(Dadu d)
   { 
      //Menampilkan banyak sisi
      System.out.println("Melempar sebuah dadu dengan " + d.getSisi() +
                         " sisi.");

      //Melempar dadu
      d.lempar();

      //Menampilkan nilai dadu
      System.out.println("Nilai dadu: " + d.getNilai());
   }
}