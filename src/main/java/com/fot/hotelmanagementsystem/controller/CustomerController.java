package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.entity.Customer;
import com.fot.hotelmanagementsystem.service.CustomerService;
import com.fot.hotelmanagementsystem.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public ResponseEntity addCustomer(@RequestBody Customer dto) {
        Customer res = customerService.save(dto);
        if (res != null) {
            return new ResponseEntity(new StandardResponse("201", "Done", res), HttpStatus.CREATED);
        } else {
            return new ResponseEntity(new StandardResponse("500", "Error", null), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path = "/all")
    public ResponseEntity getAllCustomers() {
        return new ResponseEntity(new StandardResponse("200", "Done", customerService.findAll()), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity getCustomer(@PathVariable long id) {
        return new ResponseEntity(new StandardResponse("200", "Done", customerService.findById(id)), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity updateCustomer(@RequestBody Customer dto) {
        Customer res = customerService.update(dto);
        if (res != null) {
            return new ResponseEntity(new StandardResponse("200", "Done", res), HttpStatus.OK);
        } else {
            return new ResponseEntity(new StandardResponse("500", "Error", null), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity deleteCustomer(@PathVariable long id) {
        boolean res = customerService.delete(id);
        if (res) {
            return new ResponseEntity(new StandardResponse("200", "Done", res), HttpStatus.OK);
        } else {
            return new ResponseEntity(new StandardResponse("500", "Error", null), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
