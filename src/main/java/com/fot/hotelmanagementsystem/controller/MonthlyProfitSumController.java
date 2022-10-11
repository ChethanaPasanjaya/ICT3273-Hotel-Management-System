package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.service.AnnualProfitService;
import com.fot.hotelmanagementsystem.service.MonthlyProfitSumServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/monthlyProfitSum")
public class MonthlyProfitSumController {
    @Autowired
    MonthlyProfitSumServices monthlyProfitSumServices;

    @GetMapping("/all")
    public List<Object[]> getMonthlyProfitSum(){
        return monthlyProfitSumServices.getMonthlyProfitSum();
    }
}
