package com.beacon.nsocketio;

import com.beacon.nsocketio.dao.CustomerRepository;
import com.beacon.nsocketio.pojo.entity.CustomerDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class NsocketioApplication {

	public static void main(String[] args) {
		SpringApplication.run(NsocketioApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new CustomerDO("Jack", "Bauer"));
			repository.save(new CustomerDO("Chloe", "O'Brian"));
			repository.save(new CustomerDO("Kim", "Bauer"));
			repository.save(new CustomerDO("David", "Palmer"));
			repository.save(new CustomerDO("Michelle", "Dessler"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (CustomerDO customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			CustomerDO customer = repository.findById(1L);
			log.info("Customer found with findById(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByLastName("Bauer").forEach(bauer -> {
				log.info(bauer.toString());
			});
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			// 	log.info(bauer.toString());
			// }
			log.info("");
		};
	}
}
