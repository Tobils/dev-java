/**
 * Menggunakan enumerasi Hari.java
 */
public class EnumerasiDemo
{
    public static void main(String[] args) 
    {
        Hari hariKerja = Hari.SENIN;

        /**
         * menampilkan hari SENIN
         */
        System.out.println(hariKerja);

        /**
         * menampilkan nilai ordinal
         */
         System.out.println("nilai ordinal untuk " + Hari.RABU + " adalah " + Hari.RABU.ordinal());        
    }

}