package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.repo.AllTransactionRepo;
import com.fot.hotelmanagementsystem.repo.MealRepo;
import com.fot.hotelmanagementsystem.service.ViewMenuServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewMenuServicesImpl implements ViewMenuServices {
    @Autowired
    MealRepo mealRepo;

    @Override
    public List<Object[]> getViewMenu() {
        return mealRepo.getViewMenu();
    }
}
