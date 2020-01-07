import java.util.*;

public class PropertiesDemo
{
    public static void main(String[] args) {
        Properties capitals = new Properties();
        Set nama;
        String str;

        /**
         * nama <--> alamat
         */
        capitals.put("Ade", "Bantul");
        capitals.put("Suhada", "Congcat");
        capitals.put("Frika", "Cileungsi");
        capitals.put("Atrika", "Kubang");

        nama = capitals.keySet(); // get set-key of views
        Iterator itr = nama.iterator();

        while(itr.hasNext())
        {
            str = (String) itr.next();
            System.out.println("the Capital of " + str + " is " + capitals.getProperty(str) );
        }

        System.out.println();
    }
}