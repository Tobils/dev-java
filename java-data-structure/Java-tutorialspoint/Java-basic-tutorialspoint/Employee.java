import java.io.*;

public class Employee 
{
    private String name;
    private int age;
    private String designation;
    private double salary;

    /**
     * constructor
     * @param name merupakan nilai string yang akan disimpan pada variable nama
     */
    public Employee(String name)
    {
        this.name = name;
    }

    /**
     * set usia pegawai
     * @param empAge nilai yang digunakan untuk set usia pegawai yang disimpan pada variable age
     */
    public void empAge(int empAge)
    {
        age = empAge;
    }

    /**
     * set jabatan pegawai
     * @param empDesig digunakan untuk disimpan pada variable designation
     */
    public void empDesignation(String empDesig)
    {
        designation = empDesig;
    }

    /**
     * set gajih pegawai
     * @param empSalary digunakan untuk meyimpan value gajih pegawai
     */
    public void empSalary(double empSalary)
    {
        salary = empSalary;
    }

    /**
     * print the employee details
     */
    public void printEmployee()
    {
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Designation : " + designation);
        System.out.println("salary : " + salary);
    }
}