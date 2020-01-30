# Spring - Different ways of injecting dependencies

DI atau Dependency injection, ada beberapa cara untuk injeksi ke dalam DI ini.
1. Constructor-based : harus digunakan untuk dependencies mandatory. --> implementasi : `ConstBasedDI.java`
2. Setter-based : harus digunakan untuk dependencis pilihan. --> implementasi : `SetterBasedDI.java`
3. Field-based : spring akan mencegah penggunaan ini, karena akan menyembunyikan field mandatory [filed wajib] ari luar yang seharusnya dilakukan oleh konstruktor. --> implementasi : `FieldBasedDI.java`


- solved error pom.xml
    ```xml
      <!-- solved error  -->
        <properties>
            <maven.compiler.source>1.6</maven.compiler.source>
            <maven.compiler.target>1.6</maven.compiler.target>
                <java.version>1.8</java.version>
        </properties> 
    ```

[<< back](../../README.md)

