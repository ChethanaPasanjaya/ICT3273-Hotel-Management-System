package com.fot.hotelmanagementsystem.entity.returns;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnnualProfit {
    @Id
    private int id;
    private String customer_name;
    private int paid;
    private double amount;

}
