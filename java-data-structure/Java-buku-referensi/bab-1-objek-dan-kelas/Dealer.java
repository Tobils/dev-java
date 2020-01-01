public class Dealer
{
    private int nilaiDadu1;
    private int nilaiDadu2;
    
    
    /**
     * konstruktor dibuat default tanpa parameter 
     */
    public Dealer()
    {
        nilaiDadu1 = 0;
        nilaiDadu2 = 0;
    }

    /**
     * lempar dadu
     */
    public void lemparDadu()
    {
        final int SISI = 6;
        final Dadu dadu1 = new Dadu(SISI);
        final Dadu dadu2 = new Dadu(SISI);

        /**
         * simpam nilai dari leparan dadu
         */
        nilaiDadu1 = dadu1.getNilai();
        nilaiDadu2 = dadu2.getNilai();
    }

    public String getChoAtauHan() {
        String hasil;
        final int jumlah = nilaiDadu1 + nilaiDadu2;

        if (jumlah % 2 == 0)
        {
            hasil = "Cho (genap)";
        }else
        {
            hasil = "Han (ganjil)";
        }
        return hasil;
    }

    public int getNilaiDadu1()
    {
        return nilaiDadu1;
    }

    public int getNilaidadu2()
    {
        return nilaiDadu2;
    }
}