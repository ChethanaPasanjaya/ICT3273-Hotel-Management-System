package com.fot.hotelmanagementsystem.service;

import com.fot.hotelmanagementsystem.entity.EmployeeRestaurant;

import java.util.ArrayList;

public interface EmployeeRestaurantService {
    public EmployeeRestaurant save(EmployeeRestaurant dto);
    public EmployeeRestaurant update(EmployeeRestaurant dto);
    public boolean delete(long id);
    public EmployeeRestaurant findById(long id);
    public ArrayList<EmployeeRestaurant> findAll();
}
