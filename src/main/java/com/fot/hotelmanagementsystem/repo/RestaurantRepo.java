package com.fot.hotelmanagementsystem.repo;

import com.fot.hotelmanagementsystem.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepo extends JpaRepository<Restaurant, Long> {
}
