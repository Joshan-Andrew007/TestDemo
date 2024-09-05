package com.testt.testdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testt.testdemo.entity.Customer;
import com.testt.testdemo.service.CustomerService;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;


    @PostMapping("/add")
    public ResponseEntity<Customer> addUser(@RequestBody Customer customer) 
    {
        return ResponseEntity.ok(customerService.addUserId(customer)); 
    }

    @GetMapping("/get")
    public ResponseEntity<List<Customer>> getAllCustomer()
    {
        return ResponseEntity.ok(customerService.getAll());
    }

    @GetMapping("getby/{id}")
    public ResponseEntity<Optional<Customer>> getCustomerId(@PathVariable int id)
    {
        return ResponseEntity.ok(customerService.getbyid(id));
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Customer> customerUpdate(@PathVariable Long id, @RequestBody Customer customer) 
    {
        return ResponseEntity.ok(customerService.updateCustomer(id, customer));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> customerDeleteById(@PathVariable int id)
    {
        customerService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
