 import java.io.*;

 public class UjiAliranFile {
 public static void main(String[] args) throws IOException{
 // Menciptakan suatu alitan keluaran ke file
 FileOutputStream keluaran = new FileOutputStream("temp.dat");

 // Mengeluarkan nilai-nilai ke file
 for (int i = 1; i <= 10; i++)
 keluaran.write(i);

 // Menutup aliran keluaran
 keluaran.close();

 // Menciptakan suatu alitan masukan
 FileInputStream masukan = new FileInputStream("temp.dat");

 // Membaca nilai-nilai dari file
 int nilai;
 while ((nilai = masukan.read()) != -1)
 System.out.print(nilai + " ");

 // Menutup aliran keluaran
 masukan.close();
 }
 }