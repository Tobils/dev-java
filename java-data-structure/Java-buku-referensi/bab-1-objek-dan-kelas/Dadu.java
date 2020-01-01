import java.util.Random;

public class Dadu
{
    private int sisi;
    private int nilai;

    /**
     * konstruktor
     * @param jumlah_sisi merupakan banyaknya sisi dari dadu yang akan digunakan
     */
    public Dadu(int jumlah_sisi)
    {
        sisi = jumlah_sisi;
        lempar();
    }

    /**
     * Random digunakan untuk memperoleh nilai random dari 0 sd jumlah sisi -1.
     */
    public void lempar()
    {
        Random acak = new Random();
        nilai = acak.nextInt(sisi) + 1;
    }

    /**
     * method untuk memperoleh nilai sisi
     */
    public int getSisi()
    {
        return sisi;
    }

    /**
     * method untuk memperoleh nilai yang dihasilkan dari pelemparan dadu
     */
    public int getNilai()
    {
        return nilai;
    }
}