public class AbstractDemo
{
    public static void main(String[] args) 
    {
        Salary gajih_suhada  = new Salary("suhada", "cileungsi", 321, 15000.0);
        Employee pegawai_ade = new Salary("ade", "jogja", 123, 5000.0);

        System.out.println("call mailcheck using salary reference --");
        gajih_suhada.mailCheck();
        System.out.println("\ncall mailcheck using employee reference --");
        pegawai_ade.mailCheck();
    }
}