package com.fot.hotelmanagementsystem.entity;

import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Mapping for DB view
 */
@Entity
@Immutable
@Table(name = "room_prices")
public class RoomPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 25)
    @NotNull
    @Column(name = "variety", nullable = false, length = 25)
    private String variety;

    @NotNull
    @Column(name = "price", nullable = false)
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVariety() {
        return variety;
    }

    public Double getPrice() {
        return price;
    }

    protected RoomPrice() {
    }
}