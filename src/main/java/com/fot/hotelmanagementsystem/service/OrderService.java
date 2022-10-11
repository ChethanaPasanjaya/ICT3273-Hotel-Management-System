package com.fot.hotelmanagementsystem.service;

import com.fot.hotelmanagementsystem.entity.Order;

import java.util.ArrayList;

public interface OrderService {
    public Order save(Order dto);
    public Order update(Order dto);
    public boolean delete(long id);
    public Order findById(long id);
    public ArrayList<Order> findAll();
}
