package maven_basic.src;

import org.joda.time.DateTime;

public class demoJodaTime
{
    public static void main(String[] args) {
        DateTime sekarang = new DateTime();
        DateTime tigaBulanLagi = sekarang.plusMonths(3);
        System.out.println("tiga bulan dari sekarang adalah : " + tigaBulanLagi);
    }
}