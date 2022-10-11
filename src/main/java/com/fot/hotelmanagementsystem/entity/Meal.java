package com.fot.hotelmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "meals")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meal_id", nullable = false)
    private long id;

    @Column(name = "meal_name", length = 100)
    private String mealName;

    @Column(name = "price")
    private double price;

}
