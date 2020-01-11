public class MataKuliah
{
    private String namaMtKuliah;
    Pengajar pengajar;
    BukuTeks bukuTeks;

    public MataKuliah(String nama, Pengajar ajar, BukuTeks teks)
    {
        namaMtKuliah = nama;
        pengajar = new Pengajar(ajar);
        bukuTeks = new BukuTeks(teks);
    }

    public String getNama()
    {
        return namaMtKuliah;
    }

    public Pengajar getPengajar()
    {
        return pengajar;
    }

    public BukuTeks getBukuTeks()
    {
        return bukuTeks;
    }

    public String toString()
    {
        String str = "informasi kuliah : \nNama Mata Kuliah \t : " + namaMtKuliah + "\n" + pengajar.toString() + "\n" + bukuTeks.toString();
        return str;
    }
}