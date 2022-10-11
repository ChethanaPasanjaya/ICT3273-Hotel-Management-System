package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.service.AnnualNotPaidServices;
import com.fot.hotelmanagementsystem.service.AnnualProfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/annualNotPaid")
public class AnnualNotPaidController {

    @Autowired
    AnnualNotPaidServices annualNotPaidServices;

    @GetMapping("/all")
    public List<Object[]>  getAnnualNotPaidAmount(){
        return annualNotPaidServices. getAnnualNotPaidAmount();
    }
}
