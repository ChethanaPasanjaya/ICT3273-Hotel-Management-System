package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.service.AnnualProfitService;
import com.fot.hotelmanagementsystem.service.TodayPaidServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todayPaid")
public class TodayPaidController {
    @Autowired
    TodayPaidServices todayPaidServices;

    @GetMapping("/all")
    public List<Object[]> getTodayPaidAmount(){
        return todayPaidServices.getTodayPaidAmount();
    }
}
