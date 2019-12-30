 public class PengurutanQuick {
 public static void pengurutanQuick(int[] list) {
 pengurutanQuick(list, 0, list.length - 1);
 }

 private static void pengurutanQuick(int[] list, int pertama, int terakhir) {
 if (terakhir > pertama) {
 int indeksPivot = partisi(list, pertama, terakhir);
 pengurutanQuick(list, pertama, indeksPivot - 1);
 pengurutanQuick(list, indeksPivot + 1, terakhir);
 }
 }

 /** Mempartisi array list[pertama..terakhir] */
 private static int partisi(int[] list, int pertama, int terakhir) {
 int pivot = list[pertama]; // Memilih elemen pertama sebaagai pivot
 int rendah = pertama + 1; // Indeks untuk pencarian maju
 int tinggi = terakhir; // indeks untuk pencarian mundur

 while (tinggi > rendah) {
 // Mencari secara maju dari kiri
 while (rendah <= tinggi && list[rendah] <= pivot)
 rendah++;

 // Mencari secara mundur dari kanan
 while (rendah <= tinggi && list[tinggi] > pivot)
 tinggi--;

 // Menukar dua elemen di dalam list
 if (tinggi > rendah) {
 int temp = list[tinggi];
 list[tinggi] = list[rendah];
 list[rendah] = temp;
 }
 }

 while (tinggi > pertama && list[tinggi] >= pivot)
 tinggi--;

 // Menukar pivot dengan list[tinggi]
 if (pivot > list[tinggi]) {
 list[pertama] = list[tinggi];
 list[tinggi] = pivot;
 return tinggi;
 }
 else {
 return pertama;
 }
 }

 /** Metode untuk menguji */
 public static void main(String[] args) {
 int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
 pengurutanQuick(list);
 for (int i = 0; i < list.length; i++)
 System.out.print(list[i] + " ");
 }
 }