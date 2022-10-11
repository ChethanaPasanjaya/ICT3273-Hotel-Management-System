package com.fot.hotelmanagementsystem.repo;

import com.fot.hotelmanagementsystem.entity.EmployeePool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeePoolRepo extends JpaRepository<EmployeePool, Long> {
    @Query(value = "call hotel_1.employee_work_pool(:id);",nativeQuery = true)
    List<Object[]> getEmployeeWorkPool(Integer id);

    @Query(value = "call hotel_1.employee_work_restaurant(:id);",nativeQuery = true)
    List<Object[]> getEmployeeWorkRestaurant(Integer id);

}
