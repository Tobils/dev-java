 public class PengurutanSeleksiRekursif {
 public static void urut(double[] daftar) {
 urut(daftar, 0, daftar.length - 1);// Mengurutkan seluruh isi daftar
 }

 public static void urut(double[] daftar, int rendah, int tinggi) {
 if (rendah < tinggi) {
 // Mencari angka terkecil dan indeksnya di dalam daftar(rendah .. tinggi)
 int indeksDariMin = rendah;
 double min = daftar[rendah];
 for (int i = rendah + 1; i <= tinggi; i++) {
 if (daftar[i] < min) {
 min = daftar[i];
 indeksDariMin = i;
 }
 }

 // Menukar angka terkecil di dalam daftar(rendah .. tinggi) dengan daftar(rendah)
 daftar[indeksDariMin] = daftar[rendah];
 daftar[rendah] = min;

 // Mengurutkan sisa daftar(rendah+1 .. tinggi)
 urut(daftar, rendah + 1, tinggi);
 }
 }
 }