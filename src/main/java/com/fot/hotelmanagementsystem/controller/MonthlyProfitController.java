package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.service.AnnualProfitService;
import com.fot.hotelmanagementsystem.service.MonthlyProfitServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/montlyProfit")
public class MonthlyProfitController {
    @Autowired
    MonthlyProfitServices monthlyProfitServices;

    @GetMapping("/all")
    public List<Object[]> getMonthlyProfitAmount(){
        return monthlyProfitServices.getMonthlyProfitAmount();
    }
}
