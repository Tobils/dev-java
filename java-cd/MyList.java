 public interface MyList<E>{
 /** Menambah suatu elemen baru di ujung list ini */
 public void add(E e);

 /** Menambah suatu elemen baru pada indeks tertentu di dalam list ini */
 public void add(int index, E e);

 /** Menghapus list */
 public void clear();

 /** Mengembalikan true jika list ini memuat elemen */
 public boolean contains(E e);

 /** Mengembalikan elemen dari list ini pada indeks tertentu */
 public E get(int index);

 /** Mengembalikan indeks dari elemen cocok pertama di dalam list ini.
   * Mengembalikan -1 jika tidak ada yang cocok. */
 public int indexOf(E e);

 /** Mengembalikan true jika list ini tidak memuat satupun elemen */
 public boolean isEmpty();

 /** Mengembalikan indeks dari elemen cocok terakhir di dalam list ini
   * Mengembalikan -1 jika tidak ada yang cocok. */
 public int lastIndexOf(E e);

 /** Menghapus kemunculan pertama dari elemen o pada lisi ini.
   * Menggeser elemen-elemen ke kiri.
   * Mengembalikan true jika elemen dihapus. */
 public boolean remove(E e);

 /** Menghapus elemen pada posisi tertentu di dalam list ini
   * Menggeser elemen-elemen ke kiri.
   * Mengembalikan elemen yang dihapus dari list ini. */
 public E remove(int index);

 /** Mengganti elemen pada posisi tertentu di dalam list ini
   * dengan elemen tertentu dan mengembalikan set yang baru. */
 public Object set(int index, E e);

 /** Mengembalikan jumlah elemen di dalam list ini */
 public int size();
 }