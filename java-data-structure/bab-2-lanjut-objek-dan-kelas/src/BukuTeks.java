public class BukuTeks
{
    private String judul;
    private String pengarang;
    private String penerbit;

    public BukuTeks(String judul, String pengarang, String penerbit)
    {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
    }

    public BukuTeks(BukuTeks objek2)
    {
        judul = objek2.judul;
        pengarang = objek2.pengarang;
        penerbit = objek2.penerbit;
    }

    public void set(String judul, String pengarang, String penerbit)
    {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
    }

    public String toString()
    {
        String str = "Buku yang digunakan dengan :\nJudul \t : " + judul + "\nPengarang \t : " + pengarang + "\n Penerbit \t : " + penerbit;
        return str;
    }
}