package com.fot.hotelmanagementsystem.repo;

import com.fot.hotelmanagementsystem.entity.RoomNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomNumberRepo extends JpaRepository<RoomNumber, String> {
}
