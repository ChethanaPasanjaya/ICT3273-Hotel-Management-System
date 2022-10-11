package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.entity.Pool;
import com.fot.hotelmanagementsystem.repo.PoolRepo;
import com.fot.hotelmanagementsystem.service.PoolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
@Slf4j
public class PoolServiceImpl implements PoolService {

    @Autowired
    PoolRepo poolRepo;

    @Override
    public Pool save(Pool dto) {
        return null;
    }

    @Override
    public Pool update(Pool dto) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public Pool findById(long id) {
        return null;
    }

    @Override
    public ArrayList<Pool> findAll() {
        return null;
    }

    @Override
    public boolean poolBooking(String id, int qty) {
        poolRepo.book(id, qty);
        return true;
    }
}
