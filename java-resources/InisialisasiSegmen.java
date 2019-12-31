 /** Mengurutkan file awal menjadi segmen-segmen terurut */
 private static int InisialisasiSegmen
 (int ukuranSegmen, String fileAsli, String f1)
 throws Exception {
 int[] list = new int[ukuranSegmen];
 DataInputStream masukan = new DataInputStream(
 new BufferedInputStream(new FileInputStream(fileAsli)));
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