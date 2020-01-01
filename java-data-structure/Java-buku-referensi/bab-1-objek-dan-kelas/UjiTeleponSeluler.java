import java.util.Scanner;

public class UjiTeleponSeluler
{
    public static void main(String[] args)
    {
        String ujiMan;
        String ujiMod;
        Double ujiHarga;
    
        /**
         * menciptakan object Scanner untuk masukan keyboard
         */
        Scanner keyboard = new Scanner(System.in);
    
        /**
         * membaca nama manufaktur
         */
        System.out.print("Masukan manufaktur :");
        ujiMan = keyboard.nextLine();

        /**
         * membaca model
         */
        System.out.print("Masukan model :");
        ujiMod = keyboard.nextLine();

        /**
         * membaca harga ritel
         */
        System.out.print("Masukan harga :");
        ujiHarga = keyboard.nextDouble();

        TeleponSeluler telp = new TeleponSeluler(ujiMan, ujiMod, ujiHarga);

        System.out.println();
        System.out.println("berikut adalah data yang anada sediakan :");
        System.out.println("Manufaktur :" + telp.getManufaktur());
        System.out.println("Model : " + telp.getModel());
        System.out.println("Harga : " + telp.getHargaRitel());
    }
}