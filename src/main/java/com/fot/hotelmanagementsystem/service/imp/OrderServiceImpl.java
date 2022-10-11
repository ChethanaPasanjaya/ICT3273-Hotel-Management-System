package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.entity.Order;
import com.fot.hotelmanagementsystem.repo.OrderRepo;
import com.fot.hotelmanagementsystem.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Override
    public Order save(Order dto) {
        return null;
    }

    @Override
    public Order update(Order dto) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public Order findById(long id) {
        return null;
    }

    @Override
    public ArrayList<Order> findAll() {
        return null;
    }
}
