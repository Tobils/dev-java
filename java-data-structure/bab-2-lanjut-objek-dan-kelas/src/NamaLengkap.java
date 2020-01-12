public class NamaLengkap
{
    private String namaBelakang;
    private String namaDepan;
    private String namaTengah;
    
    public void setNamaBelakang(String str)
    {
        namaBelakang = str;
    }

    public void setNamaTengah(String str)
    {
        namaTengah = str;
    }

    public void setNamaDepan(String str)
    {
        namaDepan = str;
    }

    public int getPanjang_null()
    {
        int pjg;
        /**
         * mereferensi null 
         */
        pjg = namaBelakang.length() + namaTengah.length() + namaDepan.length();
        return pjg;
    }

    /**
     * jika null maka return nya nol
     * @return nilai panjang karakter nama
     */
    public int getPanjang()
    {
        int pjg = 0;
        if(namaBelakang != null)
        {
            pjg += namaBelakang.length();
        }
        if(namaTengah != null)
        {
            pjg += namaTengah.length();
        }
        if(namaDepan != null)
        {
            pjg += namaDepan.length();
        }

        return pjg;
    }

    public String toString()
    {
        String str = "Nama Pengguna :\nNama \t :" + namaDepan + " " + namaTengah + " " + namaBelakang;
        return str;
    }
}