package com.fot.hotelmanagementsystem.service;

import com.fot.hotelmanagementsystem.entity.Pool;

import java.util.ArrayList;

public interface PoolService {
    public Pool save(Pool dto);
    public Pool update(Pool dto);
    public boolean delete(long id);
    public Pool findById(long id);
    public ArrayList<Pool> findAll();

    public boolean poolBooking(String  id, int qty);
}
