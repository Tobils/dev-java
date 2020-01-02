public class Overriding
{
    public static void main(String[] args)
    {
        Animal a = new Animal();
        Animal d = new Dog();

        a.move();
        d.move();
    }
}