// package bab_1_kelas_dan_object;
import java.util.Scanner;
import java.util.Random;
import java.io.*;


public class DemoObject
{
    public static void main(String[] args) throws IOException
    {
        int banyakAcak;
        int angka;

        // menciptakan object Scanner untuk membaca masukan dari keyboard
        Scanner keyboard = new Scanner(System.in);

        // menciptakan object acak untuk mendapatkan nilai acak
        Random acak = new Random();

        // menciptakan object PrintWriter untuk menuliskan nilai acak pada sebuah file .txt
        PrintWriter fileKeluaran = new PrintWriter("angka.txt");

        System.out.print("Berapa banyak nilai acak yang harus dituliskan ?");
        banyakAcak = keyboard.nextInt(); // menyimpan nilai masukan dari user

        for (int cacah = 0; cacah < banyakAcak; cacah++)
        {
            // generate nilai acak
            angka = acak.nextInt();

            // menuliskan nilai acak ke dalam file
            fileKeluaran.println(angka);
        }

        // menutup berkas yang dituliskan oleh PrintWriter
        fileKeluaran.close();
        System.out.print("selesai");
    }
}
