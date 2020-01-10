public class Saham
{
    private String simbol;
    private double hargaSaham;
    
    public Saham(String simbol, double hargaSaham)
    {
        this.simbol = simbol;
        this.hargaSaham = hargaSaham;
    }

    /**
     * konstruktor untuk menyalin objek
     */
    public Saham(Saham objek)
    {
        simbol = objek.getSimbol();
        hargaSaham = objek.getHargaSaham();
    }

    /**
     * method untuk menyalin objek
     * @return objek saham
     */
    public Saham salin()
    {
        Saham objekBaru = new Saham(simbol, hargaSaham);
        return objekBaru;
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

    public void compare(Saham saham1, Saham saham2)
    {
        if(saham1.equals(saham2))
        {
            System.out.println("kedua objek sama");
        }
        else
        {
            System.out.println("kedua objek berbeda");
        }
    }

    /**
     * method equal
     */
    public boolean equals(Saham objek2)
    {
        boolean status;
        if((simbol == objek2.getSimbol()) && (hargaSaham == objek2.getHargaSaham()))
        {
            status = true;
        } else
        {
            status = false;
        }
        return status;
    }


}