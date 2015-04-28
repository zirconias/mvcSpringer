package com.mvcspringer.mvc.domain.repository.impl;

import com.mvcspringer.mvc.domain.model.Customer;
import com.mvcspringer.mvc.domain.model.Product;
import com.mvcspringer.mvc.domain.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xirconias on 28/04/15.
 */
@Repository
public class InMemoryCustomerRepository implements CustomerRepository {


    private List<Customer> listOfCustomers = new ArrayList<Customer>();

    public InMemoryCustomerRepository() {
        Customer c1= new Customer("c1","iiis1","ssss1");
        Customer c2= new Customer("c2","iiis2","ssss2");
        Customer c3= new Customer("c3","iiis3","ssss3");
        Customer c4= new Customer("c4","iiis4","ssss4");
        Customer c5= new Customer("c5","iiis5","ssss5");
        Customer c6= new Customer("c6","iiis6","ssss6");
        listOfCustomers.add(c1);
        listOfCustomers.add(c2);
        listOfCustomers.add(c3);
        listOfCustomers.add(c4);
        listOfCustomers.add(c5);
        listOfCustomers.add(c6);
    }


    @Override
    public List<Customer> getAllCustomers() {
        return listOfCustomers;
    }

    @Override
    public Customer getCustomerById(String customerID) {
        Customer customerById = null;
        for (Customer customer : listOfCustomers) {
            if (customer != null && customer.getCustomerId() != null &&
                    customer.getCustomerId().equals(customerID)) {
                customerById = customer;
                break;
            }
        }
        if (customerById == null) {
            throw new IllegalArgumentException("No	Customer	found	with	the	 id:	" + customerID);
        }

        return customerById;
    }
}
