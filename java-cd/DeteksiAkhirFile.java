 import java.io.*;

 public class DeteksiAkhirFile {
 public static void main(String[] args) {
 try {
 DataOutputStream keluaran = new DataOutputStream
 (new FileOutputStream("uji.dat"));
 keluaran.writeDouble(4.5);
 keluaran.writeDouble(43.25);
 keluaran.writeDouble(3.2);
 keluaran.close();

 DataInputStream masukan = new DataInputStream
 (new FileInputStream("uji.dat"));
 while (true) {
 System.out.println(masukan.readDouble());
 }
 }
 catch (EOFException ex) {
 System.out.println("Semua data terbaca");
 }
 catch (IOException ex) {
 ex.printStackTrace();
 }
 }
 }
