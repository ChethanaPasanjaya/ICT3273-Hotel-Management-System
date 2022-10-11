package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.repo.AllTransactionRepo;
import com.fot.hotelmanagementsystem.service.MonthlyProfitSumServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonthlyProfitSumServicesImpl implements MonthlyProfitSumServices {
    @Autowired
    AllTransactionRepo allTransactionRepo;

    @Override
    public List<Object[]> getMonthlyProfitSum() {
        return allTransactionRepo.getMonthlyProfitSum();
    }
}
