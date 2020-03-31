package com.shubhamdairy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shubhamdairy.model.CustomerEntity;
import com.shubhamdairy.model.Product;
import com.shubhamdairy.repository.CustomerRepository;

@Service
public class CustomerSeviceImpl implements CustomerSevice {

	@Autowired
	 CustomerRepository repository ;

	@Override
	public List<CustomerEntity> getListOfCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	/*s
	 * @Override public void saveCustomers(CustomerEntity customerEntity) { // TODO
	 * Auto-generated method stub System.out.println(" in save servic");
	 * repository.save(customerEntity); System.out.println("out in service"); }
	 */
	@Override
	public CustomerEntity getByCustomerId(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public void deleteByCustomerID(long custId) {
		repository.deleteById(custId);
	}

	@Override
	public CustomerEntity save(CustomerEntity customerEntity) {
		// TODO Auto-generated method stub
		return repository.save(customerEntity);
	}

	public List<CustomerEntity> listAll() {
		return repository.findAll();
	}
}
