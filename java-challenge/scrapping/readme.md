# Scrapping menggunakan Java dengan basic Maven
1. installasi
    * `brew install mvn` 
    * basic [link](https://www.petanikode.com/java-maven/)
2. membuat project scrapping
    - command terminalls
        ```bash
        mvn archetype:generate \
        -DgroupId=com.suhada.app \
        -DartifactId=scrapping \
        -DarchetypeArtifactId=maven-archetype-quickstart \
        -DinteractiveMode=false
        ```
    - penjelasan
        * Argumen archetype:generate artinya kita akan membuat sebuah archetype;
        * Argumen -DgroupId=com.suhada.app adalah namespace atau nama package dari aplikasi;
        * Argumen -DartifactId=scrapping adalah nama direktori dari aplikasi;
        * Argumen -DarchetypeArtifactId=maven-archetype-quickstart artifact atau template yang akan digunakan;
        * Arugmen -DinteractiveMode=false untuk mematikan mode iteraktif.

    - menambahkan dependency
        - edit pom.xml
            ```xml
            <!-- jsoup depencey  -->
            <dependency>
            <groupId>org.jsoup</groupId>
            <artifactId>jsoup</artifactId>
            <version>1.10.2</version>
            </dependency>
            ```
        - open terminal :`mvn install`
        - jika error karena versi jdk, tambahkan versi jdk properties :
            ```xml
            <!-- menambahkan properties untuk solved error -->
            <properties>
                <java.version>1.8</java.version>
            </properties>
            ```
        - compile : mvn exec:java -Dexec.mainClass=com.suhada.app.App
        - target :
            - https://clutch.co/app-developers/se-asia
            - https://clutch.co/id/top-service-providers?page=n
        - well done !
    
    - membuat file send mail
        - generate gmail project
            ```
             mvn archetype:generate \
            -DgroupId=com.suhada.app \
            -DartifactId=gmail \
            -DarchetypeArtifactId=maven-archetype-quickstart \
            -DinteractiveMode=false
            ```
        - menambahkan dependency javax.mail pada file pom.xml
            ```xml
            <dependency>
                <groupId>com.sun.mail</groupId>
                <artifactId>javax.mail</artifactId>
                <version>1.6.2</version>
            </dependency>
            ```
        - error solution
            ```xml
            <properties>
                <maven.compiler.source>1.6</maven.compiler.source>
                <maven.compiler.target>1.6</maven.compiler.target>
                <java.version>1.8</java.version>
            </properties>
            ```

        - isi email
            ```
            ```
        - 