public class Salary extends Employee
{
    private double salary;
    public Salary(String name, String address, int number, double salary)
    {
        /**
         * meneruskan ke konstruktor parrents
         */
        super(name, address, number);
        this.salary = salary;
    }

    /**
     * menjadi override
     */
    @Override
    public void mailCheck()
    {
        System.out.println("within mailcheck of salary class");
        System.out.println("Mailing a check to " + getName() + " with salary " + salary );
    }



}