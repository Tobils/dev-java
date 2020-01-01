import javax.swing.JOptionPane;

/**
 * kelas ini menciptakan tiga object dari kelas persegipanjang
 */

public class LuasRuangan
{
    public static void main(String[] args)
    {
        double angka;
        double totalLuas;
        String masukan;

        // menciptakan tiga object PersgiPanjang
        PersegiPanjang dapur = new PersegiPanjang();
        PersegiPanjang kamarTidur = new PersegiPanjang();
        PersegiPanjang kamarMandi = new PersegiPanjang();

        // membaca dan menyimpan dimensi-dimensi dapur
        masukan = JOptionPane.showInputDialog("Berapa panjang dapur ?");
        angka = Double.parseDouble(masukan);
        dapur.setPanjang(angka);

        masukan = JOptionPane.showInputDialog("Berapa lebar dapur ?");
        angka = Double.parseDouble(masukan);
        dapur.setLebar(angka);


        // membaca dan menyimpan dimensi-dimensi kamar tidur
        masukan = JOptionPane.showInputDialog("Berapa panjang kamar tidur ?");
        angka = Double.parseDouble(masukan);
        kamarTidur.setPanjang(angka);

        masukan = JOptionPane.showInputDialog("Berapa lebar kamar tidur ?");
        angka = Double.parseDouble(masukan);
        kamarTidur.setLebar(angka);

        // membaca dan menyimpan dimenasi-dimensi kamar mandi
        masukan = JOptionPane.showInputDialog("Berapa panjang kamar tidur ?");
        angka = Double.parseDouble(masukan);
        kamarMandi.setPanjang(angka);

        masukan = JOptionPane.showInputDialog("berapa lebar kamar mandi ?");
        angka = Double.parseDouble(masukan);
        kamarMandi.setLebar(angka);

        // menghitung total luas ruangan
        totalLuas = dapur.getLuas() + kamarTidur.getLuas() + kamarMandi.getLuas();

        // menampilkan total luas dari semua ruangan
        JOptionPane.showMessageDialog(null, "Luas total dari semua ruangan adalah " + totalLuas);

        System.exit(0);
    }
}