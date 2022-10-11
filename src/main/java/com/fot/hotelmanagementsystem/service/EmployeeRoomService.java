package com.fot.hotelmanagementsystem.service;

import com.fot.hotelmanagementsystem.entity.EmployeeRoom;

import java.util.ArrayList;

public interface EmployeeRoomService {
    public EmployeeRoom save(EmployeeRoom dto);
    public EmployeeRoom update(EmployeeRoom dto);
    public boolean delete(long id);
    public EmployeeRoom findById(long id);
    public ArrayList<EmployeeRoom> findAll();
}
