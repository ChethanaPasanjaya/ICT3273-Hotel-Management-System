package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.entity.RoomNumber;
import com.fot.hotelmanagementsystem.repo.RoomNumberRepo;
import com.fot.hotelmanagementsystem.service.RoomNumberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
@Slf4j
public class RoomNumberServiceImpl implements RoomNumberService {

    @Autowired
    RoomNumberRepo roomNumberRepo;

    @Override
    public RoomNumber save(RoomNumber dto) {
        return null;
    }

    @Override
    public RoomNumber update(RoomNumber dto) {
        return null;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public RoomNumber findById(String id) {
        return null;
    }

    @Override
    public ArrayList<RoomNumber> findAll() {
        return null;
    }
}
