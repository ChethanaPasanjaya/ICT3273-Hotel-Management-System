package com.fot.hotelmanagementsystem.repo;

import com.fot.hotelmanagementsystem.entity.EmployeeRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRoomRepo extends JpaRepository<EmployeeRoom, Long> {

    @Query(value = "call hotel_1.employee_work_room(:id);\n",nativeQuery = true)
    List<Object[]> getEmployeeWorkRoom(Integer id);
}
