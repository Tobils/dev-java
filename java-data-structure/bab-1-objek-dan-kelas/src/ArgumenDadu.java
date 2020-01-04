public class ArgumenDadu
{
    public static void main(String[] args)
    {
        final int ENAM_SISI = 6;
        final int DUA_PULUH_SISI = 20;

        Dadu daduEnam = new Dadu(ENAM_SISI);
        Dadu daduDuaPuluh = new Dadu(DUA_PULUH_SISI);

        lemparDadu(daduEnam);
        lemparDadu(daduDuaPuluh);
    }

    /**
     * method ini mensimulasikan pelemparan dadu dengan melewatkan object dari class Dadu
     */

    public static void lemparDadu(Dadu d)
    {
        /**
         * jumlah sisi
         */
        System.out.println("Jumlah sisi dadu adalah " + d.getSisi() +" sisi");

        /**
         * lempar dadu
         */
        d.lempar();

        /**
         * nilai dadu
         */
        System.out.println("nilai dadu : " + d.getNilai());

    }
}