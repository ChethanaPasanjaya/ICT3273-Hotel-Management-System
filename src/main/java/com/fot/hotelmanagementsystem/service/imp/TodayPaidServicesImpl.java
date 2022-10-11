package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.repo.AllTransactionRepo;
import com.fot.hotelmanagementsystem.service.TodayPaidServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodayPaidServicesImpl implements TodayPaidServices {
    @Autowired
    AllTransactionRepo allTransactionRepo;

    @Override
    public List<Object[]> getTodayPaidAmount() {
        return allTransactionRepo.getTodayPaidAmount();
    }
}
