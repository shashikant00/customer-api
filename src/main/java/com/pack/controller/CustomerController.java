package com.pack.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.model.Customer;
import com.pack.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@PostMapping("/save")
	public Customer saveCustRecord(@RequestBody Customer cust) {
		return service.saveCustRecord(cust);
	}
	@GetMapping("/show")
	public String showMsg() {
		return "Welcome to SpringBoot Application and Thanks for choosing Maven Command!!!!!!";
	}
	
	@GetMapping("/get/{cid}")
	public Optional<Customer> getOneRecord(@PathVariable("cid") Integer cid){
		return service.getOneRecord(cid);
	}
	
	@GetMapping("/getAll")
	public List<Customer> getAllRecord(){
		return service.getAllRecord();
	}
	
	@DeleteMapping("/delete/{cid}")
	public String deleteRecord(@PathVariable("cid") Integer cid) {
		return service.deleteRecord(cid);
	}
	@PutMapping("/update")
	public Customer updateCustRecord(@RequestBody Customer cust) {
		return service.updateCustRecord(cust);
	}

}
