package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.service.ViewRoomBookingServices;
import com.fot.hotelmanagementsystem.service.ViewRoomDetailServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/viewRoomBooking")
public class ViewRoomBookingController {
    ViewRoomBookingServices viewRoomBookingServices;

    @GetMapping("/all")
    public List<Object[]> getViewRoomBooking() {
        return viewRoomBookingServices.getViewRoomBooking();
    }
}
