public class pola
{
    private int jumlah;

    /**
     * konstruktor
     * @param jumlah jumlah nxn pola
     */
    public pola(int jumlah)
    {
        this.jumlah = jumlah;
    }

    /**
     * menampilkan bentuk kotak
     */
    public void showKotak()
    {
        for(int i=0; i<jumlah; i++)
        {
            for(int j=0; j<jumlah; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    /**
     * menampilkan bentuk segitiga
     */
    public void showSegitiga()
    {
        for(int i=0; i<jumlah; i++)
        {
            for(int j=0; j<jumlah; j++)
            {
                if(i >= j)
                {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }       
    }

}