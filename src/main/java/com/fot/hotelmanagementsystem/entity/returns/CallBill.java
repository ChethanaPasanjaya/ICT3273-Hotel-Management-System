package com.fot.hotelmanagementsystem.entity.returns;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CallBill {
    private long customerId;
    private LocalDate date;
}
