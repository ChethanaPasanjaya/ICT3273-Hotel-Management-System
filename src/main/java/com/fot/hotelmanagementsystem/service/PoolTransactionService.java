package com.fot.hotelmanagementsystem.service;

import com.fot.hotelmanagementsystem.entity.PoolTransaction;

import java.util.ArrayList;

public interface PoolTransactionService {
    public PoolTransaction save(PoolTransaction dto);
    public PoolTransaction update(PoolTransaction dto);
    public boolean delete(long id);
    public PoolTransaction findById(long id);
    public ArrayList<PoolTransaction> findAll();
}
