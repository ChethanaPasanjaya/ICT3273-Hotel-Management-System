package com.fot.hotelmanagementsystem.service;

import com.fot.hotelmanagementsystem.entity.Employee;

import java.util.ArrayList;

public interface EmployeeService {
    public Employee save(Employee dto);
    public Employee update(Employee dto);
    public boolean delete(long id);
    public Employee findById(long id);
    public ArrayList<Employee> findAll();
}
