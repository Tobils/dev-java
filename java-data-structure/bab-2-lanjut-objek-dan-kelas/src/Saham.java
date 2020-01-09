public class Saham
{
    private String simbol;
    private double hargaSaham;
    
    public Saham(String simbol, double hargaSaham)
    {
        this.simbol = simbol;
        this.hargaSaham = hargaSaham;
    }

    public String getSimbol()
    {
        return simbol;
    }

    public double getHargaSaham()
    {
        return hargaSaham;
    }

    public String toString()
    {
        String str = "Simbol perdangan " + simbol + "\nHarga saham " + hargaSaham;
        return str;
    }
}