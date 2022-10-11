package com.fot.hotelmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false)
    private long id;

    @Column(name = "customer_name", nullable = false, length = 100)
    private String customerName;

    @Column(name = "customer_mail", nullable = false, length = 100)
    private String customerMail;

    @Column(name = "customer_phone", nullable = false, length = 15)
    private String customerPhone;

    @Column(name = "customer_nic", nullable = false, length = 20)
    private String customerNic;

}
