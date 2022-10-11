package com.fot.hotelmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pool_transaction")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PoolTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "custemer_name", length = 100)
    private String custemerName;

    @Column(name = "price")
    private double price;

    @Column(name = "date")
    private LocalDate date;

}
