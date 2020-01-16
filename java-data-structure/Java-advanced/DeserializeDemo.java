import java.io.*;

public class DeserializeDemo
{
    public static void main(String[] args) 
    {
        Employee e = null;
        
        try
        {
            FileInputStream filein = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(filein);
            e = (Employee) in.readObject();
            in.close();
            filein.close();
        } catch (IOException i)
        {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c)
        {
            System.out.println("Class employee tidak ditemukan");
            c.printStackTrace();
            return;
        }

        System.out.println("Deseriliasisasi demo pada objek class employee");
        System.out.println("Nama \t : " + e.name);
        System.out.println("Alamat \t : " + e.address);
        System.out.println("SSN \t : " + e.SSN);
        System.out.println("Nomor \t : " + e.number);
    }
}