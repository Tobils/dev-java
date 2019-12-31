 import java.io.*;

 public class UrutFileBesar {
 public static final int UKURAN_ARRAY_MAKS = 100000;
 public static final int UKURAN_BUFFER = 100000;

 public static void main(String[] args) throws Exception {
 // Mengurutkan databesar.dat ke fileterurut.dat
 urut("databesar.dat", "fileterurut.dat");

 // Menampilkan 100 angka pertama di dalam fileterurut.dat
 tampilFile("fileterurut.dat");
 }

 /** Mengurutkan data di dalam file sumber ke file target */
 public static void urut(String filesumber, String filetarget)
 throws Exception {
 // Implement Phase 1: Create initial segments
 int jumlahSegmen =
 inisialisasiSegmen(UKURAN_ARRAY_MAKS, filesumber, "f1.dat");

 // Implement Phase 2: Merge segments recursively
 gabung(jumlahSegmen, UKURAN_ARRAY_MAKS,
 "f1.dat", "f2.dat", "f3.dat", filetarget);
 }

 /** Mengurutkan file awal menjadi segmen-segmen terurut */
 private static int inisialisasiSegmen
 (int ukuranSegmen, String fileAwal, String f1)
 throws Exception {
 int[] list = new int[ukuranSegmen];
  DataInputStream masukan = new DataInputStream(
    new BufferedInputStream(new FileInputStream(fileAwal)));
  DataOutputStream keluaran = new DataOutputStream(
    new BufferedOutputStream(new FileOutputStream(f1)));

  int jumlahSegmen = 0;
  while (masukan.available() > 0) {
    jumlahSegmen++;
    int i = 0;
    for ( ; masukan.available() > 0 && i < ukuranSegmen; i++) {
      list[i] = masukan.readInt();
    }

    // Mengurutkan suatu list array[0..i-1]
    java.util.Arrays.sort(list, 0, i);

    // Menulis array ke f1.dat
    for (int j = 0; j < i; j++) {
      keluaran.writeInt(list[j]);
    }
  }

  masukan.close();
  keluaran.close();

  return jumlahSegmen;

 }

 private static void gabung(int jumlahSegmen, int ukuranSegmen,
 String f1, String f2, String f3, String filetarget)
 throws Exception {
 if (jumlahSegmen > 1) {
 gabungSatuLangkah(jumlahSegmen, ukuranSegmen, f1, f2, f3);
 gabung((jumlahSegmen + 1) / 2, ukuranSegmen * 2,
 f3, f1, f2, filetarget);
 }
 else { // Menamai-ulang f1 sebagai file terurut akhir
 File fileDiurutkan = new File(filetarget);
 if (fileDiurutkan.exists()) fileDiurutkan.delete();
 new File(f1).renameTo(fileDiurutkan);
 }
 }

 private static void gabungSatuLangkah(int jumlahSegmen,
 int ukuranSegmen, String f1, String f2, String f3)
 throws Exception {
 DataInputStream f1Masukan = new DataInputStream(
 new BufferedInputStream(new FileInputStream(f1), UKURAN_BUFFER));
 DataOutputStream f2Output = new DataOutputStream(
 new BufferedOutputStream(new FileOutputStream(f2), UKURAN_BUFFER));

 // Copy half number of segments from f1.dat to f2.dat
 salinSetengahKeF2(jumlahSegmen, ukuranSegmen, f1Masukan, f2Output);
 f2Output.close();

 // Menggabungkan segmen-segmen sisa dalam f1 dengan segmen-segmen sisa dalam f2 ke f3
 DataInputStream f2Masukan = new DataInputStream(
 new BufferedInputStream(new FileInputStream(f2), UKURAN_BUFFER));
 DataOutputStream f3Keluaran = new DataOutputStream(
 new BufferedOutputStream(new FileOutputStream(f3), UKURAN_BUFFER));

 gabungSegmen(jumlahSegmen / 2,
 ukuranSegmen, f1Masukan, f2Masukan, f3Keluaran);

 f1Masukan.close();
 f2Masukan.close();
 f3Keluaran.close();
 }

 /** Menyalin setengah jumlah segmen pertama dari f1.dat ke f2.dat */
 private static void salinSetengahKeF2(int jumlahSegmen,
 int ukuranSegmen, DataInputStream f1, DataOutputStream f2)
 throws Exception {
 for (int i = 0; i < (jumlahSegmen / 2) * ukuranSegmen; i++) {
    f2.writeInt(f1.readInt());
  }

 }

 /** Menggabungkan semua segmen */
 private static void gabungSegmen(int jumlahSegmen,
 int ukuranSegmen, DataInputStream f1, DataInputStream f2,
 DataOutputStream f3) throws Exception {
 for (int i = 0; i < jumlahSegmen; i++) {
     gabungDuaSegmen(ukuranSegmen, f1, f2, f3);
  }

  // f1 bisa memiliki satu segmen ekstra, menyalin ke f3
  while (f1.available() > 0) {
    f3.writeInt(f1.readInt());
  }

 }

 /** Menggabungkan dua segmen */
 private static void gabungDuaSegmen(int ukuranSegmen,
 DataInputStream f1, DataInputStream f2,
 DataOutputStream f3) throws Exception {
 int intDariF1 = f1.readInt();
  int intDariF2 = f2.readInt();
  int f1Hitung = 1;
  int f2Hitung = 1;

  while (true) {
    if (intDariF1 < intDariF2) {
      f3.writeInt(intDariF1);
      if (f1.available() == 0 || f1Hitung++ >= ukuranSegmen) {
        f3.writeInt(intDariF2);
        break;
      }
      else {
        intDariF1 = f1.readInt();
      }
    }
    else {
      f3.writeInt(intDariF2);
      if (f2.available() == 0 || f2Hitung++ >= ukuranSegmen) {
        f3.writeInt(intDariF1);
        break;
      }
      else {
        intDariF2 = f2.readInt();
      }
    }
  }

  while (f1.available() > 0 && (f1Hitung++ < ukuranSegmen)) {
    f3.writeInt(f1.readInt());
  }

  while (f2.available() > 0 && (f2Hitung++ < ukuranSegmen)) {
    f3.writeInt(f2.readInt());
  }

 }

 /** Menampilkan 100 angka pertama di dalam file tertentu */
 public static void tampilFile(String namafile) {
 try {
 DataInputStream masukan =
 new DataInputStream(new FileInputStream(namafile));
 for (int i = 0; i < 100; i++)
 System.out.print(masukan.readInt() + " ");
 masukan.close();
 }
 catch (IOException ex) {
 ex.printStackTrace();
 }
 }
 }
