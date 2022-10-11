package com.fot.hotelmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "pool")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pool_id", nullable = false)
    private long id;

    @Column(name = "pool_name", nullable = false, length = 45)
    private String poolName;

    @Column(name = "pool_status", nullable = false, length = 45)
    private String poolStatus;

    @Column(name = "pool_prices", nullable = false)
    private int poolPrices;

}
