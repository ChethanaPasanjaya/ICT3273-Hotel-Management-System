package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.repo.AllTransactionRepo;
import com.fot.hotelmanagementsystem.service.CustomerUpdateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerUpdateServicesImpl implements CustomerUpdateServices {

    @Autowired
    AllTransactionRepo allTransactionRepo;
    @Override
    public List<Object[]> putCustomerUpdateById(Integer id, String name, String mail, String phone, String nic) {
        return allTransactionRepo.putCustomerUpdateById(id,name,mail,phone,nic);
    }
}
