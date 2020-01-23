# Scrapping menggunakan Java dengan basic Maven pada web clutch.co
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
        - subject mail
            ```
            Hey Team - You are doing great, I really love what you are doing!
            ```
        - message mail
            ```
            Hi, 
            My name is Suhada, I am junior sotfware engineer at start up in Yogyakarta, Indonesia. 

            I just wanted to say that i'm huge fan of your company and interested with your company. 
            I love your products and your services, your team doing great work, I would love to learn more about your company.

            I was also wondering if you have any sample product or any company's swag could you send my way -
            I'd love to try it, and would appreciate anything you could send me.

            Thank you so much and have a great Day.

            Sincerely yours, 
            Suhada


            ---------------
            Jl. Anggajaya 2 No.105, Sanggrahan, Condongcatur, 
            Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta, Indonesia
            Post Code   : 55281
            Whatsapp    : +6285228663237
            ---------------
            ```
    
    3. Scrapping Jilid #2 Relate to -- Day 24 #100DaysOfCode 23-01-2020
        - scrapping mail perushaan IT di indonesia
        - generate project
            ```
            mvn archetype:generate \
            -DgroupId=com.suhada.app \
            -DartifactId=scrappingTopWebDeveloperID \
            -DarchetypeArtifactId=maven-archetype-quickstart \
            -DinteractiveMode=false
            ``` 
        - setting properties resources
            - make directory resources in src.main
            - edit pom.xml 
                ```xml
                <resources>
                    <resource>
                        <directory>src/main/resources</directory>
                        <filtering>true</filtering>
                    </respurce>
                </resources>
                ```
        