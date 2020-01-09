import jdk.jfr.Timestamp;

public class objekDemo
{
    public static void main(String[] args) {
        System.out.println("Demo membuat objeck metrik dari sebuah method");
        Tercacahkan cacah;
        cacah = getTercacahkan();
        int i =0;
        while(i < (1000000000-1) )
        {
            cacah = getTercacahkan();
            i++;
        }
        System.out.println("jumlah objek : " + cacah.getCacahObjek() );
    }

    public static Tercacahkan getTercacahkan()
    {
        return new Tercacahkan();
    }
}