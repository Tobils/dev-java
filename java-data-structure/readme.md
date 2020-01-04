# #100DaysOfCode
# Day 1 #100DaysOfCode 31-12-2019

hari ini mempelajari pemrograman meliputi :
```txt
tata cara penggunaan array, list dengan object yang terdiri dari multiple variable. Numbers pada java terdapat banyak API dimana kita bisa merubah dari satu tipe data ke tipe data lainnya. sebagai contoh kita bisa merubah dari tipe data integer ke tipe data byte, float, double dan long dan short. cara menggunakan regex atau regular expression untuk menyeleksi suatau variable string dengan parameter value tertentu. perulangan pada java terdiri dari 3 jenis yaitu for loop, while loop dan do-while loop, sedangkan untuk fileio kita bisa manipulasi input dan output data, membuat directory, membaca list file dan directory yang terdapat pada suatu directory, kita bisa membaca input keyboard.
```
## Object
```txt
object --> mempunyai tugas/fungsi/method 
object --> komponen software yang disimpan dalam memory yang memiliki tugas spesifik. ibject diciptakan oleh sebuah kelas yang memuat kode yang menjelaskan object tsb.
```

## Kelas
```txt
kelas --> dimana object berasal
kelas --> mendefinisikan object dengan tipe data tertentu
```

## Analogi
```txt
Sebuah mobil terdiri dari banayak komponen seperti ban, pedal rem, stir, mesin, spedometer dan yang lainnya, sehingga mobil disusun dari banyak komponen yang bekerja secara bersama-sama sesuai dengan fungsinya.
kita dapat menganalogikan bahwa komponen dari mobil tersebut sebagai method dari sebuah object dari sebuah class mobil yang mendefnisikan object-object tersebut.
```


## Variable Primitif versus Object
```txt
Variable primitif --> deklarasi suatu variabel dengan tipe data tertentu seperti : byte, short, int, long, char, float, double dan boolean
Object --> deklarasi object class

You can use these Format Specifiers for different data types
* %c or %C Display characters
* %d Displays a decimal (base 10 ) integer
* %e or %E Display a floating point number in exponential notation
* %f Display a floating point value in decimal format
* %s or %S Display Strings
* %b or %B Display boolean values
* %g (%G) float or double use %f or %e as required
* %o int unsigned octal value
* %p pointer address stored in pointer
* %s array of char sequence of characters or String
* %u int unsigned decimal
* %x (%X) int unsigned hex value
* %% Display a % sign

You can use whitespace characters which are
* space ( ' ' )
* tab ( '\t' )
* carriage return ( '\r' )
* newline ( '\n' )
* ormfeed ( '\f' )
``` 


# Day 2 #100DaysOfCode 01-01-2020
## Kontruktor
```txt
KONSEP : konstruktor secara otomatis akan dipanggil ketika sebuah object diciptakan.
dikatakan kontruktor karena konstruktor membantu menciptakan atau mengkonstrukri sebuah object.
dalam pemrograman java, ketika konstruktor tidak diinisialisai, maka java akan secara otomatis membuat sebuah konstruktor [konstruktor default].
konstruktor default memuat  semua nilai bidang numeris menjadi 0 dan memuat semua bidang boolean dalam kondisi false. 
```
bagaimana mendefinisikan konstruktor di java ?
* benar
    ```java
    public class name_class
    {
        public name_class(data_type1 name_var1, data_typen name_varn)
        {

        }
    }
    ```
* salah
    ```java
     public class name_class
    {
        public void name_class(data_type1 name_var1, data_typen name_varn)
        {
            
        }
    }
    ```
* resume
    ```txt
    saat membuat konstruktor kta tidak perlu menggunakan void cukup dengan public name_class. 
    nama konstruktor sama persis dengan nama kelas.
    ```

1. Implementasi Konstruktor 1 [TeleponSeluler.java]
    ```txt
    implementasi program dilakukan oleh UjiteleponSeluler.java, impelemntasi konstruktor dilakuakn saat membuat object telp dengan melewatkan 3 parameter pada class teleponSeluler.
    TeleponSeluler telp = new TeleponSeluler(ujiMan, ujiMod, ujiHarga);
    ```
2. Implementasi Konstruktor 2 [Dadu.java]
    ```txt
    Pada program dadu.java, sebuah kontrukto dadu menerima masukan berupa nilai jumlah_sisi yang akan digunakn untuk mendefinisikan jumlah sisi yang digunakan oleh dadu.
    ```
## Melewatkan Objek sebagai Argumen
   ```txt
    KONSEP : ketika sebuah object dilewatkan sebagai sebuah argumen pada sbeuah methode, akibatnya alamat object tsb dilewatkan kepada variable parameter dari methode tsb.
    sehingga paramater itu mereferensi object.
    Implementasi untuk melewatkan suatu object class sebagai sebuah parameter seuatu method dapat dilihat pada ArgumenDadu.java

    ketika kita melewatkan object sebagai parameter suatu method, hasilnya parameter akan mereferensi objek dan method yang bersangkutan dapat memiliki akses terhadap objek tersebut.
   ```

* Cho-Han
    ```txt
    cho-han merupakan permainan judi tradisional jepamg. dimana pemain akan menebak jumlah dari 2 dadu yang dilemparkan yang ditutup mangkok terbalik. cho (genap) han (ganjil).
    terdiri dari 2 class yaitu dealer dan pemain dan ChoHan.java untuk iplementasi.

    UML Dealer :
    - nilaiDadu1 : int
    - nilaiDadu2 : int
    + Dealer()
    + lemparDadu() : void
    + getChoAtauHan() : String
    + getNilaiDadu1 : int
    + getNilaiDadu2 : int


    UML Pemain :
    - nama : String
    - tebakan : String
    - point : int
    + Pemain(namaPemain:String)
    + buatTebakan() : void
    + tambahPoin(poinBaru : int) : void
    + getNama() : String
    + getTebakan() : String
    + getPoin() : int

    ChoHan :
    - BABAK_MAKS : final int 5
    - namaPemain1 : String
    - namaPemain2 : String
    + hasilBabak(Dealer dealer, Pemain pemain1, Pemain pemain2) : void
    + periksaTebakan(Pemain pemain, Dealer dealer) : void
    + tampilPemain(Pemain pemain1, Pemain pemain2) : void

    ```


# Day 3 #100DaysOfCode 02-01-2020
* Implementasi ChoHan 
   ```txt
    ChoHan :
    - BABAK_MAKS : final int 5
    - namaPemain1 : String
    - namaPemain2 : String
    + hasilBabak(Dealer dealer, Pemain pemain1, Pemain pemain2) : void
    + periksaTebakan(Pemain pemain, Dealer dealer) : void
    + tampilPemain(Pemain pemain1, Pemain pemain2) : void

    -Implementasi
    terdapat 4 class yang terlibat, yaitu :
    1. class Dadu
    2. class Dealer
    3. class Pemain
    4. class ChoHan

    - Class Dadu merupakan kunci dari permain ini. Nilai keluaran dari 2 buah object dadu digunakan oleh Dealer/bandar untuk permainan ini.
    - Class Dealer merupakan bandar yang menggunakan class Dadu sebagai alat permainannya.
    - Class Pemain menentukan tebakan apakah Cho (genap) ataukah Han (ganjil).
    - Class ChoHan merupakan main program yang mengimplementasikan class Dealer dan class Pemain.

    Catatan :
    - method/fungsi pada class ChoHan di definisikan di luar main program scope.
    - java API yang digunakan :
      1. Random -> java.util.Random --> untuk generate nilai random.
      2. Scanner -> java.util.Scanner --> untuk memperoleh input nama user dari keyboard.
   ```

* Pembebanan Metode dan Konstruktor.
    ```txt
    KONSEP : 
    Dua atau lebih metode di dalam suatu kelas dapat memiliki nama yang sama sepanjang daftar parameternya berbeda. ini juga berlaku untuk konstruktor.
    ```
    - contoh sebuah kelas mempunyai dua metode yang sama.
        ```java
        public int tambah(int nil1, int nil2)
        {
            int jum = nil1 + nil2;
            return jum;
        }
        ```
        ```java
        public String tambah(String str1, String str2)
        {
            String gabungan = str1 + str2;
            return gabungan;
        }
        ```
    - Implementasi
        ```txt
        UML Kelas AkunBank
        - saldo : double
        + AkunBank()
        + AkunBank(saldoAwal : double)
        + AkunBank(str : String)
        + tabung(jumlah : double) : void
        + tabung(str : String) : void
        + tarik(jumlah : double) : void
        + tarik(str : String) : void
        + setSaldo(b : double) : void
        + setSaldo(str : String) : void
        + getSaldo() : double
        ```

* Compile Java dan output ditempatkan di Directory yang berbeda.
    ```txt
    misalkan sususan directory :
    /java
      /class
      /src
        /main.java
    
    main.java dicompile dengan cara :
    > cd java/src
    > javac -d ../class main.java

    hasil dari class main.java disimpan pada directory class, sehingga susunan directorynya menjadi :
    /java
      /class
        /main.class
      /src
        /main.java
    ```

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
- Interface
    - konsep
        ```txt
        interface bersifat abtract sehingga kita tidak perlu menuliskan abstract pada interface.
        ```
    - implementasi
        ```txt
        Animal.java
        + Animal() : interface
        + eat() : void
        + travel() : void

        Mamalia.java
        + eat() : void
        + travel() : void
        + noOfLegs() : int

        IntarfaceDemo.java
        + main()
        ```
    - contoh
        ```java
        /* File name : NameOfInterface.java */
        import java.lang.*;
        // Any number of import statements

        public interface NameOfInterface 
        {
            // Any number of final, static fields
            // Any number of abstract method declarations\
        }
        ```
    - kesimpulan
        ```txt
        terdapat 2 fungsi dasar dari interface yaitu :
        1. create a common parent
        2. adds a data type to class
        ```
- Packages
    - konsep
        ```txt
        lebih baik menggunakan lowercase saat mendefinisikan packages.
        memudahkan dalam penempatan directory file java dan file .class hasil eksekusi program
        agar tertata dengan rapih.
        ```

    - cara compile :
        ```
        > javac -d . Animal.java
        > javac -d . Mamalia.java
        > javac -d . PackageDemo.java
        > java PackageDemo
        ```

# Day 5 #100DaysOfCode 04-01-2020
- Struktur Data - Java
    ```
    struktur data yang disediakan oleh utilitas java sangat bergguna dan memiliki cakupan yang sangat luas.
    data struktur ini terdiri dari interface dan class sebagai berikut :
    1. Enumeration
    2. BitSet
    3. Vector
    4. Stack
    5. Dictionary
    6. Hash Table
    7. Properies
    ```
- Enumeration
    - konsep
        ```
        antar muka enumerasi sebenarnya bukanlah data struktur, tapi sangat berguna bagi stuktur data.
        enumrasi mendefinisikan sebuah makna untuk mengambil elemen successive dari struktur data.

        sebagai contoh :
        enumerasi mendefinisikan sebuah method yang disebut dengan nextElement yang digunakan untuk mendapatkan
        element selanjutnya di dalam sebuah struktur data yang terdiri dari beragam element. 

        Enumeration interface mendefinisikan sebuah method dimana kita bisa meng enummerasi (mengambil satu pada suatu waktu) element pada kumpulan object. 
        ```
    - implementasi
        ```java
        import java.util.Vector;
        import java.util.Enumeration;

        public class Enum 
        {
            public void showData()
            {
                Enumeration days;
                Vector dayNames = new Vector();

                dayNames.add("Senin");
                dayNames.add("Selasa");
                dayNames.add("Rabu");
                dayNames.add("Kamis");
                dayNames.add("Jum'at");
                dayNames.add("Sabtu");
                dayNames.add("Minggu");

                days = dayNames.elements();

                while(days.hasMoreElements())
                {
                    System.out.println(days.nextElement());
                }
            }
        }
        ```
    - pembahasan :
        ```
        Enumeration memiliki 2 method utama yang dapat digunakan :
        - hasMoreElements() --> return true saat masih ada data yang bisa di esktrak, dan false saat data sudah di enumerasi semua.
        - nextElement() --> return the next object
        ```

- challenge
    - konsep
        ```
        given an array of integers and sn integer k. you need to find the total number of sub array whose sum equals to k.
        
        Time-O(n)
        Space-O(n)
        Input: arr = [3,7,2,1,20]
        k = 10
        ouput 2

        input arr = [0,0,0]
        k = 0
        output : 6

        UML
        Challenge()
        - data : int
        - k : int
        - total : int
        + getSum(data1 : int, data2 : int) : void
        + getTotal() : int
        + addTotal(newPoin : int) : void
        ```

[<< back](../readme.md)
