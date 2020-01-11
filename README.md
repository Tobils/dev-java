# NGODING JAVA 
tag line : **Ngoding java mulai hari ini.**

<p align="center">
<img src="./img/java-features.png">
</p>

## 1. Installasi/Compile/Error
```txt
1. Installasi
    1. install jdk 11 LTE [make sure punya akun oracle, kalo belum ada silahkan buat]
    2. cek : 
        > java --version 
        > output : 
            11.0.5 2019-10-15 LTS
            Java(TM) SE Runtime Environment 18.9 (build 11.0.5+10-LTS)
            Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.5+10-LTS, mixed mode)
    
    3. install intellij IDEA

    atau dapat menggunakan extension pada VSCode

2. Cara Compile
    1. java nama_file.java
    --> atau
    2. javac DemoPersegiPanjang.java
    3. java DemoPersegiPanjang
    --> atau
    1. pada vscode jalankan Command + shift + D
    2. pilih run with java

3. Error 
    1. `Error: Could not find or load main class`
    2. solusi --> [link](https://stackoverflow.com/questions/18093928/what-does-could-not-find-or-load-main-class-mean)
    3. pastikan berada pada path yang benar
```

## 2. #100DaysOfCode
[#100DayOfCode](java-data-structure/readme.md)

## 3. Android
[Implementation of java to android](#)

## 4. Springboot
[next level of java with Springboot](java-springboot/readme.md)



## 4. Sumber belajar
- [tutorialspoint](https://www.tutorialspoint.com/java/)
- [Java referensi bagi Programmer](#)
- [w3school](#)


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
    - belum selesai

# Day 6 #100DaysOfCode 05-01-2020
- Bitset
    - konsep
        ```
        BitSet : class bitset menyimpan tipe spesial dari array yang menyimpan nilai-nilai bit. nilai bitset dapat di increase sesuai kebutuhan.
        hal ini mirip dengan bit-bit vector.

        kontruktor :
        1. BitSet()
        2. BitSet(int Size)
        
        method (total ada 26 method) :
        1. void and(BitSet bitSet)
        ...
        26. void xor(BitSet bitSet)
        ```

# Day 7 #100DaysOfCode 06-01-2020
- Vector
    - konsep
    ```
    Vector : mengimplementasikan dynamic array. mirip dengan arrayList namun memiliki 2 perbedaan :
        - vector bersifat syncronous
        - vector berisi banyak metode lama yang bukan bagian dari framework collection.
    ```
    - implementasi
    ```txt
    Implementasi dapat dicheck pada file VectorData.java
    ```
- Stack
    - konsep
        ```txt
        Stack merupakan subclass dari vector yang menerapkan standar last-in. first-out [FIFO]
        stack hanya didefinisikan menggunakan defult konstruktor, yang membuat stack kosong. 
        stack memiliki semua methode yang didefinisikan oleh vector, dan beberapa penambahan milik stack.

        stack ini mirip dengan tumpukaan, dapat dianalogikan sebagai tumpukan baju, baju terakhir yang ditumpuk merupakan baju pertama yg bisa diambil.
        ```
    - implementasi
        ```txt
        bash-3.2$ java StackDataDemo 
        stack : []
        push(0)
        Stack: [0]
        push(7)
        Stack: [0, 7]
        push(14)
        Stack: [0, 7, 14]
        push(21)
        Stack: [0, 7, 14, 21]
        push(28)
        Stack: [0, 7, 14, 21, 28]
        push(35)
        Stack: [0, 7, 14, 21, 28, 35]
        push(42)
        Stack: [0, 7, 14, 21, 28, 35, 42]
        push(49)
        Stack: [0, 7, 14, 21, 28, 35, 42, 49]
        push(56)
        Stack: [0, 7, 14, 21, 28, 35, 42, 49, 56]
        push(63)
        Stack: [0, 7, 14, 21, 28, 35, 42, 49, 56, 63]
        pop --> 63
        Stack: [0, 7, 14, 21, 28, 35, 42, 49, 56]
        pop --> 56
        Stack: [0, 7, 14, 21, 28, 35, 42, 49]
        pop --> 49
        Stack: [0, 7, 14, 21, 28, 35, 42]
        pop --> 42
        Stack: [0, 7, 14, 21, 28, 35]
        pop --> 35
        Stack: [0, 7, 14, 21, 28]
        pop --> 28
        Stack: [0, 7, 14, 21]
        pop --> 21
        Stack: [0, 7, 14]
        pop --> 14
        Stack: [0, 7]
        pop --> 7
        Stack: [0]
        pop --> 0
        Stack: []
        pop --> Stack is empty
        ```
- Dictionary - Map
    - konsep
        ```txt
        Maps merupakan antarmuka antara kata kunci dengan value. valua dapat diperoleh dengan menggunakan kata kunci.
        ```
    - implementasi
        ```txt
        Map element : {suhada=12, key=54}
        get value of Map[suhada] : 12
        key : [suhada, key]
        ```
- HashTable
    - konsep
        ```txt
        Hashtable merupakan bagian asli dari java.util dan merupakan implementasi konkret ari sebuah dictionary.
        seperti hal nya Hash/Map, Hashtable menyimpan key dengan value.
        ```
    - implementasi
        ```txt
        Qadir : -99.9
        Mahnaz : 123.23
        Daisy : 345.43
        Aayan : 137.86
        Zahra : 3434.34

        new balance of zahra is 4434.34
        ```
- Properties
    - konsep
        ```
            properties merupakan subclass dari hashtable, hanya saja value dari properties adalah string.
        ```
    - implementasi
        ```
        Implementasi properties dapat dilihat pada file PropertiesDemo.java.
        key dan value pada properties bernilai string. penambahan key dan value dilakukan menggunakan syntax : put
        
        Properties capitals = new Properties();
        capitals.put("Ade", "Bantul");
        capitals.put("Suhada", "Congcat");
        capitals.put("Frika", "Cileungsi");
        capitals.put("Atrika", "Kubang");

        keys dari properties diperoleh menggunakan kata kunci keySet() dan disimpan dalam tipe data set.

        output :
        the Capital of Ade is Bantul
        the Capital of Atrika is Kubang
        the Capital of Suhada is Congcat
        the Capital of Frika is Cileungsi
        ```

# Day 8 #100DaysOfCode 07-01-2020
- Collection
    - konsep
        ```
        1. framework collection di java memberikan akses kepada programmer untuk pre-package struktur data sebaik dengan algoritmanya untuk memanipulasi data.
        2. sebuah collection merupakan sebuah preferensi yang dapat menyimpan object lain. antarmuka colection mendeklasikan sebuah operasi yang dapat bekerja pada setiap tipe collection.
        3. class dan interface dari collection framework berada di package java.utl.*.
        ```

- SpringBoot Java Implementation
    - rest-service
        - konsep
            ```
            restfull : user mengakses endpoint yang berjalan sesui dengan method yang digunakan
            GET, POST, etc.
            ```
        - persiapan
            ```
            generate project menggunakan : shift + ⌘ [command] + P
            > Spring Inititalizr: Generate a maven project
            > ikuti petunjuk selanjutnya dari input yang diinginkan
            ```
        - membuat Greeting.java
        - membuat controller GrretingController.java
        - modify port dengan mengedit file application.properties --> server.port=9090
        - tambahkan extension SPRING-BOOT DASHBOARD
        - open : localhost:9090/greeting atau localhost:9090/greeting?name=Suhada
        - [link](https://spring.io/guides/gs/rest-service/)
        - build execution file : 
            ```
            grandle : ./grandle bootRun atau membuat menjadi file jar ./grandle build
            kemudian di running : java -jar build/libs/gs-rest-service-0.1.0.jar

            maven : ./mvnw spring-boot:run atau membuat jd file jar dengan ./mvnw clean package
            kemudian running : java -jar target/gs-rest-service-0.1.0.jar
            ```
        - implementasi : pada java-Springboot/suhada
        - Pembahsan
            ```
            return yang ditampilkan oleh browser saat memanggil endpoint adalah get dari class yang bersangkutan.
            saat memanggil endpoint "/" return dari browser adalah : {"id":23,"pesan":" Man Jadda wajada"}
            saat memanggil enspoint "/greeting" return yang dihasilkan adalah ; {"id":24,"content":"Hello,  world"} 
            ```


# Day 9 #100DaysOfCode 08-01-2020   
- Bab 2. Lanjut : Objek dan Kelas
    - konsep
        ```
        2.1 anggota kelas statis
            anggota kelas statis adalah milik dari kelas, bukan objek yang diinstasiasi dari kelas.
        ```
    - implementasi bidang statis : file Tercacahkan.java
    - pembahasan :
        ```
            meskipun yang memanggil getCacahObjek dari tch yang merupakan objeck pertama, nilai cacah akan 
            return banyaknya objek yang sudah diciptakan.
        ```
    - implementasi method statis : file Metrik.java dan MetrikDemo.java
    - pembahasan :
        ```
        metode statis sangat cocok untuk banyak pekerjaan karena dapat dipanggil langsung dari kelas saat diperlukan.
        metode statis digunakan untuk melukan operas-operasi data tanpa harus menyimpan data.

        satu-satunya kekurangan : tidak dapat digunakan pada anggota tak statis.

        ```

- Spring oauth2
    - flow diagram based on oracle
    <p align="center">
    <img src="./img/oauth_authorization_code.png">
    </p>

    - konsep
        ```
        ketika kita menggunakan OAuth2, maka kita seharusnya menggunakan 2 server, yaitu yang satu bertugas sebagai authorization server, dimana server ini yang akan memberikan hak akses kepada apilkasi pihak ketiga. 
        Sedangkan server yang satu nya lagi sebagai resource server atau sebagai penyedia API.
        artinya ada 2 endpoint yang disediakan.
        ```
        [Sumber](https://rizkimufrizal.github.io/belajar-oauth2/)
    - implementasi [blm mulai implementasi]



# Day 10 #100DaysOfCode 09-01-2020
- nilai kembalian objecl dari sebuah method
    - konsep
        ```
        membuat sebuah method yang memiliki nilai kembalian object.
        ```
    - implementasi
        ```
        implementasi dilakukan pada file objekDemo.java
        nilai kembalian dari method getTercacahkan adalah objek Tercacahkan. 
        sehingga ketika diulang 10 kali, akan ada 10 objek yang dibuat menggunakan method tsb.
        ```
- toString()
    - konsep
        ```
        kebanyakan program menggunakan method toString yang secara implisit dipanggil pada kondisi tertentu.
        umumnya, method ini digunakan untuk merepresentasikan status dari sebuah objek.
        pada dasarnya, kita tidak perlu seacar explisit memanggil method toString().
        ```
    - implementasi
        ```
        file Saham.java dengan implementasi sahamDemo.java
        secara otomatis ketika objek saham sudah diciptakan, maka saat kita println objek tsb, method toString() akan dipanggil.
        ```
- equals
    - konsep
        ```
        objek yang sama dapat dibandingkan dengan menggunakan equals.
        contoh objek1 dan objek2 adalah objek yang sama, dapat di cek menggunakan 
        if(objek1.equals(objek2))
        {
            // true
        }

        akan tetapi, objek1 dan objek2 akan sama jika dilakukan penyalinan dengan benar.
        objek1 = objek2 --> salah

        untuk mengatasi hal ini dapat dilakukan dengan membuat method untuk menyalin objek ataupun dengan konstruktor yang melewatkan objek.
        ```
    - implementasi
        ```
        implementasi dapat dilihat pada file Saham.java
        ```
- agregasi
    - konsep
    ```
    agregasi terjadi ketika sebuah objek kelas merupakan bidang dari kelas lain.

    terkadang kita perlu membuat objek dari objek-objek lain. analoginya sama seperti ita membuat rumah.
    saat membuat rumah kita memerlukan objek pintu, onjek jendela, onjek lantai dan yang lainnya sehingga membentuk objek rumah.
    ```
    - implementasi
    ```
    implementasi agregasi dengan membuat objek matakuliah yang terdiri dari objek bukuText dan objek pengajar.
    ```

# Day 11 #100DaysOfCode 10-01-2020
- melanjutkan agregasi
    - implementasi
        ```
        implementasi dilakukan dengan membuat diagram uml terlebih dahulu, untuk memudahkan visualisasi saat membuat code program.
        ```

        ```nomnoml
 
        [<abstract>MataKuliah|
        - namaMtKuliah:String
        - pengajar:Pengajar
        - bukuTeks:BukuTeks|
        + MataKuliah(nama:String, ajar:Pengajar, teks:BkuTeks):
        + getNama : String
        + getPengajar : Pengajar
        + getBukuTeks : BukuTeks
        + toString() : String
        ] 
        

        
        [<abstract>Pengajar|
        - namaBelakang:String
        - namaDepan:String
        - nomorNIP:String|
        + Pengajar(namaBlkg:String, namaDpn:String, nip:String):
        + Pengajar(objek2:Pengajar) :
        + set(namaBlkg:String, namaDpn:String, nip:String) : void
        + toString() : String
        ] 

       
        [<abstract>BukuTeks|
        - judul:String
        - pengarang:String
        - penerbit:String|
        + Bukuteks(jdl:String, peng:String, pen:String):
        + BukuTeks(objek2:BukuTeks) :
        + set(jdl:String, peng:String, pen:String) : void
        + toString() : String
        ]

        [<start>st]
        
        [MataKuliah] --> [st]
        [st] --> [Pengajar]
        [st] --> [BukuTeks]
        ```
       <p align="center">
        <img src="./img/uml-matakuliah.png">
        </p>

# Day 12 #100DaysOfCode 11-01-2020
- Implementasi Agregasi
    ```
    implementasi terhadap source code dilakukan berdasarkan diagram UML.
    berdasarkan diagram UML, tedapat 3 class file java yaitu :
    1. Pengajar
    2. BukuTeks
    3. MataKuliah
    4. MataKuliahDemo

    agrerasi dapat dilihat bahwa objek BukuTeks dan Objek Pengajar digunakn untuk membentuk objek MataKuliah.
    ```
[<< back](../readme.md)
