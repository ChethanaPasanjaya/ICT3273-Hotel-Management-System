package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.entity.Restaurant;
import com.fot.hotelmanagementsystem.repo.RestaurantRepo;
import com.fot.hotelmanagementsystem.service.RestaurantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
@Slf4j
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    @Override
    public Restaurant save(Restaurant dto) {
        return null;
    }

    @Override
    public Restaurant update(Restaurant dto) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public Restaurant findById(long id) {
        return null;
    }

    @Override
    public ArrayList<Restaurant> findAll() {
        return null;
    }
}
