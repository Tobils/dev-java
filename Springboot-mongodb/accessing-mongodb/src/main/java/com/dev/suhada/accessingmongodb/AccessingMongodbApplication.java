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
