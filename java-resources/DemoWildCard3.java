 public class DemoWildCard3 {
 public static void main(String[] args) {
 GenericStack<String> tumpukan1 = new GenericStack<String>();
 GenericStack<Object> tumpukan2 = new GenericStack<Object>();
 tumpukan2.push("JAVA");
 tumpukan2.push(2);
 tumpukan1.push("Tangguh");
 add(tumpukan1, tumpukan2);
 DemoWildCard2.tampil(tumpukan2);
 }

 public static<T> void add(GenericStack<T> tumpukan1,
 GenericStack<? super T> tumpukan2) {
 while (!tumpukan1.isEmpty())
 tumpukan2.push(tumpukan1.pop());
 }
 }