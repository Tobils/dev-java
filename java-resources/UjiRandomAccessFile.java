 import java.io.*;

 public class UjiRandomAccessFile {
 public static void main(String[] args) throws IOException {
 // Menciptakan suatu file akses-acak
 RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw");

 // Membersihkan file dengan menghancurkan isi semula, jika ada
 inout.setLength(0);

 // Menulis integer-integer baru ke dalam file
 for (int i = 0; i < 200; i++)
 inout.writeInt(i);

 // Menampilkan panjang file saat ini
 System.out.println("Panjang file saat ini adalah "+ inout.length());

 // MengambilRetrieve the first number
 inout.seek(0);//angka pertama
 System.out.println("Angka pertama adalah "+ inout.readInt());

 // Mengambil angka kedua
 inout.seek(1 * 4);// Menggerakkan pointer file ke angka kedua
 System.out.println("Angka kedua adalah "+ inout.readInt());

 // Mengambil angka kesepuluh
 inout.seek(9 * 4);// Menggerakkan pointer file ke angka kesepuluh
 System.out.println("Angka kesepuluh adalah "+ inout.readInt());

 // Memodifikasi angka kesebelas
 inout.writeInt(555);

 // Menyambungkan suatu angka baru
 inout.seek(inout.length());// Menggerakkan pointer file ke akhir file
 inout.writeInt(999);

 // Menampilkan panjang baru
 System.out.println("Panjang baru file adalah "+ inout.length());

 // Mengambil angka kesebelas yang baru
 inout.seek(10 * 4);// Menggerakkan pointer file ke angka selanjutnya
 System.out.println("Angka kesebelas adalah "+ inout.readInt());

 inout.close();
 }
 }
