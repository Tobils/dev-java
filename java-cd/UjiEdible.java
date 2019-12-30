 public class UjiEdible {
 public static void main(String[] args) {
 Object[] objek = {new Harimau(), new Ayam(), new Apel()};
 for (int i = 0; i < objek.length; i++)
 if (objek[i] instanceof Edible)
 System.out.println(((Edible)objek[i]).bagaimanaMemakan());
 }
 }
 
  class Binatang {
 // Bidang data, konstruktor, dan metode diabaikan
 }

 class Ayam extends Binatang implements Edible {
 public String bagaimanaMemakan() {
 return "Ayam: Goreng saja";
 }
 }

 class Harimau extends Binatang {
 }
 
 abstract class Buah implements Edible {
 // Bidang data, konstruktor, dan metode diabaikan
 }

 class Apel extends Buah {
 public String bagaimanaMemakan() {
 return "Apel: Kupas dan makan";
 }
 }

 class Jeruk extends Buah {
 public String bagaimanaMemakan() {
 return "Jeruk: Dibuat jus";
 }
  }