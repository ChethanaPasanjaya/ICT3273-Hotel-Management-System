package com.fot.hotelmanagementsystem.service;

import com.fot.hotelmanagementsystem.entity.OrderMeal;

import java.util.ArrayList;

public interface OrderMealService {
    public OrderMeal save(OrderMeal dto);
    public OrderMeal update(OrderMeal dto);
    public boolean delete(long id);
    public OrderMeal findById(long id);
    public ArrayList<OrderMeal> findAll();
}
