package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.entity.Meal;
import com.fot.hotelmanagementsystem.repo.MealRepo;
import com.fot.hotelmanagementsystem.service.MealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
@Slf4j
public class MealServiceImpl implements MealService {

    @Autowired
    MealRepo mealRepo;

    @Override
    public Meal save(Meal dto) {
        return null;
    }

    @Override
    public Meal update(Meal dto) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public Meal findById(long id) {
        return null;
    }

    @Override
    public ArrayList<Meal> findAll() {
        return null;
    }
}
