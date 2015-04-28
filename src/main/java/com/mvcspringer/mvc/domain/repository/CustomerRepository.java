package com.mvcspringer.mvc.domain.repository;

import com.mvcspringer.mvc.domain.model.Customer;
import com.mvcspringer.mvc.domain.model.Product;

import java.util.List;

/**
 * Created by xirconias on 28/04/15.
 */
public interface CustomerRepository {

    List<Customer> getAllCustomers();
    Customer	getCustomerById(String	customerID);
}
