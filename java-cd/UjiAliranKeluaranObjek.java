 import java.io.*;

 public class UjiAliranKeluaranObjek {
 public static void main(String[] args) throws IOException {
 // Menciptakan suatu aliran keluaran untuk fil objek.dat
 ObjectOutputStream keluaran =
 new ObjectOutputStream(new FileOutputStream("objek.dat"));

 // Menulis suatu string, nilai double, dan objek ke dalam file
 keluaran.writeUTF("Butet");
 keluaran.writeDouble(85.5);
 keluaran.writeObject(new java.util.Date());

 // Menutup aliran keluaran
 keluaran.close();
 }
 }