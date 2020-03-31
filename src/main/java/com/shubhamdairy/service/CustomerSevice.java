package com.shubhamdairy.service;

import java.util.List;

import com.shubhamdairy.model.CustomerEntity;

public interface CustomerSevice {

	public List<CustomerEntity> getListOfCustomers();

	// public void saveCustomers(CustomerEntity customerEntity);

	public CustomerEntity getByCustomerId(Long id);

	public void deleteByCustomerID(long custId);

	public CustomerEntity save(CustomerEntity customerEntity);

	public List<CustomerEntity> listAll();

}
