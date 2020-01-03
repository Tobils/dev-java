# Belajar Java dari web tutorialspoint

# Day 1 #100DaysOfCode 31-12-2019

hari ini mempelajari pemrograman meliputi :
```txt
tata cara penggunaan array, list dengan object yang terdiri dari multiple variable. Numbers pada java terdapat banyak API dimana kita bisa merubah dari satu tipe data ke tipe data lainnya. sebagai contoh kita bisa merubah dari tipe data integer ke tipe data byte, float, double dan long dan short. cara menggunakan regex atau regular expression untuk menyeleksi suatau variable string dengan parameter value tertentu. perulangan pada java terdiri dari 3 jenis yaitu for loop, while loop dan do-while loop, sedangkan untuk fileio kita bisa manipulasi input dan output data, membuat directory, membaca list file dan directory yang terdapat pada suatu directory, kita bisa membaca input keyboard.
```

# Day 3 #100DaysOfCode 02-01-2020
* Inherritance
    - konsep 
        ```txt
        Inheritance atau warisan/pewarisan
        Inheritance dapat didefinisikan sebagai proses dimana suatu kelas dapat memperoleh property [metode dan bidang] dari pewarisnya atau parent class nya.
        dengan menggunakan Inheritance kita dapat mengelola informasi secara hirarki.
        ```
    - syntax
        ```java
        class Super
        {
            .....
            .....
        }
        class Sub extends Super
        {
            .....
            .....
        }
        ```
    - implementasi basic
        - super class
            ```java
            // file Calculation.java
            public class Calculation
            {
                int z;
                public void addition(int x, int y)
                {
                    z = x+y;
                    System.out.println("Hasil penjumlahan " + x +" dan " + y + " adalah " + z);
                }
                public void substraction(int x, int y)
                {
                    z = x - y;
                    System.out.println("Hasil pengurangan " + x + " dengan " + y + " adalah " + z);
                }
            }
            ```
        - sub class
            ```java
            // file My_Calculation.java
            public class My_Calculation extends Calculation
            {
                public void multiplication(int x, int y)
                {
                    z = x * y;
                    System.out.println("hasil perkaliam antara " + x + " dengan " + y + " adalah " + z);
                }
            }
            ```
        - main class
            ```java
            // file Inheritance.java
            public class Inheritance 
            {
                public static void main(String[] args)
                {
                    int x = 39;
                    int y = 9;
                    My_Calculation hitung = new My_Calculation();
                    hitung.addition(x, y);
                    hitung.substraction(x, y);
                    hitung.multiplication(x, y);
                }
            }
            ```
        - compile
            ```txt
            > javac -d ../class Inheritance.java
            > cd ../class
            > java Inheritance
            ```
        - output
            ```txt
            Hasil penjumlahan 39 dan 9 adalah 48
            Hasil pengurangan 39 dengan 9 adalah 30
            hasil perkaliam antara 39 dengan 9 adalah 351
            ```
        - kesimpulan
            ```txt
            Inheritance atau Pewarisan adalah layaknya orang tua mewariskan ke anaknya.
            class My_Calculation merupakan Inheritance dari class parent Calculation.
            sehingga class My_Calculation memiliki akses untuk method dan variable di class Parent.
            saat implementasi, walaupun class My_Calculation hanya memiliki method multiplication, 
            tetapi kita dapat mengakses class addition dan substraction yang merupakan method parent My_Calculation
            yaitu class Calculation.
            ```
    - Implementasi super keyword
        - konsep
            ```txt
            - kata kunci super sama hal nya dengan kata kunci this. 
            - digunakan untuk membedakan member/method dari super class dan sub class
            - digunakan untuk memanggil konstruktor super class dari subclass
            - digunakan di subclass inheritance
            ```
        - super class
            ```java
            // file Super_class.java
            public class Super_class
            {
                int num = 20;

                public void display()
                {
                    System.out.println("This is the display method of Super class");
                }
            }
            ```
        - sub class
            ```java
            // file Sub_class.java
            public class Sub_class extends Super_class
            {
                int num = 10;

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
            ```
        - kesimpulan
            ```txt
            super digunakan untuk membedakan antara method super class dan subclass yang memiliki nama yang sama.
            dapat digunakan untuk memanggil konstruktor superclass
            apabila menggunakan super untuk memanggil konstruktor super class, maka konstruktor sub class akan terpengaruhi oleh konstruktor super class.
            perhatikan konstruktor pada contoh untuk super class dan sub class.
            ```
    - catatan
        1. single inheritance
            ```java
            // B -> A
            public class A
            {
                ....
            }
            public class B extends A 
            {
                .....
            }
            ```
        2. multi level inheritance
            ```java
            // C -> B -> A
            public class A
            {
                .....
            }
            public class B extends A
            {
                .....
            }
            public class C extends B
            {
                .....
            }
            ```
        3. hieararchical inheritance
            ```java
            // B -> A
            // C -> A
            public class A
            {
                .....
            }
            public class B extends A
            {
                ......
            }
            public class C extends A
            ```
        4. java not support multiple inheritance

* Overriding
    - konsep
        ```txt
        keuntungan overriding : subsclass dapat mengimplementasikan method-method pada super class.
        ```
    - Implemantasi
        ```txt
            pada class overiding.java, meskipun object d dalam tipe animal dan class dog. tapi class d dapat mengakses method move pada class Dog.
            selama nama method sublass sama dengan nama method pada super class.
        ```

* Polymhorphism
    - konsep
        ```txt
        polymhorphism : kemampuan sebuah objek menjadi berbagai bentuk. polymhorphism banyak digunakan pada OOP saat referensi class parent
        digunakan untuk mereferensi ke object sub class.
        ```
    - contoh
        ```java
        public interface Vegetarian();
        public class Animal();
        public class Deer extends Animal implements Vegetarian();

        Deer d = new Deer(); // deer
        Animal a = d; // animal
        Vegetarian v = d; // vegetarian
        Object o = d; // object
        ```
    - implementasi
        ```txt
        class Deer dapat dikatan sebagai polymhorphism karena memiliki banyak bentuk, diantaranya :
        - Deer IS-A Animal
        - Deer IS-A Vegetarian
        - Deer IS-A Deer
        - Deer IS-A Object
        ```
    - Contoh lebih lanjut.
        ```txt
        Kelas Employee
        - name : String
        - address : String
        - number : int
        + Employee (name : String, address : String, number : int)
        + mailCheck() : void
        + toString() : String
        + getName() : String
        + getAddress() : String
        + setAddress(address : String) : void
        + getNumber() : int

        Kelas Salary
        - salary : double
        + Salary(name : String, address : String, number : int, salary : double)
        + mailCheck() : void
        + getSalary() : double
        + setSalary(newsalary : double) 
        + computePay() : double
        ```
# Day 4 #100DaysOfCode 03-01-2020
- melanjutkan Polymhorphism dan kelas Employee
    ```txt
    sesuai dengan kaidah makna dari Polymhorphism yaitu method pada suatu class dapat memiliki banyak bentuk. 
    VirtualDemo.java merupakan contoh Polymhorphism dimana kita dapat merubah substansi dari method mailCheck() 
    sub class tanpa harus merubah method di parent class.
    ```
- Abstraction
    - konsep
        ```txt
        As per dictionary, abstraction is the quality of dealing with ideas rather than events. 
        For example, when you consider the case of e-mail, complex details such as what happens as soon as you send an e-mail, 
        the protocol your e-mail server uses are hidden from the user. 
        Therefore, to send an e-mail you just need to type the content, mention the address of the receiver, and click send.
        ```
    - syntax
        ```java
        public abstract class Employee
        {
            .....
        }
        ```
    - Implementasi
        ```txt
        kelas Employee
        - name : String
        - address : String
        - number : int
        + Employee(name : String, address : String, number : int) 
        + computePay() : double
        + mailCheck() : void
        + toString() : String
        + getName()  : String
        + getAddress() : String
        + setAddress(newAddress : String) : void
        + getNumber() : int

        kelas Salary
        - salary : double
        + Salary(name : String, address : String, number : int, salary : double)
        + mailCheck() : void
        + getSalary() : double
        + setSalary(double newSalary) : void
        + computePay() : double 
        ```
    - compile
        - AbstractDemo.java
            ```java
            public class AbstractDemo
            {
                public static void main(String[] args) 
                {
                    Employee e = new Employee("tobil", "jogja", 123);
                    e.mailCheck();    
                }
            }
            ```
        - error
            ```java
            AbstractDemo.java:5: error: Employee is abstract; cannot be instantiated
            Employee e = new Employee("tobil", "jogja", 123);
                        ^
            1 error
            ```
        -  karena
            ```txt
            untuk meng-implementasikan abstract class kita harus melakukan dengan cara yang concrete.
            ```
        - solusi --> AbstractDemo.java
            ```java
            public class AbstractDemo
            {
                public static void main(String[] args) 
                {
                    Salary gajih_suhada  = new Salary("suhada", "cileungsi", 321, 15000.0);
                    Employee pegawai_ade = new Salary("ade", "jogja", 123, 5000.0);

                    System.out.println("call mailcheck using salary reference --");
                    gajih_suhada.mailCheck();
                    System.out.println("\ncall mailcheck using employee reference --");
                    pegawai_ade.mailCheck();
                }
            }
            ```
        - output
            ```txt
            call mailcheck using salary reference --
            inside of mailcheck salary class
            Mailing check to suhada with salary 15000.0

            call mailcheck using employee reference --
            inside of mailcheck salary class
            Mailing check to ade with salary 5000.0
            ```
- encapsulation
    - konsep
        ```txt
        enkapsulasi merupakan fundamental ke-4 dari OOP. 3 lainnya adalah inheritance (pewarisan), polymhorphism (banyak bentuk) dan abstraction (makna).
        enkapsulasi menutupi akses variable pada suatu kelas yang hanya dapat diakses oleh method di dalam kelas yang bersangkutan.
        ```
    - implementasi
        ```txt
        kelas EncapTest
        - name : String
        - idNum : String
        - age : int
        + setName(String newName) : void
        + setIdNum(int newIdNum) : void
        + setAge(int newAge) : void
        + getName() : String
        + getIdNum() : int
        + getAge() : int
        ```




[<< back](../readme.md)
