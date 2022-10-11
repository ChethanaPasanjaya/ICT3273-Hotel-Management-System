package com.fot.hotelmanagementsystem.service;

import com.fot.hotelmanagementsystem.entity.AllTransaction;
import com.fot.hotelmanagementsystem.entity.returns.AnnualProfit;

import java.util.List;

public interface AnnualProfitService {
    List<Object[]> getAnnualAmount();
}
