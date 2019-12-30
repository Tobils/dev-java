/**
 Kelas AkunBank mensimulasikan sebuah akun bank.
 */

public class AkunBank
{
   private double saldo; //Saldo akun

   /**
    Konstruktor ini menetapkan saldo awal 
    menjadi 0.0.
   */

   public AkunBank()
   {
      saldo = 0.0;
   }

   /**
    Konstruktor ini menetapkan saldo awal
    menjadi nilai yang dilewatkan sebagai argumen.
    @param saldoAwal Saldo awal.
   */

   public AkunBank(double saldoAwal)
   {
      saldo = saldoAwal;
   }

   /**
    Konstruktor ini menetapkan saldo awal
    menjadi nilai yang ada pada argumen String.
    @param str Saldo awal, sebagai sebuah String.
   */

   public AkunBank(String str)
   {
      saldo = Double.parseDouble(str);
   }

   /** 
    Metode tabung menambah sejumlah tertentu ke
    dalam akun.
    @param jumlah Jumlah yang akan ditambahkan pada
    bidang saldo.
   */ 

    public void tabung(double jumlah)
   {
      saldo += jumlah;
   }

   /**
    Metode tabung menambah sejumlah tertentu ke
    dalam akun.
    @param str Jumlah yang akan ditambahkan pada
    bidang saldo, sebagai sebuah String.
   */
  
   public void tabung(String str)
   {
      saldo += Double.parseDouble(str);
   }

   /** 
    Metode tarik menarik sejumlah uang
    dari akun.
    @param jumlah Jumlah yang akan dikurangi dari
    bidang saldo.
   */
       
   public void tarik(double jumlah)
   {
      saldo -= jumlah;
   }

   /**
    Metode tarik menarik sejumlah uang
    dari akun.
    @param str Jumlah yang akan dikurangi dari
    bidang saldo, sebagai sebuah String.
   */

   public void tarik(String str)
   {
      saldo -= Double.parseDouble(str);
   }

   /**
    Metode setSaldo method menetapkan saldo akun.
    @param b Nilai yang akan disimpan dalam bidang saldo.
   */

   public void setSaldo(double b)
   {
      saldo = b;    
   }

   /**
    Metode setSaldo menetapkan saldo akun.
    @param str Nilai, sebagai sebuah String, untuk menetapkan
    bidang saldo.
   */

   public void setSaldo(String str)
   {
      saldo = Double.parseDouble(str);
   }

   /**
    Metode getSaldo menghasilkan
    saldo akun.
    @return Nilai dalam bidang saldo.
   */

   public double getSaldo()
   {
      return saldo;
   }
}