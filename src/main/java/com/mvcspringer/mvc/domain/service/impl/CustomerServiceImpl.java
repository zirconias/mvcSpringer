package com.mvcspringer.mvc.domain.service.impl;

import com.mvcspringer.mvc.domain.model.Customer;
import com.mvcspringer.mvc.domain.repository.CustomerRepository;
import com.mvcspringer.mvc.domain.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xirconias on 28/04/15.
 */
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }
}
