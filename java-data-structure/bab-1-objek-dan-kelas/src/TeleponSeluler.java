public class TeleponSeluler
{
    String manufaktur;
    String model;
    Double hargaRitel;

    /**
     * konstruktor
     * @param man Manufaktur dari telepon seluler
     * @param mod Model dari telepon seluler
     * @param harga Harga Ritel dar telepon seleluer
     */
    public TeleponSeluler(String man, String mod, Double harga)
    {
        manufaktur = man;
        model = mod;
        hargaRitel = harga;
    }

    public void setManufaktur(String man)
    {
        manufaktur = man;
    }

    public void setModel(String mod)
    {
        model = mod;
    }

    public void setHargaRitel(Double harga)
    {
        hargaRitel = harga;
    }

    public String getManufaktur()
    {
        return manufaktur;
    }

    public String getModel()
    {
        return model;
    }

    /**
     * @return harga ritel dari telepon seluler
     */
    public Double getHargaRitel()
    {
        return hargaRitel;
    }
}