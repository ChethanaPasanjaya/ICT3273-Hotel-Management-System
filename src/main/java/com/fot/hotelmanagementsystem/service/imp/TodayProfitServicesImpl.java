package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.repo.AllTransactionRepo;
import com.fot.hotelmanagementsystem.service.TodayProfitServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodayProfitServicesImpl implements TodayProfitServices {
    @Autowired
    AllTransactionRepo allTransactionRepo;

    @Override
    public List<Object[]> getTodayProfitAmount() {
        return allTransactionRepo.getTodayProfitAmount();
    }
}
