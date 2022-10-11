package com.fot.hotelmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "room_type")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id", nullable = false)
    private long id;

    @Column(name = "image")
    private byte[] image;

    @Column(name = "variety", nullable = false, length = 25)
    private String variety;

    @Column(name = "qty", nullable = false)
    private int qty;

    @Column(name = "price", nullable = false)
    private double price;

}
