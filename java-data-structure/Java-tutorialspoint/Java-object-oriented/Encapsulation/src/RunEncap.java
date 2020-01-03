import java.util.Scanner;

public class RunEncap
{
    public static void main(String[] args)
    {

        EncapTest test_encap = new EncapTest();

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukan nama saudara : ");
        test_encap.setName(keyboard.nextLine());

        System.out.print("Usia : ");
        test_encap.setAge(keyboard.nextInt());

        System.out.print("Id Number : ");
        test_encap.setIdNum(keyboard.nextInt());

        System.out.println();
        System.out.println("terimakasih saudara " + test_encap.getName() + " telah melakukan pengisian data");
        System.out.println("data anda sebagai berikut :");
        System.out.println("nama    : " + test_encap.getName());
        System.out.println("usia    : " + test_encap.getAge());
        System.out.println("no id   : " + test_encap.getIdNum());
    }
}