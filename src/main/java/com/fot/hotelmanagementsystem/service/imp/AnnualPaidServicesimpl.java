package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.repo.AllTransactionRepo;
import com.fot.hotelmanagementsystem.service.AnnualPaidServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnualPaidServicesimpl implements AnnualPaidServices{
    @Autowired
    AllTransactionRepo allTransactionRepo;
    @Override
    public List<Object[]> getAnnualPaidAmount() {
        return allTransactionRepo.getAnnualPaidAmount();
    }
}
