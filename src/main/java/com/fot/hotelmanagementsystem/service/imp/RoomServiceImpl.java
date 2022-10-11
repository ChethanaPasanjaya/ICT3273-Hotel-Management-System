package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.entity.Room;
import com.fot.hotelmanagementsystem.repo.RoomRepo;
import com.fot.hotelmanagementsystem.service.RoomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
@Slf4j
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomRepo roomRepo;

    @Override
    public Room save(Room dto) {
        return null;
    }

    @Override
    public Room update(Room dto) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public Room findById(long id) {
        return null;
    }

    @Override
    public ArrayList<Room> findAll() {
        return null;
    }
}
