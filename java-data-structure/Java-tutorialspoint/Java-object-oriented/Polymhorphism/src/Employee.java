public class Employee
{
    private String name;
    private String address;
    private int number;

    /**
     * konstruktor
     */
    public Employee(String name, String address, int number)
    {
        System.out.println("Construction the employee");   
        this.name = name;
        this.address = address;
        this.number = number;
    }

    /**
     * alamat slaary
     */
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + this.name + " address " + this.address);
    }

    /**
     * return string
     */
    public String toString()
    {
        return name + " " + address + " " + number;
    }

    /**
     * ambil nama
     */
    public String getName()
    {
        return name;
    }

    /**
     * ambil alamat
     */
    public String getAdress()
    {
        return address;
    }

    /**
     * setting alamat
     */
    public void setAddress(String newAddress)
    {
        address = newAddress;
    }

    /**
     * ambil number
     */
    public int getNumber()
    {
        return number;
    }
}