/**
 * mendeklarasikan kelas statis.
 */

public class Tercacahkan
{
    /**
     * variable statis
     */
    private static int cacahObjek = 0;

    /**
     * konstruktor akan increment cacahObjek.
     */
    public Tercacahkan()
    {
        cacahObjek++;
    }

    public int getCacahObjek()
    {
        return cacahObjek;
    }
}