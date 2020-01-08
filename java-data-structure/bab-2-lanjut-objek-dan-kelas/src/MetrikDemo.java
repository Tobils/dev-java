import javax.swing.*;

public class MetrikDemo
{
    public static void main(String[] args) {
        String masukan;
        double mil;
        double kilo;

        /**
         * membaca jarak dalam mil
         */
        masukan = JOptionPane.showInputDialog("Masukan jarak dalam mil : ");
        mil = Double.parseDouble(masukan);

        /**
         * konversi dari mil menjadi kilo
         */
        kilo = Metrik.milKeKilometer(mil);
        JOptionPane.showMessageDialog(null,String.format("%,.2f mil sama dengan %,.2f kilomketer", mil, kilo));
        /**
         * membaca masukan dalam kilo
         */
        masukan = JOptionPane.showInputDialog("Masukan jarak dalam kilometer : ");
        kilo = Double.parseDouble(masukan);
        /**
         * konversi dari kilo ke mil
         */
        mil = Metrik.kilometerKeMil(kilo);
        JOptionPane.showInternalMessageDialog(null,String.format("%,.2f kilometer sama dengan %,.2f mil", kilo, mil));
    }
}