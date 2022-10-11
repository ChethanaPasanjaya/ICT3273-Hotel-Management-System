package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.repo.AllTransactionRepo;
import com.fot.hotelmanagementsystem.service.MonthlyNotPaidServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonthlyNotPaidServicesImpl implements MonthlyNotPaidServices {
    @Autowired
    AllTransactionRepo allTransactionRepo;

    @Override
    public List<Object[]> getMonthlyNotPaidAmount() {
        return allTransactionRepo.getMonthlyNotPaidAmount();
    }
}
