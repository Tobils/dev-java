 public class Heap<E extends Comparable> {
 private java.util.ArrayList<E> list = new java.util.ArrayList<E>();

 /** Menciptakan suatu heap default */
 public Heap(){
 }

 /** Menciptakan suatu heap dari array objek */
 public Heap(E[] objek){
 for (int i = 0; i < objek.length; i++)
 add(objek[i]);
 }

 /** Menambah suatu objek baru ke dalam heap */
 public void add(E objekBaru){
 list.add(objekBaru); // Menyambung ke heap
 int indeksSekarang = list.size() - 1; // Indeks dari simpul terakhir

 while (indeksSekarang > 0) {
 int indeksOrangtua = (indeksSekarang - 1) / 2;
 // Menukar jika objek sekarang lebih besar dari orangtuanya
 if (list.get(indeksSekarang).compareTo(
 list.get(indeksOrangtua)) > 0) {
 E temp = list.get(indeksSekarang);
 list.set(indeksSekarang, list.get(indeksOrangtua));
 list.set(indeksOrangtua, temp);
 }
 else
 break; // Pohon menjadi suatu heap sekarang

 indeksSekarang = indeksOrangtua;
 }
 }

 /** Menghapus akar dari heap */
 public E remove(){
 if (list.size() == 0) return null;

 E objekDihapus = list.get(0);
 list.set(0, list.get(list.size() - 1));
 list.remove(list.size() - 1);

 int indeksSekarang = 0;
 while (indeksSekarang < list.size()) {
 int indeksAnakKiri = 2 * indeksSekarang + 1;
 int indeksAnakKanan = 2 * indeksSekarang + 2;

 // Mencari maksimum dari dua anak
 if (indeksAnakKiri >= list.size()) break; // Pohon adalah suatu heap
 int indeksMaks = indeksAnakKiri;
 if (indeksAnakKanan < list.size()) {
 if (list.get(indeksMaks).compareTo(
 list.get(indeksAnakKanan)) < 0) {
 indeksMaks = indeksAnakKanan;
 }
 }

 // Menukar jika simpul sekarang kurang dari maksimum
 if (list.get(indeksSekarang).compareTo(
 list.get(indeksMaks)) < 0) {
 E temp = list.get(indeksMaks);
 list.set(indeksMaks, list.get(indeksSekarang));
 list.set(indeksSekarang, temp);
 indeksSekarang = indeksMaks;
 }
 else
 break; // Pohon adalah suatu heap
 }

 return objekDihapus;
 }

 /** Mendapatkan jumlah simpul di dalam pohon */
 public int getSize(){
 return list.size();
 }
 }