 import java.io.File;
 import java.util.Scanner;

 public class KapasitasDirektori {
 public static void main(String[] args) {
 // Meminta pengguna untuk memasukkan suatu file atau direktori
 System.out.print("Masukkan suatu direktori atau file: ");
 Scanner masukan = new Scanner(System.in);
 String direktori = masukan.nextLine();

 // Menampilkan kapasitas
 System.out.println( getSize(new File(direktori)) + " byte");
 }

 public static long getSize(File file) {
 long kapasitas = 0; // Menyimpan kapasitas total semua file

 if(file.isDirectory()) {
 File[] files = file.listFiles();// Semua file dan subdirektori
 for (int i = 0; i < files.length; i++) {
 kapasitas += getSize(files[i]); // Pemanggilan rekursif
 }
 }
 else { // Kasus basis
 kapasitas += file.length();
 }

 return kapasitas;
 }
 }