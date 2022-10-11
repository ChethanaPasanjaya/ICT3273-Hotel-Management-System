package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.repo.AllTransactionRepo;
import com.fot.hotelmanagementsystem.service.TodayNotPaidServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodayNotPaidServicesImpl implements TodayNotPaidServices {
    @Autowired
    AllTransactionRepo allTransactionRepo;

    @Override
    public List<Object[]> getTodayNotPaidAmount() {
        return allTransactionRepo.getTodayNotPaidAmount();
    }
}
