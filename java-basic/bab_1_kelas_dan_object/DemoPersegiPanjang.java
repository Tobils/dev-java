public class DemoPersegiPanjang
{
    public static void main(String[] args)
    {
        /**
         * mendefinisikan kelas persegiPanjang 
         * PersegiPanjang kotak : mendefinisikan variable kotak sebagai class dari PersegiPanjang
         * new persegiPanjang() : membuat kelas PersegiPanjang()
         */
        PersegiPanjang kotak = new PersegiPanjang();
        System.out.println("mengirim nilai 10 ke setPanjang");

        kotak.setPanjang(10.0);
        kotak.setLebar(10.0);

        double panjang = kotak.getPanjang();
        double lebar = kotak.getLebar();
        double luas = kotak.getLuas();

        System.out.println(String.format("lebar   : %g",lebar));
        System.out.println(String.format("panjang : %g",panjang));
        System.out.println(String.format("luas : %g",luas));
        System.out.println("selesai");
    }
}