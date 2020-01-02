public class Super_class
{
    int num;

    public Super_class()
    {
        num = 0;
    }

    public Super_class(int val)
    {
        num = val;
    }

    public void getNum()
    {
        System.out.println("num adalah " + num);
    }

    public void display()
    {
        System.out.println("This is the display method of Super class");
    }
}