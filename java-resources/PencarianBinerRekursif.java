 public class PencarianBinerRekursif {
 public static int PencarianBinerRekursif(int[] daftar, int kunci) {
 int rendah = 0;
 int tinggi = daftar.length - 1;
 return PencarianBinerRekursif(daftar, kunci, rendah, tinggi);
 }

 public static int PencarianBinerRekursif(int[] daftar, int kunci,
 int rendah, int tinggi) {
 if (rendah > tinggi)// Daftar telah dicari tanpa ada kecocokan
 return -rendah - 1;

 int tengah = (rendah + tinggi) / 2;
 if (kunci < daftar[tengah])
 return PencarianBinerRekursif(daftar, kunci, rendah, tengah - 1);
 else if (kunci == daftar[tengah])
 return tengah;
 else
 return PencarianBinerRekursif(daftar, kunci, tengah + 1, tinggi);
 }
 }
