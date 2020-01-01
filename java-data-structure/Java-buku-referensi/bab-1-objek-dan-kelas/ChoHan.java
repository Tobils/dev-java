import java.util.Scanner;
public class ChoHan
{
    public static void main(String[] args)
    {
        final int BABAK_MAKS = 5;
        String namaPemain1;
        String namaPemain2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Nama Pemain pertama : ");
        namaPemain1 = keyboard.nextLine();
        System.out.print("Nama Pemain kedua : ");
        namaPemain2 = keyboard.nextLine();
        System.out.println();

        // menciptakan object Dealer
        Dealer dealer = new Dealer();

        // menciptakan object Pemain
        Pemain pemain1 = new Pemain(namaPemain1);
        Pemain pemain2 = new Pemain(namaPemain2);

        for(int babak = 0; babak < BABAK_MAKS; babak++)
        {
            System.out.println("-----------------------------");
            System.out.printf("Babak ke-%d",babak + 1);
            System.out.println();
            
            /**
             * membuat tebakan
             */
            pemain1.buatTebakan();
            pemain2.buatTebakan();

            // menentukan pemenang pada babak ini
            hasilBabak(dealer, pemain1, pemain2);
            System.out.println("-----------------------------");
            System.out.println();
        }
         /**
         * menampilkan hasil dari permainan
         */
        tampilPemain(pemain1, pemain2);
    }
    // end-of-main-function

    /**
     * hasilBabak
     * @param dealer --> Dealer / bandar
     * @param pemain1 --> pemain 1
     * @param pemain2 --> pemain 2
     */
    public static void hasilBabak(Dealer dealer, Pemain pemain1, Pemain pemain2)
    {
        /**
         * menampilkan hasil dari kedua dadu
         */
        System.out.println("Hasil : " + dealer.getChoAtauHan());
        periksaTebakan(pemain1, dealer);
        periksaTebakan(pemain2, dealer);
    }

    /**
     * periksa hasil tebakan pemain dengan bandar atau dealer
     * @param pemain --> pemain
     * @param dealer --> dealer
     */
    public static void periksaTebakan(Pemain pemain, Dealer dealer)
    {
        /**
         * periksa hasil tebakan antara pemain dengan dealer
         */
        String tebakan_pemain = pemain.getTebakan();
        String chohan = dealer.getChoAtauHan();


        if(tebakan_pemain == chohan)
        {
            pemain.tambahPoin(1);
            System.out.println("pemain " + pemain.getNama() + " menebak " + pemain.getTebakan());
            System.out.println("1 poin untuk " + pemain.getNama());
        }
    }

    /**
     * menampilkan pemain yang menang
     * @param pemain1 --> pemain 1
     * @param pemain2 --> pemain 2
     */
    public static void tampilPemain(Pemain pemain1, Pemain pemain2)
    {
        /**
         * menampilkan pemenang dari permainan Cho-Han
         */
        System.out.println("poin " + pemain1.getNama() + " : " + pemain1.getPoin());
        System.out.println("poin " + pemain2.getNama() + " : " + pemain2.getPoin());

        if(pemain1.getPoin() > pemain2.getPoin())
        {
            System.out.println("Pemenang : " + pemain1.getNama());
        }
        else if (pemain1.getPoin() < pemain2.getPoin())
        {
            System.out.println("Pemenang : " + pemain2.getNama());
        }
        else 
        {
            System.out.println("Hasil Imbang");
        }

    }
}