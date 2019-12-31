public class PersegiPanjang
{
    private double panjang;
    private double lebar;
    private double luas;

    /**
     * method setPanjang menyimpang nilai pada variable panjang
     * @param pjg nilai yang disimpan di dalam panjang
     */

    public void setPanjang(double pjg)
    {
        panjang = pjg;
    }

    /**
     * @param lbr merupakan nilai yang akan disimpan pada variable lebar
     */
    public void setLebar(double lbr)
    {
        lebar = lbr;
    }

    /**
     * 
     * @return nilai panjang
     */
    public double getPanjang()
    {
        return panjang;
    }


    /**
     * 
     * @return nilai lebar
     */
    public double getLebar()
    {
        return lebar;
    }

    /**
     * @return nilai luas
     */
    public double getLuas()
    {
        luas = panjang * lebar;
        return luas;
    }
}