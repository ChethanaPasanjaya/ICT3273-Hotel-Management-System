package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.entity.Employee;
import com.fot.hotelmanagementsystem.repo.EmployeeRepo;
import com.fot.hotelmanagementsystem.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public Employee save(Employee dto) {
        return null;
    }

    @Override
    public Employee update(Employee dto) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public Employee findById(long id) {
        return null;
    }

    @Override
    public ArrayList<Employee> findAll() {
        return null;
    }
}
