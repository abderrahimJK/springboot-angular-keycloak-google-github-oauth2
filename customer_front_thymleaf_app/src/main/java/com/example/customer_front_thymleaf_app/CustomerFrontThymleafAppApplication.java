package com.example.customer_front_thymleaf_app;

import com.example.customer_front_thymleaf_app.entities.Customer;
import com.example.customer_front_thymleaf_app.repositoy.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.oidc.web.logout.OidcClientInitiatedLogoutSuccessHandler;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;

@SpringBootApplication
public class CustomerFrontThymleafAppApplication {

    private ClientRegistrationRepository clientRegistrationRepository;

    public CustomerFrontThymleafAppApplication(ClientRegistrationRepository clientRegistrationRepository) {
        this.clientRegistrationRepository = clientRegistrationRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymleafAppApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("John").email("john@gmail.ma").build());
            customerRepository.save(Customer.builder().name("Med").email("med@gmail.ma").build());
            customerRepository.save(Customer.builder().name("Ali").email("ali@gmail.ma").build());
        };
    }



}
