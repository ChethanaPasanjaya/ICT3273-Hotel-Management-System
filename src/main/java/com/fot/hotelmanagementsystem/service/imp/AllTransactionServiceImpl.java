package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.dto.AllTransactionDTO;
import com.fot.hotelmanagementsystem.entity.AllTransaction;
import com.fot.hotelmanagementsystem.entity.returns.Bill;
import com.fot.hotelmanagementsystem.entity.returns.CallBill;
import com.fot.hotelmanagementsystem.repo.AllTransactionRepo;
import com.fot.hotelmanagementsystem.repo.BillRepo;
import com.fot.hotelmanagementsystem.service.AllTransactionService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
@Slf4j
public class AllTransactionServiceImpl implements AllTransactionService {

    @Autowired
    AllTransactionRepo allTransactionRepo;

    @Autowired
    BillRepo billRepo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public AllTransaction save(AllTransaction dto) {
        return null;
    }

    @Override
    public AllTransaction update(AllTransaction dto) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public AllTransaction findById(long id) {
        return null;
    }

    @Override
    public ArrayList<AllTransaction> findAll() {
        return null;
    }

    @Override
    public Bill getBill(CallBill dto) {
        log.info("Finding bill with customer: {} and date: {}", dto.getCustomerId(),dto.getDate());
        Bill bill = billRepo.getBill(dto.getCustomerId(), dto.getDate());
//        return mapper.map(bill, AllTransactionDTO.class);
        return bill;
    }

    @Override
    public double getAnnualProfitSum() {
        log.info("Finding annual profit sum");
        return allTransactionRepo.getAnnualProfitSum();
    }

    @Override
    public List<Object[]> getTransactionById(Integer id, Date today) {
        return allTransactionRepo.getTransactionById(id,today);
    }
}
