package com.pack.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private Integer custId;
	private String custName;
	private Integer custAge;
	private String custCity;
	
	public Customer() {
	}

	public Customer(Integer custId, String custName, Integer custAge, String custCity) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAge = custAge;
		this.custCity = custCity;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Integer getCustAge() {
		return custAge;
	}

	public void setCustAge(Integer custAge) {
		this.custAge = custAge;
	}

	public String getCustCity() {
		return custCity;
	}

	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}

	@Override
	public String toString() {
		return  custId + "\t" + custName + "\t" + custAge + "\t"
				+ custCity ;
	}
	
	
}
