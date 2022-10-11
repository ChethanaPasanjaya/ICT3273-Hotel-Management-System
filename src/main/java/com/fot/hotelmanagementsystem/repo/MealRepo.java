package com.fot.hotelmanagementsystem.repo;

import com.fot.hotelmanagementsystem.entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MealRepo extends JpaRepository<Meal, Long> {
    @Query(value = "call hotel_1.meal_menu();",nativeQuery = true)
    List<Object[]> getViewMenu();
}
