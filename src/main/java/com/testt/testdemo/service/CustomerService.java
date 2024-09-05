package com.testt.testdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testt.testdemo.entity.Customer;
import com.testt.testdemo.repository.CustomerRepo;


@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public Customer addUserId(Customer customer){
        return customerRepo.save(customer);
    }

    public List<Customer> getAll()
    {
        return customerRepo.findAll();
        
    }

    public Optional<Customer> getbyid(int id)
    {
        return customerRepo.findById(id);
        
    }

    public Customer updateCustomer(Long id,Customer customer)
    {
        return customerRepo.save(customer);
        
    }

    public void delete(int id)
    {
        customerRepo.deleteById(id);
    }
}
