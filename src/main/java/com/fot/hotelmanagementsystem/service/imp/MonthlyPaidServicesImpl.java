package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.repo.AllTransactionRepo;
import com.fot.hotelmanagementsystem.service.MonthlyPaidServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonthlyPaidServicesImpl implements MonthlyPaidServices {
    @Autowired
    AllTransactionRepo allTransactionRepo;
    @Override
    public List<Object[]> getMonthlyPaidAmount() {
        return allTransactionRepo.getMonthlyPaidAmount() ;



    }
}
