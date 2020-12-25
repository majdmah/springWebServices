package com.example.springWebServices.services;

import com.example.springWebServices.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);
    List<Customer> findAllCustomers();
    Customer saveCustomer(Customer customer);
}
