package com.fot.hotelmanagementsystem.service;


import com.fot.hotelmanagementsystem.entity.Meal;

import java.util.ArrayList;

public interface MealService {
    public Meal save(Meal dto);
    public Meal update(Meal dto);
    public boolean delete(long id);
    public Meal findById(long id);
    public ArrayList<Meal> findAll();
}
