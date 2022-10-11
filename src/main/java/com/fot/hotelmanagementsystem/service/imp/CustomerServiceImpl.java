package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.entity.Customer;
import com.fot.hotelmanagementsystem.repo.CustomerRepo;
import com.fot.hotelmanagementsystem.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Optional;

@Service
@Transactional
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    @Override
    public Customer save(Customer customer) {
        log.info("Saving customer with NIC: {}", customer.getCustomerNic());
        return customerRepo.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        log.info("Updating customer with ID: {}", customer.getId());
        Optional<Customer> res = customerRepo.findById(customer.getId());
        if (res.get().getId() == customer.getId()) {
            return customerRepo.save(customer);
        }
        return null;
    }

    @Override
    public boolean delete(long id) {
        log.info("Deleting customer with ID: {}", id);
        Optional<Customer> res = customerRepo.findById(id);
        if (null != res.get()) {
            customerRepo.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Customer findById(long id) {
        log.info("Finding customer with ID: {}", id);
        return customerRepo.findById(id).get();
    }

    @Override
    public ArrayList<Customer> findAll() {
        log.info("Finding all customers");
        return (ArrayList<Customer>) customerRepo.findAll();
    }
}
