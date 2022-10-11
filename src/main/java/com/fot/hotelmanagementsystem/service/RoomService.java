package com.fot.hotelmanagementsystem.service;

import com.fot.hotelmanagementsystem.entity.Room;

import java.util.ArrayList;

public interface RoomService {
    public Room save(Room dto);
    public Room update(Room dto);
    public boolean delete(long id);
    public Room findById(long id);
    public ArrayList<Room> findAll();
}
