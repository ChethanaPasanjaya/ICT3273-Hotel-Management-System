package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.service.AnnualPaidServices;
import com.fot.hotelmanagementsystem.service.AnnualProfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/annualPaid")
public class AnnualPaidController {

    @Autowired
    AnnualPaidServices annualPaidServices;

    @GetMapping("/all")
    public List<Object[]> getAnnualPaidAmount() {
        return annualPaidServices.getAnnualPaidAmount();
    }
}