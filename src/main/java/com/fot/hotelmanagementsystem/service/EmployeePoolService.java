package com.fot.hotelmanagementsystem.service;

import com.fot.hotelmanagementsystem.entity.EmployeePool;

import java.util.ArrayList;

public interface EmployeePoolService {
    public EmployeePool save(EmployeePool dto);
    public EmployeePool update(EmployeePool dto);
    public boolean delete(long id);
    public EmployeePool findById(long id);
    public ArrayList<EmployeePool> findAll();
}
