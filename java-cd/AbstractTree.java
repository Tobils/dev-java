 public abstract class AbstractTree<E extends Comparable<E>>
 implements Tree<E> {
 /** Penjelajahan inorder dari akar */
 public void inorder() {
 }

 /** Penjelajahan postorder dari akar */
 public void postorder() {
 }

 /** Penjelajahan preorder dari akar */
 public void preorder() {
 }

 /** Mengembalikan true jika pohon kosong */
 public boolean isEmpty() {
 return getSize() == 0;
 }

 /** Mengembalikan suatu iterator untuk menjelajahi elemen-elemen di dalam pohon */
 public java.util.Iterator iterator() {
 return null;
 }
 }