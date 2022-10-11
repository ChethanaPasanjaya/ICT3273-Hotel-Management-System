package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.repo.AllTransactionRepo;
import com.fot.hotelmanagementsystem.service.AnnualNotPaidServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnualNotPaidServicesImpl implements AnnualNotPaidServices {

    @Autowired
    AllTransactionRepo allTransactionRepo;
    @Override
    public List<Object[]>  getAnnualNotPaidAmount() {
        return allTransactionRepo. getAnnualNotPaidAmount();
    }
}
