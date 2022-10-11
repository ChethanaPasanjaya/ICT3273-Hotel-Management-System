package com.fot.hotelmanagementsystem.repo;

import com.fot.hotelmanagementsystem.entity.OrderMeal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderMealRepo extends JpaRepository<OrderMeal, Long> {

    @Query(value = "call hotel_1.showOrder(:id);",nativeQuery = true)
    List<Object[]> getViewOrder(Integer id);
}
