import java.util.*;

public class DemoList
{
    public static void main(String[] args) 
    {
        ListNama namaList = new ListNama("suhada");
        List<String> dataNama =  namaList.getNama();  
        System.out.println(dataNama);
    }
}