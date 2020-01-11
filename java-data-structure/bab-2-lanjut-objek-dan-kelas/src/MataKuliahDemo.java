public class MataKuliahDemo
{
    public static void main(String[] args) {
        /**
         * pengajar
         */
        String namaBelakang = "Suhada";
        String namaDepan = "Ade";
        String nomorNIP = "1921370006";
        Pengajar ajar = new Pengajar(namaBelakang, namaDepan, nomorNIP);

        /**
         * buku yang digunakan
         */
        String judul = "100 hari melakukan tantangan ngoding";
        String pengarang = "IG";
        String penerbit = "yogyakarta"; 
        BukuTeks teks = new BukuTeks(judul, pengarang, penerbit);

        /**
         * MataKuliah
         */
        String nama = "Dasar Pemrograman Java";
        MataKuliah mt = new MataKuliah(nama, ajar, teks);
        System.out.println(mt);
    }
}