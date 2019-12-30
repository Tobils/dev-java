 public class PengurutanBubble {
 /** Metode pengurutan bubble */
 public static void pengurutanBubble(int[] list) {
 boolean butuhPelewatanBerikutnya = true;

 for (int k = 1; k < list.length && butuhPelewatanBerikutnya; k++) {
 // Array bisa jadi telah terurut dan pelewatan berikutnya tidak dibutuhkan
 butuhPelewatanBerikutnya = false;
 for (int i = 0; i < list.length - k; i++) {
 if (list[i] > list[i + 1]) {
 // Tukar list[i] dengan list[i + 1]
 int temp = list[i];
 list[i] = list[i + 1];
 list[i + 1] = temp;

 butuhPelewatanBerikutnya = true; // Pelewatan berikutnya dibutuhkan
 }
 }
 }
 }

 /** Metode untuk menguji */
 public static void main(String[] args) {
 int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
 pengurutanBubble(list);
 for (int i = 0; i < list.length; i++)
 System.out.print(list[i] + " ");
 }
 }
