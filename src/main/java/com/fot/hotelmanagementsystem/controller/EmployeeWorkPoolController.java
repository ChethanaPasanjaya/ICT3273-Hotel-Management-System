package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.service.AnnualPaidServices;
import com.fot.hotelmanagementsystem.service.EmployeeWorkPoolServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employeeWorkPool")
public class EmployeeWorkPoolController {

    @Autowired
    EmployeeWorkPoolServices employeeWorkPoolServices;

    @GetMapping("/all/{id}")
    public List<Object[]> getEmployeeWorkPool(@PathVariable Integer id) {
        return employeeWorkPoolServices.getEmployeeWorkPool(id);
    }
}