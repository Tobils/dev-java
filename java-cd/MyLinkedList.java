 public class MyLinkedList<E> extends MyAbstractList<E> {
 private Node<E> kepala, ekor;

 /** Menciptakan suatu list default */
 public MyLinkedList() {
 }

 /** Menciptakan suatu list dari array objek */
 public MyLinkedList(E[] objek) {
 super(objek);
 }

 /** Mengembalikan elemen kepala di dalam list */
 public E getFirst() {
 if (ukuran == 0) {
 return null;
 }
 else {
 return kepala.elemen;
 }
 }

 /** Mengembalikan elemen terakhir di dalam list */
 public E getLast() {
 if (ukuran == 0) {
 return null;
 }
 else {
 return ekor.elemen;
 }
 }

 /** Menambah suatu elemen di awal list */
 public void addFirst(E e) {
 Node<E> simpulBaru = new Node<E>(e); // Menciptakan suatu simpul baru
simpulBaru.next = kepala;// Menghubungkan simpul baru dengan kepala
kepala = simpulBaru;// kepala menunjuk ke simpul baru
ukuran++;// Menginkremen ukuran list

 if(ekor == null) // simpul baru satu-satunya simpul di dalam list
 ekor = kepala;
 }

 /** Menambah suatu elemen ke akhir list */
 public void addLast(E e) {
 Node<E> simpulBaru = new Node<E>(e); // Menciptakan suatu simpul baru untuk e

 if (ekor == null) {
 kepala = ekor = simpulBaru; // Satu-satunya simpul di dalam list
 }
  else {
 ekor.next = simpulBaru;// Menghubungkan simpul baru dengan simpul terakhir
 ekor = ekor.next; // ekor sekarang menunjuk ke simpul terakhir
 }

 ukuran++; // Menginkremen ukuran
 }

 /** Menambah suatu elemen baru pada indeks tertentu di dalam list
 * Indeks elemen kepala adalah 0 */
 public void add(int index, E e) {
 if (index == 0) addFirst(e);// Menyisikan ke simpul pertama
 else if (index >= ukuran) addLast(e); // Menyisikan ke simpul terakhir
 else { // Menyisikan ke simpul tengah 
 Node<E> sekarang = kepala;
 for (int i = 1; i < index; i++)
 sekarang = sekarang.next;
 Node<E> temp = sekarang.next;
 sekarang.next = new Node<E>(e);
 (sekarang.next).next = temp;
 ukuran++;
 }
 }

 /** Menghapus simpul kepala dan
   * mengembalikan objek yang dimuat di dalam simpul terhapus. */
 public E removeFirst() {
 if (ukuran == 0) return null;// Tidak ada yang dihapus
 else {
 Node<E> temp = kepala; // Menyimpan sementara simpul pertama
 kepala = kepala.next; // Memindahkan kepala agar menunjuk ke simpul berikutnya
 ukuran--; // Mendekremen ukuran sebesar 1
 if (kepala == null) ekor = null; // List menjadi kosong
 return temp.elemen; // Menjadikan elemen terhapus sebagai nilai balik
 }
 }

 /** Menghapus simpul terakhir dan
   * mengembalikan objek yang dimuat di dalam simpul terhapus. */
 public E removeLast() {
 if (ukuran == 0) return null;// Tidak ada yang dihapus
 else if (ukuran == 1)// Satu-satunya elemen di dalam list
 {
 Node<E> temp = kepala;
 kepala = ekor = null; // list menjadi kosong
 ukuran = 0;
 return temp.elemen;
 }
 else
 {
 Node<E> sekarang = kepala;

 for (int i = 0; i < ukuran - 2; i++)
 sekarang = sekarang.next;

 Node<E> temp = ekor;
 ekor = sekarang;
 ekor.next = null;
 ukuran--;
 return temp.elemen;
 }
 }

 /** Menghapus elemen pada posisi tertentu di dalam list.
   * Mengembalikan elemen yang dihapus dari list. */
 public E remove( int index) {
  if (index < 0 || index >= ukuran) return null;// Di luar rentang
 else if (index == 0) return removeFirst(); // Menghapus simpul pertama
 else if (index == ukuran - 1) return removeLast(); // Menghapus simpul terakhir
 else {
 Node<E> sebelumnya = kepala;

 for (int i = 1; i < index; i++) {
 sebelumnya = sebelumnya.next;
 }

 Node<E> sekarang = sebelumnya.next;
 sebelumnya.next = sekarang.next;
 ukuran--;
 return sekarang.elemen;
 }
 }

 /** Mengoverride metode toString() untuk mengembalikan elemen-elemen di dalam list */
 public String toString() {
 StringBuilder result = new StringBuilder("[");

 Node<E> sekarang = kepala;
 for (int i = 0; i < ukuran; i++) {
 result.append(sekarang.elemen);
 sekarang = sekarang.next;
 if (sekarang != null) {
 result.append(", "); // Memisahkan dua elemen dengan koma
 }
 else {
 result.append("]"); // Menyisipkan ] di dalam string
 }
 }

 return result.toString();
 }

 /** Membersihkan list */
 public void clear() {
 kepala = ekor = null;
 }

 /** Mengembalikan true jika list ini memuat elemen o */
 public boolean contains(E e) {
 System.out.println("Implementasi dijadikan latihan");
 return true;
 }

 /** Mengembalikan elemen dari list ini pada indeks tertentu */
 public E get(int index) {
 System.out.println("Implementasi dijadikan latihan");
 return null;
 }

 /** Mengembalikan indeks dari kepala elemen cocok di dalam list ini.
   * Mengembalikan -1 jika tidak ada yang cocok. */
 public int indexOf(E e) { 
 System.out.println("Implementasi dijadikan latihan");
 return 0;
 }

 /** Mengembalikan indeks dari elemen cocok terakhir di dalam list ini
   * Mengembalikan -1 jika tidak ada yang cocok. */
 public int lastIndexOf(E e) {
 System.out.println("Implementasi dijadikan latihan");
 return 0;
 }

 /** Mengganti elemen pada posisi tertentu di dalam list ini
   * dengan elemen tertentu. */
 public E set(int index, E e) {
 System.out.println("Implementasi dijadikan latihan");
 return null;
 }

 private static class Node<E> {
 E elemen;
 Node<E> next;

 public Node(E elemen) {
 this.elemen = elemen;
 }
 }
 }