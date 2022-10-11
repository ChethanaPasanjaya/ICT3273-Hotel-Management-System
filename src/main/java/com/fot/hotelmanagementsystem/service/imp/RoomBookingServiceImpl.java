package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.entity.RoomBooking;
import com.fot.hotelmanagementsystem.repo.RoomBookingRepo;
import com.fot.hotelmanagementsystem.service.RoomBookingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
@Slf4j
public class RoomBookingServiceImpl implements RoomBookingService {

    @Autowired
    RoomBookingRepo roomBookingRepo;

    @Override
    public RoomBooking save(RoomBooking dto) {
        return null;
    }

    @Override
    public RoomBooking update(RoomBooking dto) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public RoomBooking findById(long id) {
        return null;
    }

    @Override
    public ArrayList<RoomBooking> findAll() {
        return null;
    }
}
