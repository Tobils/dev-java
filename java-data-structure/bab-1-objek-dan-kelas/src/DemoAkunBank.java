import java.util.Scanner;
import java.io.IOException;

public class DemoAkunBank
{
    public static void main(String[] args)
    {
        Double gajih;
        Double tabung;
        Double tarik;
        String str_gajih;
        String str_tabung;
        String str_tarik;


        Scanner keyboard = new Scanner(System.in);
        AkunBank saldoAkun1 = new AkunBank();
        AkunBank saldoAkun2 = new AkunBank(100.00);
        AkunBank saldoAkun3 = new AkunBank("1000.00");

        /**
         * cek saldo setiap akun
         */
        System.out.println(saldoAkun1.getSaldo());
        System.out.println(saldoAkun2.getSaldo());
        System.out.println(saldoAkun3.getSaldo());

        /**
         * set saldo
         */
        System.out.print("Masukan Gajih bulan ini : ");
        gajih = keyboard.nextDouble();
        saldoAkun1.setSaldo(gajih);

        /**
         * nabung
         */
        System.out.print("Masukan nilai tabungan : ");
        tabung = keyboard.nextDouble();
        str_tabung = Double.toString(tabung);
        saldoAkun1.tabung(str_tabung);
        System.out.println("jumlah saldo " + saldoAkun1.getSaldo());


        /**
         * tarik tunai
         */
        System.out.print("Masukan jumlah yang ingin diambil : ");
        tarik = keyboard.nextDouble();
        str_tarik = Double.toString(tarik);
        saldoAkun1.tarik(str_tarik);
        /**
         * menampilkan saldo terakhir
         */
        System.out.println("Jumlah saldo tersisa sebesar " + saldoAkun1.getSaldo());

        
    }
}