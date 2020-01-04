public class AkunBank
{
    private Double saldo;
    /**
     * konstruktor terbebani --> banyak konstruktor dengan berbagai parameter berbeda
     */
    public AkunBank()
    {
        saldo = 0.0;
    }

    public AkunBank(Double saldoAwal)
    {
        saldo = saldoAwal;
    }

    public AkunBank(String str)
    {
        saldo = Double.parseDouble(str);
    }

    public void tabung(Double jumlah)
    {
        saldo += jumlah;
    }

    public void tabung(String str)
    {
        saldo += Double.parseDouble(str);
    }

    public void tarik(Double jumlah)
    {
        saldo -= jumlah;
        if(saldo < 0)
        {
            setSaldo(0.0);
        }
    }

    public void tarik(String str)
    {
        if(saldo > Double.parseDouble(str))
        {
            saldo -= Double.parseDouble(str);
        }else
        {
            System.out.println("Saldo tidak cukup !");
        }
    }

    public void setSaldo(Double b)
    {
        saldo = b;
    }

    public void setSaldo(String str)
    {
        saldo = Double.parseDouble(str);
    }

    public Double getSaldo()
    {
        return saldo;
    }
}