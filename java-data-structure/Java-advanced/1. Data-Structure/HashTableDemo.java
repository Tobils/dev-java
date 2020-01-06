import java.util.*;

public class HashTableDemo
{
    public static void main(String[] args) {
        /**
         * create hashmap
         */
        Hashtable balance = new Hashtable();
        Enumeration names;

        String str;
        Double bal;

        balance.put("Zahra", 3434.34);
        balance.put("Mahnaz", 123.23);
        balance.put("Aayan", 137.86);
        balance.put("Daisy", 345.43);
        balance.put("Qadir", -99.90);

        /**
         * get enum of hash
         */
        names = balance.keys();
        while(names.hasMoreElements())
        {
            str = (String) names.nextElement();
            System.out.println(str + " : "+balance.get(str));
        }

        System.out.println();
        bal = ((Double) balance.get("Zahra")).doubleValue();
        balance.put("Zahra", bal +1000);
        System.out.println("new balance of zahra is " + balance.get("Zahra"));
    }
}