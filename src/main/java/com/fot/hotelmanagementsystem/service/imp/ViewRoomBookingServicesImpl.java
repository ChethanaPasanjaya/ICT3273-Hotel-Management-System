package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.repo.RoomBookingRepo;
import com.fot.hotelmanagementsystem.repo.RoomTypeRepo;
import com.fot.hotelmanagementsystem.service.ViewRoomBookingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewRoomBookingServicesImpl implements ViewRoomBookingServices {
    @Autowired
    RoomBookingRepo roomBookingRepo;

    @Override
    public List<Object[]> getViewRoomBooking() {
        return roomBookingRepo.getViewRoomBooking();
    }
}
