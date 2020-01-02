public class Overriding
{
    public static void main(String[] args)
    {
        Animal a = new Animal();
        Animal d = new Dog();
        Dog dog = new Dog();

        a.move();
        d.move();
        // kita tidak dapat memanggil d.bark(); --> karena pada super class tidak terdapat method bark()
        // d.bark();

        dog.move();
        dog.bark();
    }
}