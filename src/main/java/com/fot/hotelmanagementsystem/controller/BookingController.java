package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.dto.BookingDTO;
import com.fot.hotelmanagementsystem.entity.Booking;
import com.fot.hotelmanagementsystem.service.BookingService;
import com.fot.hotelmanagementsystem.service.PoolService;
import com.fot.hotelmanagementsystem.util.StandardResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/book")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @Autowired
    PoolService poolService;

    @PostMapping
    public ResponseEntity addBooking(@RequestBody BookingDTO dto) {
        Booking res = bookingService.save(dto);
        if (res != null) {
            return new ResponseEntity(new StandardResponse("201", "Done", res), HttpStatus.CREATED);
        } else {
            return new ResponseEntity(new StandardResponse("500", "Error", null), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path = "/all")
    public ResponseEntity getAllBookings() {
        return new ResponseEntity(new StandardResponse("200", "Done", bookingService.findAll()), HttpStatus.OK);
    }

    @PostMapping(path = "/pool")
    public ResponseEntity addPoolBooking(@RequestBody PoolBookReq dto) {
        boolean res = poolService.poolBooking(dto.getId(), dto.getQty());
        if (res) {
            return new ResponseEntity(new StandardResponse("201", "Done", res), HttpStatus.CREATED);
        } else {
            return new ResponseEntity(new StandardResponse("500", "Error", null), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
@Data
@AllArgsConstructor
@NoArgsConstructor
class PoolBookReq{
    private String id;
    private int qty;
}
