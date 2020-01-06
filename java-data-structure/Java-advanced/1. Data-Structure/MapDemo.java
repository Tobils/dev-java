import java.util.*;

public class MapDemo
{
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("suhada", 12);
        m1.put("key", 54);

        System.out.println("Map element : " + m1);
        System.out.println("get value of Map[suhada] : " + m1.get("suhada"));
        Set data = m1.keySet();
        System.out.println("key : " + data);
    }
}