import java.util.Scanner;
public class ChoHan
{
    public static void main(String[] args)
    {
        final int BABAK_MAKS = 5;
        String namaPemain1;
        String namaPemain2;

        Scanner keyboard = new Scanner(Sytem.in);

        System.out.print("Nama Pemain pertama : ");
        namaPemain1 = keyboard.nextLine();
        System.out.print("Nama Pemain kedua : ");
        namaPemain2 = keyboard.nextLine();

        // menciptakan object Dealer
        Dealer dealer = new Dealer();

        // menciptakan object Pemain
        Pemain pemain1 = new Pemain(namaPemain1);
        Pemain pemain2 = new Pemain(namaPemain2);

        for(int babak = 0; babak < BABAK_MAKS; i++)
        {
            System.out.println("-----------------------------");
            System.out.printf("Babak ke-%d",babak + 1);
            
            /**
             * membuat tebakan
             */
            pemain1.buatTebakan();
            pemain2.buatTebakan();

            // menentukan pemenang pada babak ini

        }

        public static void hasilBabak(Dealer dealer, Pemain pemain1, Pemain pemain2)
        {
            /**
             * menampilkan hasil dari kedua dadu
             */
        }

    }
}