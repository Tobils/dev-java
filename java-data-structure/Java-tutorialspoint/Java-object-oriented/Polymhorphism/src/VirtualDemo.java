public class VirtualDemo
{
    public static void main(String[] args)
    {
        Employee pegawai = new Salary("class-pegawai", "address", 24, 1000.0);
        Salary e = new Salary("class-gajih", "e", 01, 2010);
        
        System.out.println();
        System.out.println("memanggil method mailCheck() dari class Employee");
        pegawai.mailCheck();

        System.out.println();
        System.out.println("memanggil method mailCheck() dari class Salary");
        e.mailCheck();
        System.out.println();
    }
}