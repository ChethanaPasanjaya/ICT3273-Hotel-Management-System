package com.fot.hotelmanagementsystem.service;

import com.fot.hotelmanagementsystem.entity.RoomBooking;

import java.util.ArrayList;

public interface RoomBookingService {
    public RoomBooking save(RoomBooking dto);
    public RoomBooking update(RoomBooking dto);
    public boolean delete(long id);
    public RoomBooking findById(long id);
    public ArrayList<RoomBooking> findAll();
}
