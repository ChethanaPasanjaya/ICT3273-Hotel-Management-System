package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.entity.OrderMeal;
import com.fot.hotelmanagementsystem.repo.OrderMealRepo;
import com.fot.hotelmanagementsystem.service.OrderMealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
@Slf4j
public class OrderMealServiceImpl implements OrderMealService {

    @Autowired
    OrderMealRepo orderMealRepo;

    @Override
    public OrderMeal save(OrderMeal dto) {
        return null;
    }

    @Override
    public OrderMeal update(OrderMeal dto) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public OrderMeal findById(long id) {
        return null;
    }

    @Override
    public ArrayList<OrderMeal> findAll() {
        return null;
    }
}
