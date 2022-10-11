package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.service.AnnualProfitService;
import com.fot.hotelmanagementsystem.service.MonthlyNotPaidServices;
import com.fot.hotelmanagementsystem.service.MonthlyPaidServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/monthlyNotPaid")
public class MonthlyNotPaidController {
    @Autowired
    MonthlyNotPaidServices monthlyNotPaidServices;

    @GetMapping("/all")
    public List<Object[]> getMonthlyNotPaidAmount(){
        return monthlyNotPaidServices.getMonthlyNotPaidAmount();
    }
}
