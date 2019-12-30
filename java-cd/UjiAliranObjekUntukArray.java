 import java.io.*;

 public class UjiAliranObjekUntukArray {
 public static void main(String[] args)
 throws ClassNotFoundException, IOException {
 int[] angka = {1, 2, 3, 4, 5};
 String[] string = {"Robert", "Sintong", "Rico"};

 // Menciptakan suatu aliran keluaran untuk file array.dat
 ObjectOutputStream keluaran =
 new ObjectOutputStream(new FileOutputStream
 ("array.dat", true));

 // Menulis array ke aliran keluaran objek
 keluaran.writeObject(angka);
 keluaran.writeObject(string);

 // Menutup aliran
 keluaran.close();

 // Menciptakan suatu aliran masukan untuk file array.dat
 ObjectInputStream masukan =
 new ObjectInputStream(new FileInputStream("array.dat"));

 int[] angkaBaru = (int[])(masukan.readObject());
 String[] stringBaru = (String[])(masukan.readObject());

 // Menampilkan array
 for (int i = 0; i < angkaBaru.length; i++)
 System.out.print(angkaBaru[i] + " ");
 System.out.println();

 for (int i = 0; i < stringBaru.length; i++)
 System.out.print(stringBaru[i] + " ");
 }
 }