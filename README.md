# NGODING JAVA 
tag line : **Ngoding java mulai hari ini.**

<p align="center">
<img src="./img/java-features.png">
</p>


## installasi
* install jdk 11 LTE [make sure punya akun oracle, kalo belum ada silahkan buat]
* cek : `java --version` --> output : 
    ```java 11.0.5 2019-10-15 LTS
    Java(TM) SE Runtime Environment 18.9 (build 11.0.5+10-LTS)
    Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.5+10-LTS, mixed mode)
    ```
* install intellij IDEA

## course java dari Elga
* using spring
* [client-side]<-->[server-side]<-->[server-side-logic]<-->[database]
* learn both JAVA EE and Spring

* why Spring ? --> Simplify Java Enterprise Development.
* Goal of Spring :
   * LighWeight of JAVA POJOs (Plain-Old-Java-Objects)
   * Dependency injection to promote loose coupling.
   * Declarative programming with Aspect-Oriented-Programming (AOP) 
   * Minimaze boilerplate Java Code.

## what is spring project ?
* Additional Spring modules built-on top of the core spring framework 
* only use what you need ..
   * Spring Cloud, Spring Data
   * Spring Batch, Spring Security
   * Spring for android, Spring for webflow
   * Spring for webservice, spring LDAP

## JAVA COURSE > 4. Software Installation 
* install JDK [done]
* install tomcat [link install](https://www.dev2qa.com/how-to-install-tomcat-in-macos/)
  * download [tomcat] (https://tomcat.apache.org/download-90.cgi)
  * cd /{dir unzip}
  * chmod +x./bin/*.sh
  * get started : ./bin/startup.sh 
  * open browser : localhost:8080
  * stop service : ./bin/shutdown.sh
  * ubah port di : apache-tomcat-9.0.8/conf/server.xml
* install IDE Eclipse 
* connecting Tomcat and eclipse

## JAVA COURSE > 5. Software Installation 
* install intelij
* buka start.spring.io -> centang Rest Service
* run source code , buka browser : localhost:8080 --> output :
   ```json
   {
   "_links" : {
      "profile" : {
         "href" : "http://localhost:8080/profile"
      }
   }
   }
   ```
* tambahkan class HelloWorld berikut :
   ```java
   package com.javasuhada.restservice.RestApp;

   import org.springframework.web.bind.annotation.RequestMapping;
   import org.springframework.web.bind.annotation.RestController;

   @RestController
   public class HelloWorld {

      @RequestMapping("/")
      public String index(){
         return "Hello World";
      }

      @RequestMapping("/test")
      public String test(){
         return "this is test";
      }
   }
   ```

## setting untuk scheduling 
   * tambahkan @EnableSchedulling pada main source code
      ```java
         import org.springframework.boot.SpringApplication;
         import org.springframework.boot.autoconfigure.SpringBootApplication;
         import org.springframework.scheduling.annotation.EnableScheduling;

         @SpringBootApplication
         @EnableScheduling
         public class SpringBootSchedulerApplication {

            public static void main(String[] args) {
               SpringApplication.run(SpringBootSchedulerApplication.class, args);
            }
         }
      ``` 

## Schedulling with FixedRate
 * The main work for any scheduler is to schedule the tasks. Spring Boot make it easy to create a scheduling task. We only need to annotate the method with the @Scheduled annotation.

 * --> buat class baru SayHelloTask
    ```java
      @Component
      public class SayHelloTask {

         private static final Logger LOG = LoggerFactory.getLogger(SayHelloTask.class);

         @Scheduled(fixedRate = 1000)
         public void sayHello(){
            LOG.info("Hello from our simple scheduled method");
         }
      }
    ```
  * Let’s look at some important points:
      1. The @Scheduled annotation defines the scheduling (e.g. when method will run etc.)
      2. We can pass some parameters to the annotation for customize the behaviour.
  * output :
  ```bash
      2019-11-05 15:19:00.518  INFO 11103 --- [   scheduling-1] c.j.restservice.RestApp.SayHelloTask     : assalamualaikum
      2019-11-05 15:19:01.519  INFO 11103 --- [   scheduling-1] c.j.restservice.RestApp.SayHelloTask     : assalamualaikum
      2019-11-05 15:19:02.519  INFO 11103 --- [   scheduling-1] c.j.restservice.RestApp.SayHelloTask     : assalamualaikum
      2019-11-05 15:19:03.519  INFO 11103 --- [   scheduling-1] c.j.restservice.RestApp.SayHelloTask     : assalamualaikum
      2019-11-05 15:19:04.520  INFO 11103 --- [   scheduling-1] c.j.restservice.RestApp.SayHelloTask     : assalamualaikum
  ```

## Schedulling menggunakan FixedDelay 
```java
@Scheduled(fixedDelay = 2000)
public void fixedDelayExample() {
    LOG.info("Hello from our Fixed delay method");
    try {
        TimeUnit.SECONDS.sleep(3);
    } catch (InterruptedException ie) {
        LOG.error("Got Interrupted {}", ie);
    }
}
```

Here, the tasks getting triggered with the delay of 2 seconds. Let’s add some change to our method for a better understanding. Let’s assume that, our tasks takes 3 minutes to complete, in this case, next execution should start in 5 seconds (3 seconds for completion and 2 seconds delay).



## Paralel schedulling
We can also enable parallel scheduling by adding the @Async annotation to the scheduled tasks. Let’s look at this example:
```java
@EnableAsync
public class ParallelSchedulingExample {
    @Async
    @Scheduled(fixedDelay = 2000)
    public void fixedDelayExample() {
        LOG.info("Hello from our Fixed delay method");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException ie) {
            LOG.error("Got Interrupted {}", ie);
        }
    }
}
```

## Adding LOG
* example
   ```java
   @import org.sl4j.Logger;
   @import org.sl4j.LoggerFactory;

   public Class HelloWorld{
      public static final Logger LOG = LoggerFactory.getLogger(HelloWorld.class);

      @RequestMapping("/")
      public String route(){
         LOG.info("routing at route path is comming !");
         return "Hello World";
      }
   } 
   ```

   link : [dev-java](https://www.javadevjournal.com/spring-boot/spring-boot-scheduler/)

## TOMCAT Stored file
[link](https://serverfault.com/questions/143667/how-to-access-a-simple-file-or-folder-from-tomcat-webapps-folder)