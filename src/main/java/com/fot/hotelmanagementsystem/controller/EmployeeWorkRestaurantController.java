package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.service.EmployeeWorkPoolServices;
import com.fot.hotelmanagementsystem.service.EmployeeWorkRestaurantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employeeWorkRestaurant")
public class EmployeeWorkRestaurantController {
    @Autowired
    EmployeeWorkRestaurantServices employeeWorkRestaurantServices;

    @GetMapping("/all/{id}")
    public List<Object[]> getEmployeeWorkRestaurant(@PathVariable Integer id) {
        return employeeWorkRestaurantServices.getEmployeeWorkRestaurant(id);
    }
}
