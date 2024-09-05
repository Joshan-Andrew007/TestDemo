package com.testt.testdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testt.testdemo.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>{

}
