package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.repo.EmployeeRoomRepo;
import com.fot.hotelmanagementsystem.repo.OrderMealRepo;
import com.fot.hotelmanagementsystem.service.ViewOrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewOrderServicesImpl implements ViewOrderServices {
    @Autowired
    OrderMealRepo orderMealRepo;


    @Override
    public List<Object[]> getViewOrder(Integer id) {
        return orderMealRepo.getViewOrder(id);
    }
}
