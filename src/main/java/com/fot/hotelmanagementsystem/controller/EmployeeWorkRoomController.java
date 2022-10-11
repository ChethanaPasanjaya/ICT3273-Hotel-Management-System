package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.service.EmployeeWorkPoolServices;
import com.fot.hotelmanagementsystem.service.EmployeeWorkRoomServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/" +
        "")
public class EmployeeWorkRoomController {
    @Autowired
    EmployeeWorkRoomServices employeeWorkRoomServices;

    @GetMapping("/all/{id}")
    public List<Object[]> getEmployeeWorkRoom(@PathVariable Integer id) {
        return employeeWorkRoomServices.getEmployeeWorkRoom(id);
    }
}
