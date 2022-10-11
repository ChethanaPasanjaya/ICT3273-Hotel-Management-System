package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.repo.AllTransactionRepo;
import com.fot.hotelmanagementsystem.service.ShowOrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowOrderServicesImpl implements ShowOrderServices {
    @Autowired
    AllTransactionRepo allTransactionRepo;
    @Override
    public List<Object[]> getOrderById(Integer id) {
        return allTransactionRepo.getOrderById(id);
    }
}
