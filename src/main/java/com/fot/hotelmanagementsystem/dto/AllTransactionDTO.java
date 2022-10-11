package com.fot.hotelmanagementsystem.dto;

import com.fot.hotelmanagementsystem.entity.Employee;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class AllTransactionDTO {
    private long id;
    private long employeeId;
    private long customerId;
    private String customerName;
    private String transactionType;
    private double amount;
    private int paid;
    private LocalDate payDate;
}
