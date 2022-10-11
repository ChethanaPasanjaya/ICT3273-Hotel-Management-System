package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.service.ViewOrderServices;
import com.fot.hotelmanagementsystem.service.ViewRoomDetailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/viewRoomDetails")
public class ViewRoomDetailsController {

    @Autowired
    ViewRoomDetailServices viewRoomDetailServices;

    @GetMapping("/all")
    public List<Object[]> getViewRoom() {
        return viewRoomDetailServices.getViewRoom();
    }
}
