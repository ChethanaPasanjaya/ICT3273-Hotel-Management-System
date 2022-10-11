package com.fot.hotelmanagementsystem.service;

import com.fot.hotelmanagementsystem.entity.Customer;

import java.util.ArrayList;

public interface CustomerService {
    public Customer save(Customer customer);
    public Customer update(Customer customer);
    public boolean delete(long id);
    public Customer findById(long id);
    public ArrayList<Customer> findAll();
}
