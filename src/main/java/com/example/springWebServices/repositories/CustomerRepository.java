package com.example.springWebServices.repositories;

import com.example.springWebServices.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
