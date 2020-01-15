public class Box<T>
{
    private T t;
    public void add(T t)
    {
        this.t = t;
    }

    public T get()
    {
        return t;
    }

    public static void main(String[] args) 
    {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();
        
        integerBox.add(10);
        stringBox.add("man jadda wa jada");

        System.out.println("Integer valud : " + integerBox.get());
        System.out.println("String value : " + stringBox.get());
    }

}