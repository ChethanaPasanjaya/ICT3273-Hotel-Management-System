package com.fot.hotelmanagementsystem.service;

import com.fot.hotelmanagementsystem.entity.RoomType;

import java.util.ArrayList;

public interface RoomTypeService {
    public RoomType save(RoomType dto);
    public RoomType update(RoomType dto);
    public boolean delete(long id);
    public RoomType findById(long id);
    public ArrayList<RoomType> findAll();
}
