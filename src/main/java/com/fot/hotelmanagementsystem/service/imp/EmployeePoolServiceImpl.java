package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.entity.EmployeePool;
import com.fot.hotelmanagementsystem.repo.EmployeePoolRepo;
import com.fot.hotelmanagementsystem.service.EmployeePoolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
@Slf4j
public class EmployeePoolServiceImpl implements EmployeePoolService {

    @Autowired
    EmployeePoolRepo employeePoolRepo;

    @Override
    public EmployeePool save(EmployeePool dto) {
        return null;
    }

    @Override
    public EmployeePool update(EmployeePool dto) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public EmployeePool findById(long id) {
        return null;
    }

    @Override
    public ArrayList<EmployeePool> findAll() {
        return null;
    }
}
