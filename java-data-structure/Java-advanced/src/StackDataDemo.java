import java.util.*;

public class StackDataDemo
{

    public static void main(String[] args) {
        /**
         * test stack
         */
        StackData demo_stack = new StackData();
        Stack st = new Stack();
        System.out.println("stack : " + st);

        /**
         * show push and show pop
         */
        for(int i=0; i<10; i++)
        {
            demo_stack.showpush(st, i*7);
        }

        demo_stack.search_element(st, 21);
        demo_stack.search_element(st, 10);

        demo_stack.getPeek(st);
        demo_stack.showData(st);

        for(int j=0; j<10; j++)
        {
            demo_stack.showpop(st);
        }

        try
        {
            demo_stack.showpop(st);
        } catch (EmptyStackException e)
        {
            System.out.println("Stack is empty");
        }

    }
}