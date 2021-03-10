package com.customer.tracker.service;

import com.customer.tracker.dao.CustomerDao;
import com.customer.tracker.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;
    @Override
    public Set<Customer> findAll() {
        Set<Customer> customers = new HashSet<>();
        customerDao.findAll().forEach(customers::add);
        return customers;
    }
//@Override
//public List<Customer> findAll() {
//        return (List<Customer>) customerDao.findAll();
//}

    @Override
    public Customer findById(Integer id) {

        return customerDao.findById(id).orElse(null);
    }

    @Override
    public Customer save(Customer customer) {

        return customerDao.save(customer);
    }

    @Override
    public void delete(Customer object) {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
