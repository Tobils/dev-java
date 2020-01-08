public class Metrik
{
    /**
     * mengkonversi mil ke kilometer
     * @param m adalah satuan mil
     * @return jarak dalam kilometer
     */
    public static double milKeKilometer(double m)
    {
        return m * 1.699;
    }

    /**
     * konnversi dari kilometer ke mil
     * @param k jarak dalam kilometer
     * @return jarak dalam mil
     */
    public static double kilometerKeMil(double k)
    {
        return k / 1.699;
    }
}