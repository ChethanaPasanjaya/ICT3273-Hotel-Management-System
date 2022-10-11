package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.service.ViewMenuServices;
import com.fot.hotelmanagementsystem.service.ViewRoomDetailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/viewMealMenu")
public class MealMenuController {
    @Autowired
    ViewMenuServices viewMenuServices;

    @GetMapping("/all")
    public List<Object[]> getViewMenu() {
        return viewMenuServices.getViewMenu();
    }
}
