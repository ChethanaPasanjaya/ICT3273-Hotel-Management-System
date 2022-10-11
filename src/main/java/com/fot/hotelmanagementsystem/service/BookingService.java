package com.fot.hotelmanagementsystem.service;


import com.fot.hotelmanagementsystem.dto.BookingDTO;
import com.fot.hotelmanagementsystem.entity.Booking;

import java.util.ArrayList;

public interface BookingService {
    public Booking save(BookingDTO dto);
    public Booking update(BookingDTO dto);
    public boolean delete(long id);
    public Booking findById(long id);
    public ArrayList<Booking> findAll();
}
