package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.entity.AllTransaction;
import com.fot.hotelmanagementsystem.entity.returns.AnnualProfit;
import com.fot.hotelmanagementsystem.repo.AllTransactionRepo;
import com.fot.hotelmanagementsystem.service.AnnualProfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnualProfitServiceImpl implements AnnualProfitService {

    @Autowired
    AllTransactionRepo allTransactionRepo;
    @Override
    public List<Object[]> getAnnualAmount() {
        return allTransactionRepo.getAnnualAmount();
    }
}
