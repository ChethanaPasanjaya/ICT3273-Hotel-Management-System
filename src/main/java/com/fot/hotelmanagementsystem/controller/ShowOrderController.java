package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.repo.AllTransactionRepo;
import com.fot.hotelmanagementsystem.service.ShowOrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/showOrder")
public class ShowOrderController {
    @Autowired
    ShowOrderServices showOrderServices;

    @GetMapping("/all/{id}")
    public List<Object[]> getOrderById(@PathVariable Integer id){
        return showOrderServices.getOrderById(id);}
}
