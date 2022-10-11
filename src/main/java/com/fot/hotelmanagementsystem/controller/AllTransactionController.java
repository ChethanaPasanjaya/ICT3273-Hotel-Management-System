package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.dto.AllTransactionDTO;
import com.fot.hotelmanagementsystem.entity.AllTransaction;
import com.fot.hotelmanagementsystem.entity.returns.Bill;
import com.fot.hotelmanagementsystem.entity.returns.CallBill;
import com.fot.hotelmanagementsystem.service.AllTransactionService;
import com.fot.hotelmanagementsystem.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/transaction")
public class AllTransactionController {

    @Autowired
    AllTransactionService allTransactionService;

    @GetMapping("/all")
    public ResponseEntity getBill(@RequestBody CallBill dto) {
        Bill res = allTransactionService.getBill(dto);
        if (res != null) {
            return new ResponseEntity(new StandardResponse("200", "Done", res), HttpStatus.OK);
        } else {
            return new ResponseEntity(new StandardResponse("500", "Error", null), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path = "/annual")
    public ResponseEntity getAnnualProfitSum() {
        double res = allTransactionService.getAnnualProfitSum();
        if (res != 0) {
            return new ResponseEntity(new StandardResponse("200", "Done", res), HttpStatus.OK);
        } else {
            return new ResponseEntity(new StandardResponse("500", "Error", null), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getById/{id}/{today}")
    public List<Object[]> getTransactionById(@PathVariable Integer id,@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date today){
        return allTransactionService.getTransactionById(id,today);
    }

}
