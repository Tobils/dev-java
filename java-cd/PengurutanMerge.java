 public class PengurutanMerge {
 /** Metode untuk mengurutkan angka */
 public static void pengurutanMerge(int[] list) {
 if (list.length > 1) {
 // Pengurutan Merge untuk setengah bagian pertama
 int[] setengahPertama = new int[list.length / 2];
 System.arraycopy(list, 0, setengahPertama, 0, list.length / 2);
 pengurutanMerge(setengahPertama);

// Pengurutan Merge untuk setengah bagian kedua
 int panjangSetengahKedua = list.length - list.length / 2;
 int[] setengahKedua = new int[panjangSetengahKedua];
 System.arraycopy(list, list.length / 2,
 setengahKedua, 0, panjangSetengahKedua);
 pengurutanMerge(setengahKedua);

 // Menggabungkan setengahPertama dengan setengahKedua
 int[] temp = gabung(setengahPertama, setengahKedua);
 System.arraycopy(temp, 0, list, 0, temp.length);
 }
 }

 /** Menggabungkan dua list terurut */
 private static int[] gabung(int[] list1, int[] list2) {
 int[] temp = new int[list1.length + list2.length];

 int sekarang1 = 0; // Indeks sekarang dalam list1
 int sekarang2 = 0; // Indeks sekarang dalam list2
 int sekarang3 = 0; // Indeks sekarang dalam temp

 while (sekarang1 < list1.length && sekarang2 < list2.length) {
 if (list1[sekarang1] < list2[sekarang2])
 temp[sekarang3++] = list1[sekarang1++];
 else
 temp[sekarang3++] = list2[sekarang2++];
 }

 while (sekarang1 < list1.length)
 temp[sekarang3++] = list1[sekarang1++];

 while (sekarang2 < list2.length)
 temp[sekarang3++] = list2[sekarang2++]; 

 return temp;
 }

 /** Metode untuk menguji */
 public static void main(String[] args) {
 int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
 pengurutanMerge(list);
 for (int i = 0; i < list.length; i++)
 System.out.print(list[i] + " ");
 }
 }