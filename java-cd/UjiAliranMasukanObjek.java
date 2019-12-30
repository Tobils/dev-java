 import java.io.*;

 public class UjiAliranMasukanObjek {
 public static void main(String[] args)
 throws ClassNotFoundException, IOException {
 // Menciptakan suatu aliran masukan untuk file objek.dat
 ObjectInputStream masukan =
 new ObjectInputStream(new FileInputStream("objek.dat"));

 // Membaca suatu string, nilai double, dan objek dari file
 String nama = masukan.readUTF();
 double skor = masukan.readDouble();
 java.util.Date tanggal = (java.util.Date)(masukan.readObject());
 System.out.println(nama + " " + skor + " " + tanggal);

 // Menutup aliran keluaran
 masukan.close();
 }
 }