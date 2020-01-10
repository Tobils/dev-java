public class sahamDemo
{
    public static void main(String[] args) {
        Saham saham1 = new Saham("WIN", 1500.0);
        Saham saham2 = new Saham("PT. widya wicara", 1500.0);
        System.out.println(saham1);  
        saham1.compare(saham1, saham2);

        /**
         * menyalin objek menggunakan method \
         */
        Saham saham3 = saham1.salin();
        saham1.compare(saham1, saham3);

        /**
         * menyalin objek menggunakan konstruktor
         */
        Saham saham4 = new Saham(saham1);
        saham1.compare(saham1, saham4);
    }
}