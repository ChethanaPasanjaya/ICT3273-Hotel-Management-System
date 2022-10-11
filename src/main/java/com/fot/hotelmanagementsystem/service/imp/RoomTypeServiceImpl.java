package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.entity.RoomType;
import com.fot.hotelmanagementsystem.repo.RoomTypeRepo;
import com.fot.hotelmanagementsystem.service.RoomTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
@Slf4j
public class RoomTypeServiceImpl implements RoomTypeService {

    @Autowired
    RoomTypeRepo roomTypeRepo;

    @Override
    public RoomType save(RoomType dto) {
        return null;
    }

    @Override
    public RoomType update(RoomType dto) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public RoomType findById(long id) {
        log.info("Finding room type with ID: {}", id);
        return roomTypeRepo.findById(id).get();
    }

    @Override
    public ArrayList<RoomType> findAll() {
        return null;
    }
}
