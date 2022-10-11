package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.repo.EmployeePoolRepo;
import com.fot.hotelmanagementsystem.service.EmployeeWorkRestaurantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeWorkRestaurantServicesImpl implements EmployeeWorkRestaurantServices {
    @Autowired
    EmployeePoolRepo employeePoolRepo;

    @Override
    public List<Object[]> getEmployeeWorkRestaurant(Integer id) {
        return employeePoolRepo.getEmployeeWorkRestaurant(id);
    }
}
