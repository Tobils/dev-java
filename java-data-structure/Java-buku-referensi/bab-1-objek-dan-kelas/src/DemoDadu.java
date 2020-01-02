public class DemoDadu
{
    public static void main(String[] args)
    {
        /**
         * menggunakan final int karena didefinisikan sebagai konstanta atau nilai fixed
         */
        final int SISI_DADU1 = 6;
        final int SISI_DADU2 = 12;
        final int LEMPARAN_MAKS = 5;

        System.out.println("Mensimulasikan pelemparan dadu");
        Dadu Dadu1 = new Dadu(SISI_DADU1);
        Dadu Dadu2 = new Dadu(SISI_DADU2);

        System.out.println("Nilai awal Dadu");
        System.out.println(Dadu1.getNilai() + " " + Dadu2.getNilai());
        System.out.println("Melempar Dadu " + LEMPARAN_MAKS + " Kali");
        
        for(int i = 0; i < LEMPARAN_MAKS; i++)
        {
            Dadu1.lempar();
            Dadu2.lempar();

            System.out.println(Dadu1.getNilai() + " " + Dadu2.getNilai());
        }

    }
}