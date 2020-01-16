import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo
{
    public static void main(String[] args) 
    {
        Employee e = new Employee();
        e.name = "Ade Suhada";
        e.address = "Bogor, Jawa Barat";    
        e.SSN = 063063456;
        e.number = 1;

        try
        {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("data serialisasi disimpan pada employee.ser");     
        } catch (IOException i)
        {
            i.printStackTrace();
        }
    }
}