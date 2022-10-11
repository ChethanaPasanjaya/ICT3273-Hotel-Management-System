package com.fot.hotelmanagementsystem.repo;

import com.fot.hotelmanagementsystem.entity.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoomTypeRepo extends JpaRepository<RoomType, Long> {
    @Query(value = "call hotel_1.view_room_details();",nativeQuery = true)
    List<Object[]> getViewRoom();
}
