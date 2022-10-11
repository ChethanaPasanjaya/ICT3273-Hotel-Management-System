package com.fot.hotelmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "job_role")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id", nullable = false)
    private long id;

    @Column(name = "roles", nullable = false, length = 45)
    private String roles;

}
