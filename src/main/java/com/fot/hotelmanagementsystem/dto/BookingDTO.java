package com.fot.hotelmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDTO {
    private long id;
    private long customerId;
    private long roomTypeId;
    private LocalDate bookingDate;
    private int period;
    private int roomQty;
}
