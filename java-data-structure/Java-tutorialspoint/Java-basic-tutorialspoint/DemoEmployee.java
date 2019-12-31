import java.io.*;

public class DemoEmployee
{
    public static void main(String[] args)
    {
        /**
         * create 2 object of employee
         */

         Employee empOne = new Employee("ade suhada");
         Employee empTwo = new Employee("frika atrika");

         /**
          * invoking methods for each object created
          */
        empOne.empAge(25);
        empOne.empDesignation("Senior software engineer");
        empOne.empSalary(15000);
        empOne.printEmployee();


        empTwo.empAge(25);
        empTwo.empDesignation("QA");
        empTwo.empSalary(10000);
        empTwo.printEmployee();
    }
}
