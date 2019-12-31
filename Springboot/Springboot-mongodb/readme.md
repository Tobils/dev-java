# Springboot-mongodb

[link belajar](https://dzone.com/articles/spring-boot-and-postgresql)

## Install mongodb on your macos
* jalankan mongodb di terminal : sudo mongod

## source code
source untuk acces mongodb terdiri dari 3 file :
1. AccessingMongodbApplication.java
   ```java
   package com.dev.suhada.accessingmongodb;
   import org.springframework.beans.factory.annotation.Autowired;
   import org.springframework.boot.CommandLineRunner;
   import org.springframework.boot.SpringApplication;
   import org.springframework.boot.autoconfigure.SpringBootApplication;

   @SpringBootApplication
   public class AccessingMongodbApplication implements CommandLineRunner {
      @Autowired
      private CustomerRepository repository;

      public static void main(String[] args) {
         SpringApplication.run(AccessingMongodbApplication.class, args);
      }

      @Override
      public void run(String... args) throws Exception {
         repository.deleteAll();


         // save a couple of customer
         repository.save(new Customer("Alice", "Smith"));
         repository.save(new Customer("Bob", "Smith"));

         //fetch all customer
         System.out.println("customer found with findAll()");
         System.out.println("-----------------------------");
         for (Customer customer: repository.findAll()){
            System.out.println(customer);
         }
         System.out.println();

         // fetch an individual customer
         System.out.println("customer found with findByFirstName()");
         System.out.println("-------------------------------------");
         System.out.println(repository.findByFirstName("Alice"));

         System.out.println("customer found with findByLastName()");
         System.out.println("------------------------------------");
         for(Customer customer:repository.findByLastName("Smith")){
            System.out.println(customer);
         }
      }
   }
   ```
2. Customer.java
   ```java
   package com.dev.suhada.accessingmongodb;
   import org.springframework.data.annotation.Id;

   public class Customer {
      @Id
      public String id;
      public String firstName;
      public String lastName;
      public Customer(){}

      public Customer(String firstName, String lastName){
         this.firstName = firstName;
         this.lastName = lastName;
      }

      @Override
      public String toString(){
         return String.format(
                  "Customer[id=%s, firstName=%s, lastName=%s]",
                  id, firstName, lastName
         );
      }
   }
   ```
3. CustomerRepository.java
   ```java
   package com.dev.suhada.accessingmongodb;
   import java.util.List;
   import org.springframework.data.mongodb.repository.MongoRepository;

   public interface CustomerRepository extends MongoRepository<Customer, String> {

      public Customer findByFirstName(String firstName);
      public List<Customer> findByLastName(String lastName);

   }
   ```

## OUTPUT 
   ```bash shell
   2019-11-14 17:08:50.770  INFO 12678 --- [           main] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:46, serverValue:2}] to localhost:27017
   customer found with findAll()
   -----------------------------
   Customer[id=5dcd27b215b26031860e759d, firstName=Alice, lastName=Smith]
   Customer[id=5dcd27b215b26031860e759e, firstName=Bob, lastName=Smith]

   customer found with findByFirstName()
   -------------------------------------
   Customer[id=5dcd27b215b26031860e759d, firstName=Alice, lastName=Smith]
   customer found with findByLastName()
   ------------------------------------
   Customer[id=5dcd27b215b26031860e759d, firstName=Alice, lastName=Smith]
   Customer[id=5dcd27b215b26031860e759e, firstName=Bob, lastName=Smith]
   2019-11-14 17:08:50.930  INFO 12678 --- [       Thread-1] org.mongodb.driver.connection            : Closed connection [connectionId{localValue:46, serverValue:2}] to localhost:27017 because the pool has been closed.

   Process finished with exit code 0
   ```

[<< back](../readme.md)