/**
 Program ini menciptakan sebuah objek NamaLengkap, dan kemudian
 memanggil metode getPanjang dari objek sebelum nilai-nilai
 ditetapkan untuk bidang-bidang referensinya. Hasilnya,
 program ini akan berhenti secara abnormal.
*/

public class PengujiNama
{
   public static void main(String[] args)
   {
      int pjg; // Untuk memuat panjang nama

      // Menciptakan sebuah objek NamaLengkap
      NamaLengkap nama = new NamaLengkap();

      // Mendapatkan panjang dari nama lengkap
      pjg = nama.getPanjang();
   }
}