 public class BinaryTree<E extends Comparable<E>>
 extends AbstractTree<E> {
 protected TreeNode<E> akar;
 protected int size = 0;

 /** Menciptakan suatu pohon biner default */
 public BinaryTree() {
 }

 /** Menciptakan suatu pohon pencarian biner dari array objek */
 public BinaryTree(E[] objek) {
 for (int i = 0; i < objek.length; i++)
 insert(objek[i]);
 }

 /** Mengembalikan true jika elemen berada di dalam pohon */
 public boolean search(E e) {
 TreeNode<E> sekarang = akar; // Memulai dari akar

 while (sekarang != null) {
 if (e.compareTo(sekarang.elemen) < 0) {
 sekarang = sekarang.kiri;
 }
 else if (e.compareTo(sekarang.elemen) > 0) {
 sekarang = sekarang.kanan;
 }
 else // elemen cocok dengan sekarang.elemen
 return true; // Elemen ditemukan
 }

 return false;
 }

 /** Menyisipkan elemen e ke BST
   * Mengembalikan true jika elemen disisipkan dengan sukses */
 public boolean insert(E e) {
 if (akar == null)
 akar = createNewNode(e); // Menciptakan suatu akar baru
 else {
 // Mencari lokasi simpul orangtua
 TreeNode<E> orangtua = null;
 TreeNode<E> sekarang = akar;
 while (sekarang != null)
 if (e.compareTo(sekarang.elemen) < 0) {
 orangtua = sekarang;
 sekarang = sekarang.kiri;
 }
 else if (e.compareTo(sekarang.elemen) > 0) {
 orangtua = sekarang;
 sekarang = sekarang.kanan;
 }
 else
 return false; // Simpul duplikat tidak disisipkan

 // Menciptakan suatu simpul baru dan menempelkannya ke simpul orangtua
 if (e.compareTo(orangtua.elemen) < 0)
 orangtua.kiri = createNewNode(e);
 else
 orangtua.kanan = createNewNode(e);
 }

 size++;
 return true; // Elemen disisipkan
 }

 protected TreeNode<E> createNewNode(E e) {
 return new TreeNode<E>(e);
 }

 /** Penjelajahan inorder dari akar */
 public void inorder() {
 inorder(akar);
 }

 /** Penjelajahan inorder dari suatu subpohon */
 protected void inorder(TreeNode<E> akar) {
 if (akar == null) return;
 inorder(akar.kiri);
 System.out.print(akar.elemen + " ");
 inorder(akar.kanan);
 }

 /** Penjelajahan postorder dari akar */
 public void postorder() {
 postorder(akar);
 }

 /** Penjelajahan postorder dari suatu subpohon */
 protected void postorder(TreeNode<E> akar) {
 if (akar == null) return;
 postorder(akar.kiri);
 postorder(akar.kanan);
 System.out.print(akar.elemen + " ");
 }

 /** Penjelajahan preorder dari akar */
 public void preorder() {
 preorder(akar);
 }

 /** Penjelajahan preorder dari suatu subpohon */
 protected void preorder(TreeNode<E> akar) {
 if (akar == null) return;
 System.out.print(akar.elemen + " ");
 preorder(akar.kiri);
 preorder(akar.kanan);
 }

/** Kelas inner simpul pohon */
 public static class TreeNode<E extends Comparable<E>> {
 E elemen;
 TreeNode<E> kiri;
 TreeNode<E> kanan;

 public TreeNode(E e) {
 elemen = e;
 }
 }

 /** Mendapatkan jumlah simpul di dalam pohon */
 public int getSize() {
 return size;
 }

 /** Mengembalikan akar pohon */
 public TreeNode getRoot() {
 return akar;
 }

 /** Mengembalikan suatu jalur dari akar sampai elemen tertentu */
 public java.util.ArrayList<TreeNode<E>> path(E e) {
 java.util.ArrayList<TreeNode<E>> list =
 new java.util.ArrayList<TreeNode<E>>();
 TreeNode<E> sekarang = akar; // Mulai dari akar

 while (sekarang != null) {
 list.add(sekarang); // Menambah simpul ke dalam list
 if (e.compareTo(sekarang.elemen) < 0) {
 sekarang = sekarang.kiri;
 }
 else if (e.compareTo(sekarang.elemen) > 0) {
 sekarang = sekarang.kanan;
 }
 else
 break;
 }

 return list; // Mengembalikan suatu array simpul
 }

 /** Menghapus suatu elemen dari pohon pencarian biner.
   * Mengembalikan true jika elemen dihapus dengan sukses
   * Mengembalikan false jika elemen tidak berada di dalam pohon */
 public boolean delete(E e) {
 // Mencari lokasi simpul yang akan dihapus dan juga mencari simpul orangtuanya
 TreeNode<E> orangtua = null;
 TreeNode<E> sekarang = akar;
 while (sekarang != null) {
 if (e.compareTo(sekarang.elemen) < 0) {
 orangtua = sekarang;
 sekarang = sekarang.kiri;
 }
 else if (e.compareTo(sekarang.elemen) > 0) {
 orangtua = sekarang;
 sekarang = sekarang.kanan;
 }
 else
 break; // Elemen berada di dalam pohon ditunjuk oleh sekarang
 }

 if (sekarang == null)
 return false; // Elemen tidak berada di dalam pohon

 // Kasus 1: sekarang tidak memiliki anak kiri
 if (sekarang.kiri == null) {
 // Menghubungkan orangtua dengan anak kanan dari simpul sekarang
 if (orangtua == null) {
 akar = sekarang.kanan;
 }
 else {
 if (e.compareTo(orangtua.elemen) < 0)
 orangtua.kiri = sekarang.kanan;
 else
 orangtua.kanan = sekarang.kanan;
 }
 }
 else {
 // Kasus 2: Simpul sekarang memiliki suatu anak kiri
 // Menempatkan simpul palingKanan di dalam subpohon kiri dari
 // simpul sekarang dan juga orangtuanya
 TreeNode<E> orangtuaPalingKanan = sekarang;
 TreeNode<E> palingKanan = sekarang.kiri;

 while (palingKanan.kanan != null) {
 orangtuaPalingKanan = palingKanan;
 palingKanan = palingKanan.kanan; // Terus ke kanan
 }

 // Mengganti elemen di dalam sekarang dengan elemen di dalam palingKanan
 sekarang.elemen = palingKanan.elemen;

 // Menghapus simpul paling kanan
 if (orangtuaPalingKanan.kanan == palingKanan)
 orangtuaPalingKanan.kanan = palingKanan.kiri;
 else
 // Kasus spesial: orangtuaPalingKanan == sekarang
 orangtuaPalingKanan.kiri = palingKanan.kiri;
 }

 size--;
 return true; // Elemen disisipkan
 }

 /** Mendapatkan suatu iterator. Menggunakan inorder. */
 public java.util.Iterator iterator() {
 return inorderIterator();
 }

 /** Mendapatkan iterator inorder */
 public java.util.Iterator inorderIterator() {
 return new InorderIterator();
 }

 // Kelas inner InorderIterator
 class InorderIterator implements java.util.Iterator {
 // Menyimpan elemen di dalam suatu list
 private java.util.ArrayList<E> list =
 new java.util.ArrayList<E>();
 private int sekarang = 0; // Menunjuk ke elemen sekarang di dalam list

 public InorderIterator() {
 inorder(); // Menjelajah pohon biner dan menyimpan elemen di dalam list
 }

 /** Penjelajahan inorder dari akar*/
 private void inorder() {
 inorder(akar);
 }

 /** Penjelajahan inorder dari suatu subpohon */
 private void inorder(TreeNode<E> akar) {
 if (akar == null)return;
 inorder(akar.kiri);
 list.add(akar.elemen);
 inorder(akar.kanan);
 }

 /** Elemen berikutnya untuk dijelajah */
 public boolean hasNext() {
 if (sekarang < list.size())
 return true;

 return false;
 }

 /** Mendapatkan elemen sekarang dan menggeser kursor ke simpul berikutnya */
 public Object next() {
 return list.get(sekarang++);
 }

 /** Menghapus elemen sekarang dan merefresh list */
 public void remove() {
 delete(list.get(sekarang)); // Menghapus elemen sekarang
 list.clear(); // Membersihkan list
 inorder(); // Membangung-ulang list
 }
 }

 /** Menghapus semua elemen dari pohon */
 public void clear() {
 akar = null;
 size = 0;
 }
 }
