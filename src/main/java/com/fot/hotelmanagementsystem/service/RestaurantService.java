package com.fot.hotelmanagementsystem.service;

import com.fot.hotelmanagementsystem.entity.Restaurant;

import java.util.ArrayList;

public interface RestaurantService {
    public Restaurant save(Restaurant dto);
    public Restaurant update(Restaurant dto);
    public boolean delete(long id);
    public Restaurant findById(long id);
    public ArrayList<Restaurant> findAll();
}
