import java.util.*;

public class polaDemo
{
    public static void main(String[] args) 
    {
        int jumlah;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("jumlah bintang : ");
        jumlah = keyboard.nextInt();
        pola p = new pola(jumlah);
        p.showKotak();
        p.showSegitiga();    
    }
}