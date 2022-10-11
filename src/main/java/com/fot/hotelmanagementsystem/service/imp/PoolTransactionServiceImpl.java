package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.entity.PoolTransaction;
import com.fot.hotelmanagementsystem.repo.PoolTransactionRepo;
import com.fot.hotelmanagementsystem.service.PoolTransactionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
@Slf4j
public class PoolTransactionServiceImpl implements PoolTransactionService {

    @Autowired
    PoolTransactionRepo poolTransactionRepo;

    @Override
    public PoolTransaction save(PoolTransaction dto) {
        return null;
    }

    @Override
    public PoolTransaction update(PoolTransaction dto) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public PoolTransaction findById(long id) {
        return null;
    }

    @Override
    public ArrayList<PoolTransaction> findAll() {
        return null;
    }
}
