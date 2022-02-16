package com.pack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pack.model.Customer;

@Service
public interface CustomerService {

	Customer saveCustRecord(Customer cust);

	Optional<Customer> getOneRecord(Integer cid);

	List<Customer> getAllRecord();

	String deleteRecord(Integer cid);

	Customer updateCustRecord(Customer cust);

}
