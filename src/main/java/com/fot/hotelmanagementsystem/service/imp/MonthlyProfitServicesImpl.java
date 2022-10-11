package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.repo.AllTransactionRepo;
import com.fot.hotelmanagementsystem.service.MonthlyProfitServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonthlyProfitServicesImpl implements MonthlyProfitServices {
    @Autowired
    AllTransactionRepo allTransactionRepo;
    @Override
    public List<Object[]> getMonthlyProfitAmount() {
        return allTransactionRepo.getMonthlyProfitAmount();
    }
}
