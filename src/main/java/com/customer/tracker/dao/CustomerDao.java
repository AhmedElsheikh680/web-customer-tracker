package com.customer.tracker.dao;

import com.customer.tracker.model.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerDao extends CrudRepository<Customer, Integer> {




}
