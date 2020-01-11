public class Pengajar
{
    private String namaBelakang;
    private String namaDepan;
    private String nomorNIP;

    public Pengajar(String namaBelakang, String namaDepan, String nomorNIP)
    {
        this.namaBelakang = namaBelakang;
        this.namaDepan = namaDepan;
        this.nomorNIP = nomorNIP;
    }

    public Pengajar(Pengajar objek2)
    {
        namaBelakang = objek2.namaBelakang;
        namaDepan = objek2.namaDepan;
        nomorNIP = objek2.nomorNIP;
    } 

    public void set(String namaBelakang, String namaDepan, String nomorNIP)
    {
        this.namaBelakang = namaBelakang;
        this.namaDepan = namaDepan;
        this.nomorNIP = nomorNIP;
    }

    public String toString()
    {
        String str = "Pengajar dengan identitas : \nNama depan \t: " + namaDepan +"\nNama Belakang \t:" + namaBelakang + "\nNIP \t:" + nomorNIP;
        return str;
    }
}