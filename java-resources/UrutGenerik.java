 public class UrutGenerik {
 public static void main(String[] args) {
 // Menciptakan suatu array Integer
 Integer[] intArray = {new Integer(2), new Integer(4),
 new Integer(3)};

 // Menciptakan suatu array Double
 Double[] doubleArray = {new Double(3.4), new Double(1.3),
 new Double(-22.1)};

 // Menciptakan suatu array Character
 Character[] charArray = {new Character('a'),
 new Character('J'), new Character('r')};

 // Menciptakan suatu array String
 String[] stringArray = {"Vivian", "Kristina", "Butet"};

 // Mengurutkan array
 urut(intArray);
 urut(doubleArray);
 urut(charArray);
 urut(stringArray);

 // Menampilkan array terurut
 System.out.print("Objek-objek Integer terurut: ");
 printList(intArray);
 System.out.print("Objek-objek Double terurut: ");
 printList(doubleArray);
 System.out.print("Objek-objek Character terurut: ");
 printList(charArray);
 System.out.print("Objek-objek String terurut: ");
 printList(stringArray);
 }

 /** Mengurutkan array yang memuat objek-objek komparabel */
 public static void urut(Comparable[] list){
 Comparable minSekarang;
 int indeksMinSekarang;

 for (int i = 0; i < list.length - 1; i++) {
 // Menemukan maksimum dalam list[0..i]
 minSekarang = list[i];
 indeksMinSekarang = i;

 for (int j = i + 1; j < list.length; j++) {
 if (minSekarang.compareTo(list[j]) > 0) {
 minSekarang = list[j];
 indeksMinSekarang = j;
 }
 }

 // Menukar list[i] dengan list[indeksMinSekarang] jika diperlukan;
 if (indeksMinSekarang != i) {
 list[indeksMinSekarang] = list[i];
 list[i] = minSekarang;
 }
 }
 }

 /** Menampilkan array objek */
 public static void printList(Object[] list) {
 for (int i = 0; i < list.length; i++)
 System.out.print(list[i] + " ");
 System.out.println();
 }
 }