package com.fot.hotelmanagementsystem.repo;

import com.fot.hotelmanagementsystem.entity.AllTransaction;
import com.fot.hotelmanagementsystem.entity.returns.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;

public interface BillRepo extends JpaRepository<Bill, Long> {
    @Query(value = "{CALL bill(:customerId,:date)}",nativeQuery = true)
    Bill getBill(long customerId, LocalDate date);
}
