package ma.enset.customer_service;

import ma.enset.customer_service.Entities.Customer;
import ma.enset.customer_service.Respositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(Customer.builder()
                    .name("oussama").email("oussama@gmail.com").build());
            customerRepository.save(Customer.builder()
                    .name("Hamid").email("Hamid@gmail.com").build());
        };

    }
}

