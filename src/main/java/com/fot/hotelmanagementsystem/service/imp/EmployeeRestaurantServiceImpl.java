package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.entity.EmployeeRestaurant;
import com.fot.hotelmanagementsystem.repo.EmployeeRestaurantRepo;
import com.fot.hotelmanagementsystem.service.EmployeeRestaurantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
@Slf4j
public class EmployeeRestaurantServiceImpl implements EmployeeRestaurantService {

    @Autowired
    EmployeeRestaurantRepo employeeRestaurantRepo;

    @Override
    public EmployeeRestaurant save(EmployeeRestaurant dto) {
        return null;
    }

    @Override
    public EmployeeRestaurant update(EmployeeRestaurant dto) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public EmployeeRestaurant findById(long id) {
        return null;
    }

    @Override
    public ArrayList<EmployeeRestaurant> findAll() {
        return null;
    }
}
