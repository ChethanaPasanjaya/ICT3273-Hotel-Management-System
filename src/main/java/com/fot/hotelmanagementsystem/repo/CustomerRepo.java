package com.fot.hotelmanagementsystem.repo;

import com.fot.hotelmanagementsystem.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

    @Query(value = "SELECT * FROM customer WHERE customer_id=?1",nativeQuery = true)
    Customer getCustomerById(long id);
}
