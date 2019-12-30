 public class DemoMetodeGenerik {
 public static void main(String[] args ) {
 Integer[] integer = {1, 2, 3, 4, 5};
 String[] string = {"Klaten", "Balige", "Jogja", "Siantar"};

 DemoMetodeGenerik.<Integer>tampil(integer);
 DemoMetodeGenerik.<String>tampil(string);
 }

 public static <E> void tampil(E[] daftar) {
 for (int i = 0; i < daftar.length; i++)
 System.out.print(daftar[i] + " ");
 System.out.println();
 }
 }