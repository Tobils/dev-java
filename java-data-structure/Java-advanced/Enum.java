import java.util.Vector;
import java.util.Enumeration;

public class Enum 
{
    public void showData()
    {
        Enumeration days;
        Vector dayNames = new Vector();

        dayNames.add("Senin");
        dayNames.add("Selasa");
        dayNames.add("Rabu");
        dayNames.add("Kamis");
        dayNames.add("Jum'at");
        dayNames.add("Sabtu");
        dayNames.add("Minggu");

        days = dayNames.elements();

        while(days.hasMoreElements())
        {
            System.out.println(days.nextElement());
        }
    }
}