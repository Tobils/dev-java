 public class MyArrayList<E> extends MyAbstractList<E> {
 public static final int KAPASITAS_AWAL = 16;
 private E[] data = (E[]) new Object[KAPASITAS_AWAL];

 /** Menciptakan suatu list default */
 public MyArrayList() {
 }

 /** Menciptakan suatu list dari array objek */
 public MyArrayList(E[] objek) {
 for (int i = 0; i < objek.length; i++)
 add(objek[i]); // Peringatan: jangan gunakan super(objek)!
 }

 /** Menambahkan suatu elemen baru pada indeks tertentu di dalam list */
 public void add(int indeks, E e) {
 ensureCapacity();

 // Memindahkan elemen-elemen ke kanan setelah indeks tertentu
 for (int i = ukuran - 1; i >= indeks; i--)
 data[i + 1] = data[i];

 // Menyisipkan elemen baru ke data[indeks]
 data[indeks] = e;

 // Menambah ukuran sebesar 1
 ukuran++;
 }

 /** Menciptakan suatu array yang lebih besar, menggandakan ukuran sekarang + 1 */
 private void ensureCapacity() {
 if (ukuran >= data.length) {
 E[] dataBaru = (E[])(new Object[ukuran * 2 + 1]);
 System.arraycopy(data, 0, dataBaru, 0, ukuran);
 data = dataBaru;
 }
 }

 /** Membersihkan list */
 public void clear() {
 data = (E[])new Object[KAPASITAS_AWAL];
 ukuran = 0;
 }

 /** Mengembalikan true jika list ini memuat elemen */
 public boolean contains(E e) {
 for (int i = 0; i < ukuran; i++)
 if (e.equals(data[i])) return true;

 return false;
 }

 /** Mengembalikan elemen dari list ini pada indeks tertentu */
 public E get(int indeks) {
 return data[indeks];
 }

 /** Mengembalikan indeks dari elemen cocok pertama di dalam list ini.
   * Mengembalikan -1 jika tidak ada yang cocok. */
 public int indexOf(E e) {
 for (int i = 0; i < ukuran; i++)
 if (e.equals(data[i])) return i;

 return -1;
 }

 /** Mengembalikan indeks dari elemen cocok terakhir di dalam list ini.
   * Mengembalikan -1 jika tidak ada yang cocok. */
 public int lastIndexOf(E e) {
 for (int i = ukuran - 1; i >= 0; i--)
 if (e.equals(data[i])) return i;

 return -1;
 }

 /** Menghapus pada posisi tertentu di dalam list ini
   * Menggeser elemen-elemen ke kiri.
   * Mengembalikan elemen yang dihapus dari list. */
 public E remove(int indeks) {
 E e = data[indeks];

 // Menggeser data ke kiri
 for (int j = indeks; j < ukuran - 1; j++)
 data[j] = data[j + 1];

 data[ukuran - 1] = null; // ELemen ini sekarang null

 // Mendekremen ukuran
 ukuran--;

 return e;
 }

 /** Mengganti elemen pada posisi tertentu di dalam list ini
   * dengan elemen tertentu. */
 public E set(int indeks, E e) {
 E old = data[indeks];
 data[indeks] = e;
 return old;
 }

 /** Mengoverride metode toString() untuk mengembalikan elemen-elemen di dalam list */
 public String toString() {
 StringBuilder hasil = new StringBuilder("[");

 for (int i = 0; i < ukuran; i++) {
 hasil.append(data[i]);
 if (i < ukuran - 1) hasil.append(", ");
 }

 return hasil.toString() + "]";
 }

 /** Memotong kapasitas menjadi ukuran sekarang */
 public void trimToSize() {
 if (ukuran != data.length) {
 // Jika ukuran == kapasitas, tidak diperlukan pemotongan
 E[] newData = (E[])(new Object[ukuran]);
 System.arraycopy(data, 0, newData, 0, ukuran);
 data = newData;
 }
 }
 }