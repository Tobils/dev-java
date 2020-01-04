import java.util.Random;
public class Pemain
{
    private String nama;
    private String tebakan;
    private int poin;

    /**
     * konstruktor
     * @param namaPemain merupakan nama pemain yang bermain cho-han
     */
    public Pemain(String namaPemain)
    {
        nama = namaPemain;
        tebakan = "";
        poin = 0;
    }

    /**
     * membuat tebakan random
     */
    public void buatTebakan()
    {
        Random acak = new Random();

        int nilaiTebakan = acak.nextInt(2);
        if(nilaiTebakan == 0)
        {
            tebakan = "Cho (genap)";
        }else{
            tebakan = "Han (ganjil)";
        }
    }

    /**
     * menambahkan point baru 
     */
    public void tambahPoin(int poinBaru)
    {
        poin += poinBaru;
    }

    /**
     * ambil nama
     */
    public String getNama()
    {
        return nama;
    }

    /**
     * ambil tebakan
     */
    public String getTebakan()
    {
        return tebakan;
    }

    /**
     * @return poin
     */
    public int getPoin()
    {
        return poin;
    }
}