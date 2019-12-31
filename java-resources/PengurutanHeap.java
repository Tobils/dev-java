 public class PengurutanHeap {
 /** Metode pengurutan Heap */
 public static <E extends Comparable> void pengurutanHeap(E[] list) {
 // Menciptakan suatu heap integer
 Heap<E> heap = new Heap<E>();

 // Menambah elemen ke heap
 for (int i = 0; i < list.length; i++)
 heap.add(list[i]);

 // Menghapus elemen dari heap
 for (int i = list.length - 1; i >= 0; i--)
 list[i] = heap.remove();
 }

 /** Metode untuk menguji */
 public static void main(String[] args) {
 Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
 pengurutanHeap(list);
 for (int i = 0; i < list.length; i++)
 System.out.print(list[i] + " ");
 }
 }