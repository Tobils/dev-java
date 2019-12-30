 public abstract class MyAbstractList<E> implements MyList<E> {
 protected int ukuran = 0; // Ukuran list

 /** Menciptakan suatu list default */
 protected MyAbstractList() {
 }

 /** Menciptakan suatu list dari suatu array objek */
 protected MyAbstractList(E[] objek) {
 for (int i = 0; i < objek.length; i++)
 add(objek[i]);
 }

 /** Menambah suatu elemen baru di ujung list */
 public void add(E e) {
 add(ukuran, e);
 }

 /** Mengembalikan true jika list ini tidak memuat satupun elemen */
 public boolean isEmpty() {
 return ukuran == 0;
 }

 /** Mengembalikan jumlah elemen di dalam list ini */
 public int size() {
 return ukuran;
 }

 /** Menghapus kemunculan pertama elemen o dari list ini.
   * Menggeser elemen-elemen ke kiri.
   * Mengembalikan true jika elemen dihapus. */
 public boolean remove(E e) {
 if (indexOf(e) >= 0) {
 remove(indexOf(e));
 return true;
 }
 else
 return false;
 }
 }