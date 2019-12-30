 import java.io.*;

 public class MenciptakanFileBesar {
 public static void main(String[] args) throws Exception {
 DataOutputStream keluaran = new DataOutputStream(
 new BufferedOutputStream(
 new FileOutputStream("databesar.dat")));

 for (int i = 0; i < 800004; i++)
 keluaran.writeInt((int)(Math.random() * 1000000));

 keluaran.close();

 // Menampilkan 30 angka pertama
 DataInputStream masukan =
 new DataInputStream(new FileInputStream("databesar.dat"));
 for (int i = 0; i < 30; i++)
 System.out.print(masukan.readInt() + " ");

 masukan.close();
 }
 }