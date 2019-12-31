 import java.io.*;

 public class UjiAliranData {
 public static void main(String[] args) throws IOException {
 // Menciptakan suatu aliran keluaran untuk file temp.dat
 DataOutputStream keluaran =
 new DataOutputStream(new FileOutputStream("temp.dat"));

 // Menulis nama dan skor mahasiswa ke file
 keluaran.writeUTF("Robert");
 keluaran.writeDouble(85.5);
 keluaran.writeUTF("Sintong");
 keluaran.writeDouble(185.5);
 keluaran.writeUTF("Rico");
 keluaran.writeDouble(105.25);

 // Menutup aliran keluaran
 keluaran.close();

 // Menciptakan suatu aliran masukan untuk file temp.dat
 DataInputStream masukan =
new DataInputStream(new FileInputStream("temp.dat"));
 // Membaca nama skor mahasiswa dari file 
 System.out.println( masukan.readUTF() + " " +masukan.readDouble() );
 System.out.println(masukan.readUTF() + " " + masukan.readDouble());
 System.out.println(masukan.readUTF() + " " + masukan.readDouble());
 }
 }