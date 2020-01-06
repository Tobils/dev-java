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

    public void search_element(Stack st, int val)
    {
        System.out.println("search : " + val);
        int hasil_pencarian = st.search(val);
        if(hasil_pencarian != -1)
        {
            System.out.println("yeay ketemu data nya : " + hasil_pencarian);
        }else
        {
            System.out.println("data yang kamu cari tidak ada");
        }
    }

    public void getPeek(Stack st)
    {
        System.out.println("tampilkan data teratas : " + st.peek());
    }

    public void showData(Stack st)
    {
        Enumeration e = st.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
    

}