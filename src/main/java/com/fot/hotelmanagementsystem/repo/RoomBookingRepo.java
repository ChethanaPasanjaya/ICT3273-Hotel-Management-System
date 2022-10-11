package com.fot.hotelmanagementsystem.repo;

import com.fot.hotelmanagementsystem.entity.RoomBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoomBookingRepo extends JpaRepository<RoomBooking, Long> {

    @Query(value = "call hotel_1.view_room_booking();",nativeQuery = true)
    List<Object[]> getViewRoomBooking();
}
