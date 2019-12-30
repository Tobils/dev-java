 public class UjiPohonBinerDenganIterator {
 public static void main(String[] args) {
 BinaryTree<String> pohon = new BinaryTree<String>();
 pohon.insert("Gaby");
 pohon.insert("Marolop");
 pohon.insert("Taruli");
 pohon.insert("Adam");
 pohon.insert("Joni");
 pohon.insert("Poltak");
 pohon.insert("Dani");

java.util.Iterator iterator = pohon.inorderIterator();
 while(iterator.hasNext()) {
 System.out.println(((String)(iterator.next())).toUpperCase());
 }
 }
 }