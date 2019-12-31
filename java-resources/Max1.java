 public class Max1 {
 /** Mengembalikan maksimum dari dua objek */
 public static <E extends Comparable<E>> E max(E o1 , E o2) {
 if(o1.compareTo(o2)> 0)
 return o1;
 else
 return o2;
 }
 }