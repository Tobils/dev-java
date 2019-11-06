class Simple{
    public static void main(String args[]){
        System.out.print("Hello world in java\n");
    }
}

class ClassLoaderExample{
    public static void main(String[] args){
        Class c = ClassLoaderExample.class;
        System.out.println(c.getClassLoader());

        System.out.println(String.class.getClassLoader());
    }
}

// jika dideclarasikan menggunakan public class --> harus dalam file java yang berbeda sesuai nama class nya.
