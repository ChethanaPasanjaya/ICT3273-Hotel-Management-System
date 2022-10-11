package com.fot.hotelmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "room_numbers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomNumber {
    @Id
    @Column(name = "room_number", nullable = false, length = 10)
    private String id;

    @Column(name = "booked", nullable = false)
    private int booked;

    @Column(name = "type_id", length = 45)
    private String typeId;

}
