import java.util.*;

public class StackData
{
    public void showpush(Stack st, int a)
    {
        st.push(a);
        System.out.println("push("+a+")");
        System.out.println("Stack: " + st);
    }

    public void showpop(Stack st)
    {
        System.out.print("pop --> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("Stack: " + st);
    }


}