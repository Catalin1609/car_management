package com.example.demo.controllers;


import com.example.demo.persistance.services.CustomerServices;
import com.example.demo.persistance.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerServices customerServices;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerServices.getAllCustomers();
        }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerServices.getCustomerById(id);
        }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerServices.saveCustomer(customer);
        }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        return customerServices.updateCustomer(id, customer);
        }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerServices.deleteCustomer(id);
        }
    }


