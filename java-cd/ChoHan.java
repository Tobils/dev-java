import java.util.Scanner;

public class ChoHan
{
   public static void main(String[] args)
   {
      final int BABAK_MAKS = 5; //Banyak babak
      String namaPemain1; 		//Nama dari pemain pertama
      String namaPemain2; 		//Nama dari pemain kedua

      //Menciptakan sebuah objek Scanner untuk masukan papantik
      Scanner keyboard = new Scanner(System.in);

      //Membaca nama-nama pemain.
      System.out.print("Masukkan nama dari pemain pertama: ");
      namaPemain1 = keyboard.nextLine();
      System.out.print("Masukkan nama dari pemain kedua: ");
      namaPemain2 = keyboard.nextLine();

      //Menciptakan objek dealer
      Dealer dealer = new Dealer();

      //Menciptakan dua pemain
      Pemain pemain1 = new Pemain(namaPemain1);
      Pemain pemain2 = new Pemain(namaPemain2);

      //Memainkan babak demi babak
      for (int babak = 0; babak < BABAK_MAKS; babak++)
      {
         System.out.println("----------------------------");
         System.out.printf("Sekarang dimulai babak ke-%d.\n", babak + 1);

         //Melempar dadu
         dealer.lemparDadu();

         //Pemain membuat tebakan
         pemain1.buatTebakan();
         pemain2.buatTebakan();

         //Menentukan pemain babak ini
         hasilBabak(dealer, pemain1, pemain2);
      }

      //Menampilkan pemain
      tampilPemain(pemain1, pemain2);
   }

   /**
    Metode hasilBabak menentukan hasil dari
    babak ini.
    @param dealer Objek Dealer
    @param pemain1 Objek Pemain #1
    @param pemain2 Objek Pemain #2 
   */

   public static void hasilBabak(Dealer dealer, Pemain pemain1,
     Pemain pemain2)
   {
      //Manampilkan nilai dari kedua dadu
      System.out.printf("Dealer melempar %d dan %d.\n",
      dealer.getNilaiDadu1(), dealer.getNilaiDadu2());
      System.out.printf("Hasil: %s\n", dealer.getChoAtauHan());

      //Memeriksa tebakan pemain dan memberikan poin
      periksaTebakan(pemain1, dealer);
      periksaTebakan(pemain2, dealer);
   }

   /**
    Metode periksaTebakan memeriksa tebakan pemain terhadap
    hasil dari dealer.
    @param pemain Objek Pemain yang akan diperiksa.
    @param dealer Objek Dealer.
   */

   public static void periksaTebakan(Pemain pemain, Dealer dealer)
   {
      final int POIN_DITAMBAHKAN = 1; 		//Poin yang diberikan kepada pemain
      String tebakan = pemain.getTebakan(); //Tebakan pemain
      String hasilChoHan = dealer.getChoAtauHan(); //Cho atau Han

      //Menampilkan tebakan pemain
      System.out.printf("Pemain %s menebak %s.\n",
                        pemain.getNama(), pemain.getTebakan());

      //Menghadiahkan poin jika pemain menebak dengan benar
      if (tebakan.equalsIgnoreCase(hasilChoHan))
      {
         pemain.tambahPoin(POIN_DITAMBAHKAN);
         System.out.printf("Menghadiahkan %d poin kepada %s.\n",
                           POIN_DITAMBAHKAN, pemain.getNama());
      }
   }

   /**
     Metode tampilPemain menampilkan pemenang
    @param pemain1 Pemain #1
    @param pemain2 Pemain #2
   */ 

   public static void tampilPemain(Pemain pemain1, Pemain pemain2)
   {
      System.out.println("----------------------------");
      System.out.println("Selesai. Berikut hasil akhir permainan:");
      System.out.printf("%s: %d poin.\n", pemain1.getNama(),
                        pemain1.getPoin());
      System.out.printf("%s: %d poin.\n", pemain2.getNama(),
                        pemain2.getPoin());

      if (pemain1.getPoin() > pemain2.getPoin())
         System.out.println(pemain1.getNama() + " adalah pemenangnya!");
      else if (pemain2.getPoin() > pemain1.getPoin())
         System.out.println(pemain2.getNama() + " adalah pemenangnya!");
      else
         System.out.println("Kedua pemain imbang!");
   }
}