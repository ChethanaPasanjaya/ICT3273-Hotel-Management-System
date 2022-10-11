package com.fot.hotelmanagementsystem.repo;

import com.fot.hotelmanagementsystem.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
