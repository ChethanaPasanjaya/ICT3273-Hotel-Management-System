package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.entity.AllTransaction;
import com.fot.hotelmanagementsystem.entity.returns.AnnualProfit;
import com.fot.hotelmanagementsystem.service.AnnualProfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/annualProfit")
public class AnnualProfitController {

    @Autowired
    AnnualProfitService annualProfitService;

    @GetMapping("/all")
    public List<Object[]> getAnnualAmount(){
        return annualProfitService.getAnnualAmount();
    }

}
