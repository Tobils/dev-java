public class Salary extends Employee
{
    private double salary;

    /**
     * konstruktor
     * @param name --> nama pegawai
     * @param address --> alamat pegawai
     * @param number --> alamat pegawai
     * @param salary --> gajih pegawai
     */
    public Salary(String name, String address, int number, double salary)
    {
        /**
         * konstruktor super class
         */
        super(name, address, number);
        this.salary = salary;
    }

    public void mailCheck() 
    {
        System.out.println("inside of mailcheck salary class");
        System.out.println("Mailing check to " + getName() + " with salary " + getSalary());    
    }

    public double getSalary() 
    {
        return salary;    
    }

    public void setSalary(double newSalary)
    {
        if(newSalary > 0.0)
        {
            salary = newSalary;
        }
    }

    public double computePay() 
    {
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
    
}