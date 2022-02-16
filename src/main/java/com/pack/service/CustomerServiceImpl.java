package com.pack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pack.model.Customer;
import com.pack.repository.CustomerRepository;

@Component
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository repo;

	@Override
	public Customer saveCustRecord(Customer cust) {
		return repo.save(cust);
	}

	@Override
	public Optional<Customer> getOneRecord(Integer cid) {
		return repo.findById(cid);
	}

	@Override
	public List<Customer> getAllRecord() {
		return repo.findAll();
	}

	@Override
	public String deleteRecord(Integer cid) {
		 repo.deleteById(cid);
		 return "Your data has been deleted............$$";
	}

	@Override
	public Customer updateCustRecord(Customer cust) {
		return repo.saveAndFlush(cust);
	}
}
