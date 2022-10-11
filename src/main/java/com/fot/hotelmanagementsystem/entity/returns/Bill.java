package com.fot.hotelmanagementsystem.entity.returns;

import com.fot.hotelmanagementsystem.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bill {
    @Id
    private long id;
    private long employee;
    private int customerId;
    private String customerName;
    private String transactionType;
    private double amount;
    private int paid;
    private LocalDate payDate;
}
