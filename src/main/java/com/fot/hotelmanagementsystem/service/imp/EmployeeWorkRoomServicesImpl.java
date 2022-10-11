package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.repo.EmployeePoolRepo;
import com.fot.hotelmanagementsystem.repo.EmployeeRoomRepo;
import com.fot.hotelmanagementsystem.service.EmployeeWorkRoomServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeWorkRoomServicesImpl implements EmployeeWorkRoomServices{

    @Autowired
    EmployeeRoomRepo employeeRoomRepo;


    @Override
    public List<Object[]> getEmployeeWorkRoom(Integer id) {
        return employeeRoomRepo.getEmployeeWorkRoom(id);
    }
}
