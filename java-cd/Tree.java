 public interface Tree<E extends Comparable<E>> {
 /** Mengembalikan true jika elemen berada di dalam pohon */
 public boolean search(E e);

 /** Menyisipkan elemen e ke dalam BST
   * Mengembalikan true jika elemen disisipkan dengan sukses */
 public boolean insert(E e);

 /** Menghapus elemen tertentu dari pohon
   * Mengembalikan true jika elemen dihapus dengan sukses */
 public boolean delete(E e);

 /** Penjelajahan inorder dari akar*/
 public void inorder();

 /** Penjelajahan postorder dari akar */
 public void postorder();

 /** Penjelajahan preorder dari akar */
 public void preorder();

 /** Mendapatkan jumlah simpul di dalam pohon */
 public int getSize();

 /** Mengembalikan true jika pohon kosong */
 public boolean isEmpty();

 /** Mengembalikan suatu iterator untuk menjelajahi elemen-elemen di dalam pohon */
 public java.util.Iterator iterator();
 }