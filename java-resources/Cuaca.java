import java.util.Scanner;

 public class Cuaca {
 public static void main(String[] args) {
 final int JUMLAH_HARI = 10;
 final int JUMLAH_JAM = 24;
 double[][][] data
 = new double[JUMLAH_HARI][JUMLAH_JAM][2];


 Scanner masukan = new Scanner(System.in);
// Membaca masukan menggunakan redireksi masukan dari suatu file
 for (int k = 0; k < JUMLAH_HARI * JUMLAH_JAM; k++) {
 int hari = masukan.nextInt();
 int jam = masukan.nextInt();
 double suhu = masukan.nextDouble();
 double kelembaban = masukan.nextDouble();
 data[hari - 1][jam - 1][0] = suhu;
 data[hari - 1][jam - 1][1] = kelembaban;
 }

 // Menemukan rerata temperatur dan kelembaban harian
 for (int i = 0; i < JUMLAH_HARI; i++) {
 double totalTemperaturHarian = 0, totalKelembabanHarian = 0;
 for (int j = 0; j < JUMLAH_JAM; j++) {
 totalTemperaturHarian += data[i][j][0];
 totalKelembabanHarian += data[i][j][1];
 }

 // Menampilkan hasil
System.out.println("Hari " + i + " memiliki rerata temperatur = "
+ totalTemperaturHarian / JUMLAH_JAM);
 System.out.println("Hari " + i + " memiliki rerata kelembaban = "
 + totalKelembabanHarian / JUMLAH_HARI);
 }
 }
 }