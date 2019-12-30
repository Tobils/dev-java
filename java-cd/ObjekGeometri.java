 public abstract class ObjekGeometri {
 private String warna = "putih";
 private boolean terisi;
 private java.util.Date tanggalDiciptakan;

 /** Menciptakan suatu objek geometri default */
 protected ObjekGeometri() {
 tanggalDiciptakan = new java.util.Date();
 }

 /** Menciptakan suatu objek geometri dengan warna dan
   * nilai terisi tertentu */
 protected ObjekGeometri(String warna, boolean terisi) {
 tanggalDiciptakan = new java.util.Date();
 this.warna = warna;
 this.terisi = terisi;
 }

 /** Mengembalikan warna */
 public String dapatWarna() {
 return warna;
 }

 /** Menetapkan suatu warna baru */
 public void dapatWarna(String warna) {
 this.warna = warna;
 }

 /** Mengembalikan terisi. Karena terisi adalah suatu boolean,
 metode dapat dinamai apaTerisi */
 public boolean apaTerisi() {
 return terisi;
 }

 /** Menetapkan suatu nilai terisi yang baru */
 public void tetapkanTerisi(boolean terisi) {
 this.terisi = terisi;
 }

 /** Mendapatkan tanggalDiciptakan */
 public java.util.Date dapatTanggalDiciptakan() {
 return tanggalDiciptakan;
 }

 /** Mengembalikan suatu representasi string atas objek ini */
 public String keString() {
 return "diciptakan pada " + tanggalDiciptakan + "\nwarna: " + warna +
 " dan nilai terisi: " + terisi;
 }
 
 /** Metode abstrak dapatLuas */
 public abstract double dapatLuas();
 
 /** Metode abstrak dapatKeliling */
 public abstract double dapatKeliling();
 }
 
