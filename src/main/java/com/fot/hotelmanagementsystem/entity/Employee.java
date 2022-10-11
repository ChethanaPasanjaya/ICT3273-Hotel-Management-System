package com.fot.hotelmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private long id;

    @Column(name = "employee_name", nullable = false, length = 100)
    private String employeeName;

    @Column(name = "employee_address", nullable = false, length = 100)
    private String employeeAddress;

    @Column(name = "employee_mail", nullable = false, length = 50)
    private String employeeMail;

    @Column(name = "employee_password", nullable = false, length = 50)
    private String employeePassword;

    @Column(name = "employee_phone", nullable = false, length = 15)
    private String employeePhone;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "job_id", nullable = false)
    private JobRole job;

}
