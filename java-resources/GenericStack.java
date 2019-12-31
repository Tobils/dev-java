 public class GenericStack<E> {
 private java.util.ArrayList<E> daftar = new java.util.ArrayList<E>();

 public int getSize() {
 return daftar.size();
 }

 public E peek() {
 return daftar.get(getSize() - 1);
 }

 public void push(E o) {
 daftar.add(o);
 }

 public E pop() {
 E o = daftar.get(getSize() - 1);
 daftar.remove(getSize() - 1);
 return o;
 }

 public boolean isEmpty() {
 return daftar.isEmpty();
 }
 
 public String toString() {
 return "Antrian: " + daftar.toString();
 }
 }