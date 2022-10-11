package com.fot.hotelmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employee_room")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_room_id", nullable = false)
    private long id;

    @Column(name = "employee_id", nullable = false)
    private int employeeId;

    @Column(name = "room_no", nullable = false)
    private int roomNo;

    @Column(name = "date", nullable = false)
    private LocalDate date;

}
