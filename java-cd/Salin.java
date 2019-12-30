 import java.io.*;

 public class Salin {
 /** Metode utama
 @param args[0] untuk filesumber
 @param args[1] untuk filetarget
 */
 public static void main(String[] args) throws IOException {
 // Memeriksa penggunaan parameter command-line
 if (args.length != 2) {
 System.out.println(
 "Usage: java Salin fileSumber fileTarget");
 System.exit(0);
 }

 // Memeriksa apakah file sumber ada
 File fileSumber = new File(args[0]);
 if (!fileSumber.exists()) {
 System.out.println("Source file " + args[0] + " not exist");
 System.exit(0);
 }

 // Memeriksa apakah file target ada
 File fileTarget = new File(args[1]);
 if (fileTarget.exists()) {
 System.out.println("Target file " + args[1] + " already exists");
 System.exit(0);
 }

 // Menciptakan suatu aliran masukan
 BufferedInputStream masukan =
 new BufferedInputStream(new FileInputStream(fileSumber));

 // Menciptakan suatu aliran keluaran
 BufferedOutputStream keluaran =
 new BufferedOutputStream(new FileOutputStream(fileTarget));

 // Secara kontinyu membaca suatu byte dari aliran masukan dan menulisnya ke aliran keluaran
 int r; int jumlahByteDisalin = 0;
 while ((r = masukan.read()) != -1) {
 keluaran.write((byte)r);
 jumlahByteDisalin++;
 }

 // Menutup aliran-aliran
 masukan.close();
 keluaran.close();

 // Menampilkan hasil
 System.out.println(jumlahByteDisalin + " bytes copied");
 }
 }