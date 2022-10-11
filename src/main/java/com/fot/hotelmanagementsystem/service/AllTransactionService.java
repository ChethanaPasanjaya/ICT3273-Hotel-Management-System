package com.fot.hotelmanagementsystem.service;

import com.fot.hotelmanagementsystem.dto.AllTransactionDTO;
import com.fot.hotelmanagementsystem.entity.AllTransaction;
import com.fot.hotelmanagementsystem.entity.returns.Bill;
import com.fot.hotelmanagementsystem.entity.returns.CallBill;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface AllTransactionService {

    public AllTransaction save(AllTransaction dto);
    public AllTransaction update(AllTransaction dto);
    public boolean delete(long id);
    public AllTransaction findById(long id);
    public ArrayList<AllTransaction> findAll();
    public Bill getBill(CallBill dto);
    public double getAnnualProfitSum();

    List<Object[]> getTransactionById(Integer id,Date today);
}
