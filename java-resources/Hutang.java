 public class Hutang {
 private double sukuBungaTahunan;
 private int jumlahTahun;
 private double jumlahPinjaman;
 private java.util.Date tanggalPinjaman;

 /** Konstruktor Default */
 public Hutang() {
 this(2.5, 1, 1000);
 }

 /** Menciptakan suatu objek Hutang dengan suku bunga tahunan,
     jumlah tahun, dan jumlah pinjaman tertentu
   */
 public Hutang(double sukuBungaTahunan, int jumlahTahun,
 double jumlahPinjaman){
 this.sukuBungaTahunan = sukuBungaTahunan;
 this.jumlahTahun = jumlahTahun;
 this.jumlahPinjaman = jumlahPinjaman;
 tanggalPinjaman = new java.util.Date();
 }

 /** Mengembalikan sukuBungaTahunan */
 public double dapatSukuBungaTahunan() {
 return sukuBungaTahunan;
 }

 /** Menetapkan sukuBungaTahunan yang baru */
 public void tetapkanSukuBungaTahunan(double sukuBungaTahunan) {
 this.sukuBungaTahunan = sukuBungaTahunan;
 }

 /** Mengembalikan jumlahTahun */
 public int dapatJumlahTahun() {
 return jumlahTahun;
 }

 /** Menetapkan jumlahTahun yang baru */
 public void tetapkanJumlahTahun(int jumlahTahun) {
 this.jumlahTahun = jumlahTahun;
 }

 /** Mengembalikan jumlahPinjaman */
 public double dapatJumlahPinjaman() {
 return jumlahPinjaman;
 }

 /** Menetapkan jumlahPinjaman yang baru*/
 public void tetapkanJumlahPinjaman(double loanAmount) {
 this.jumlahPinjaman = jumlahPinjaman;
 }

 /** Menghitung pembayaran bulanan */
 public double dapatPembayaranBulanan() {
 double sukuBungaBulanan = sukuBungaTahunan / 1200;
 double pembayaranBulanan = jumlahPinjaman * sukuBungaBulanan / (1 -
 (Math.pow(1 / (1 + sukuBungaBulanan), jumlahTahun * 12)));
 return pembayaranBulanan;
 }

 /** Menghitung total pembayaran */
 public double dapatPembayaranTotal() {
 double pembayaranTotal = dapatPembayaranBulanan() * jumlahTahun * 12;
 return pembayaranTotal;
 }

 /** Mengembalikan tanggal pinjaman */
 public java.util.Date dapatTanggalPinjaman() {
 return tanggalPinjaman;
 }
 }