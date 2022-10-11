package com.fot.hotelmanagementsystem.repo;

import com.fot.hotelmanagementsystem.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<Booking, Long> {

}
