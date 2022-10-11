package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.repo.OrderMealRepo;
import com.fot.hotelmanagementsystem.repo.RoomTypeRepo;
import com.fot.hotelmanagementsystem.service.ViewRoomDetailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewRoomDetailServicesImpl implements ViewRoomDetailServices {

    @Autowired
    RoomTypeRepo roomTypeRepo;



    @Override
    public List<Object[]> getViewRoom() {
        return roomTypeRepo.getViewRoom();
    }
}
