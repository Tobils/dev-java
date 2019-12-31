 public class MyPriorityQueue<E extends Comparable> {
 private Heap<E> heap = new Heap<E>();

 public void enqueue(E objekBaru) {
 heap.add(objekBaru);
 }

 public E dequeue() {
 return heap.remove();
 }
 
 public int getSize() {
 return heap.getSize();
 }
 }