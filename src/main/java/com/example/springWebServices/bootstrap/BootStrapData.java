package com.example.springWebServices.bootstrap;

import com.example.springWebServices.domain.Customer;
import com.example.springWebServices.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading customer Data");

        Customer c1 = new Customer();
        c1.setFirstName("Majd");
        c1.setLastName("Mahajenah");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("Jhonny");
        c2.setLastName("Water");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("Walter");
        c3.setLastName("White");
        customerRepository.save(c3);

        System.out.println("Customers Saved : " + customerRepository.count());
    }
}
