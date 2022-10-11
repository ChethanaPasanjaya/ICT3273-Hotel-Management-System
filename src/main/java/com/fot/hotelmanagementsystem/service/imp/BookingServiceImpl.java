package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.dto.BookingDTO;
import com.fot.hotelmanagementsystem.entity.Booking;
import com.fot.hotelmanagementsystem.entity.Customer;
import com.fot.hotelmanagementsystem.entity.RoomType;
import com.fot.hotelmanagementsystem.repo.BookingRepo;
import com.fot.hotelmanagementsystem.repo.CustomerRepo;
import com.fot.hotelmanagementsystem.repo.RoomTypeRepo;
import com.fot.hotelmanagementsystem.service.BookingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springfox.documentation.swagger2.mappers.ModelMapper;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
@Slf4j
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepo bookingRepo;

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    RoomTypeRepo roomTypeRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public Booking save(BookingDTO dto) {
        log.info("Finding customer with ID: {}", dto.getCustomerId());
        Customer customer = customerRepo.findById(dto.getCustomerId()).get();

        log.info("Finding room type with ID: {}", dto.getRoomTypeId());
        RoomType roomType = roomTypeRepo.findById(dto.getRoomTypeId()).get();

        Booking booking = new Booking(
                dto.getId(),
                customer,
                roomType,
                dto.getBookingDate(),
                dto.getPeriod(),
                dto.getRoomQty()
        );

        log.info("Saving booking with ID: {}", dto.getId());
        return bookingRepo.save(booking);
    }

    @Override
    public Booking update(BookingDTO dto) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public Booking findById(long id) {
        return null;
    }

    @Override
    public ArrayList<Booking> findAll() {
        log.info("Finding all bookings");
        return (ArrayList<Booking>) bookingRepo.findAll();
    }
}
