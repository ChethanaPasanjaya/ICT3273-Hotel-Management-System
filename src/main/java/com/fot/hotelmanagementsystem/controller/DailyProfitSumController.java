package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.service.AnnualProfitService;
import com.fot.hotelmanagementsystem.service.DailyProfitSumServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dailyProfitSum")
public class DailyProfitSumController {
    @Autowired
    DailyProfitSumServices dailyProfitSumServices;

    @GetMapping("/all")
    public List<Object[]> getDailyProfitSum(){
        return dailyProfitSumServices.getDailyProfitSum();
    }
}
