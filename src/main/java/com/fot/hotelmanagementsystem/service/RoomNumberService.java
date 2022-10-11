package com.fot.hotelmanagementsystem.service;


import com.fot.hotelmanagementsystem.entity.RoomNumber;

import java.util.ArrayList;

public interface RoomNumberService {
    public RoomNumber save(RoomNumber dto);
    public RoomNumber update(RoomNumber dto);
    public boolean delete(String id);
    public RoomNumber findById(String id);
    public ArrayList<RoomNumber> findAll();
}
