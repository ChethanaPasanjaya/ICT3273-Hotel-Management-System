package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.repo.EmployeePoolRepo;
import com.fot.hotelmanagementsystem.service.EmployeeWorkPoolServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeWorkPoolServicesImpl implements EmployeeWorkPoolServices {
    @Autowired
    EmployeePoolRepo employeePoolRepo;

    @Override
    public List<Object[]> getEmployeeWorkPool(Integer id) {
        return employeePoolRepo.getEmployeeWorkPool(id);
    }
}
