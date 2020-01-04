public class Inheritance 
{
    public static void main(String[] args)
    {
        /**
         * basic inheritance
         */
        System.out.println("Inheritance : basic");
        int x = 39;
        int y = 9;
        My_Calculation hitung = new My_Calculation();
        hitung.addition(x, y);
        hitung.substraction(x, y);
        hitung.multiplication(x, y);
        /**
         * end
         */
        System.out.println("--------------------");
        System.out.println();

        /**
         * super key word inheritance
         */
        System.out.println("Inheritance : super keyword at subclass");
        Sub_class sub = new Sub_class(1000);
        sub.my_method();
        System.out.println("--------------------");
        System.out.println();

        /**
         * IS-A Relationship
         */
        Animal a = new Animal();
        Mamalia m = new Mamalia();
        Reptil r = new Reptil();
        Dog d = new Dog();
        System.out.println("Inheritance : IS-A relationship");
        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Animal);
        System.out.println(r instanceof Animal);
        System.out.println("--------------------");
        System.out.println();       
    }
}