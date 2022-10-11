package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.service.CustomerUpdateServices;
import com.fot.hotelmanagementsystem.service.ShowOrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/customerUpdate")
public class CustomerUpdateController {

    @Autowired
    CustomerUpdateServices customerUpdateServices;

    @PutMapping ("/all/{id}/{name}/{mail}/{phone}/{nic}")
    public List<Object[]> putCustomerUpdateById(@PathVariable Integer id , @PathVariable String name ,@PathVariable String mail,@PathVariable String phone ,@PathVariable String nic){
        return customerUpdateServices.putCustomerUpdateById(id,name,mail,phone,nic);}


}
