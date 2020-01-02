# BAB 1. KELAS DAN OBJECT


# Day 1 #100DaysOfCode 31-12-19
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

* Akses kelas dari directory yang berbeda. 

[<< back](../readme.md)
