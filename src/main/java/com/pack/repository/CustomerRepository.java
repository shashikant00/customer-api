package com.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pack.model.Customer;

//@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
