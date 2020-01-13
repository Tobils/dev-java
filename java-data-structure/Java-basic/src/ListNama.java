import java.util.*;

public class ListNama
{
    private List<String> listName = new ArrayList<String>();
    private String nama;

    public ListNama(String nama)
    {
        this.nama = nama;
    }


    public List<String> getNama()
    {
        listName.add("ade");
        listName.add("suhada");
        listName.add("frika");
        listName.add("atrika");
        listName.add("fira");
        listName.add("aisyah");
        listName.add("asfa");
        listName.add("afsa");
        System.out.println(listName);
        return listName;
    }
}