package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.service.EmployeeWorkPoolServices;
import com.fot.hotelmanagementsystem.service.ViewOrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/viewOrder")
public class ViewOrderController {
    @Autowired
    ViewOrderServices viewOrderServices;

    @GetMapping("/all/{id}")
    public List<Object[]> getViewOrder(@PathVariable Integer id) {
        return viewOrderServices.getViewOrder(id);
    }
}
