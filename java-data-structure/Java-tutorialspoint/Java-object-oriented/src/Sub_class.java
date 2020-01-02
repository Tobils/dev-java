public class Sub_class extends Super_class
{
    private int num = 10;

    public Sub_class()
    {
        num = 0;
    }

    public Sub_class(int val)
    {
        // memanggil konstruktor super class
        super(val);
    }

    public void display()
    {
        System.out.println("This is the display method of Sub class");
    }

    public void my_method()
    {
        Sub_class sub = new Sub_class();
        sub.display(); // method from subclass
        super.display(); // method from super class

        System.out.println("num of subclass : " + sub.num);
        System.out.println("num of super class : " + super.num);
    }
}
