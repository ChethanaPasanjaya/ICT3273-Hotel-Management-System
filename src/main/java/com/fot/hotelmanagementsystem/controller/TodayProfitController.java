package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.service.AnnualProfitService;
import com.fot.hotelmanagementsystem.service.TodayProfitServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todayProfit")
public class TodayProfitController {

    @Autowired
    TodayProfitServices todayProfitServices;

    @GetMapping("/all")
    public List<Object[]> getTodayProfitAmount(){
        return todayProfitServices.getTodayProfitAmount();
    }

}
