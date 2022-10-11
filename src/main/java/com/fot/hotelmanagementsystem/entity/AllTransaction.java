package com.fot.hotelmanagementsystem.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "all_transaction")
public class AllTransaction {
    @Id
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Column(name = "employee_id", nullable = false)
    private Integer employee;

    @NotNull
    @Column(name = "customer_id", nullable = false)
    private Integer customerId;

    @Size(max = 100)
    @NotNull
    @Column(name = "customer_name", nullable = false, length = 100)
    private String customerName;

    @Size(max = 45)
    @NotNull
    @Column(name = "transaction_type", nullable = false, length = 45)
    private String transactionType;

    @NotNull
    @Column(name = "amount", nullable = false)
    private Double amount;

    @NotNull
    @Column(name = "paid", nullable = false)
    private Byte paid;

    @NotNull
    @Column(name = "pay_date", nullable = false)
    private LocalDate payDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployee() {
        return employee;
    }

    public void setEmployee(Integer employee) {
        this.employee = employee;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Byte getPaid() {
        return paid;
    }

    public void setPaid(Byte paid) {
        this.paid = paid;
    }

    public LocalDate getPayDate() {
        return payDate;
    }

    public void setPayDate(LocalDate payDate) {
        this.payDate = payDate;
    }

}