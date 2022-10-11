package com.fot.hotelmanagementsystem.repo;

import com.fot.hotelmanagementsystem.entity.AllTransaction;
import com.fot.hotelmanagementsystem.entity.returns.AnnualProfit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface AllTransactionRepo extends JpaRepository<AllTransaction, Long> {

    @Query(value = "call hotel_1.annual_profit();",nativeQuery = true)
    List<Object[]> getAnnualAmount();

    @Query(value = "{CALL bill5(?1,?2)}",nativeQuery = true)
    AllTransaction getBill(long customerId, LocalDate date);

    @Query(value = "{CALL annual_profit_sum()}",nativeQuery = true)
    double getAnnualProfitSum();

    @Query(value = "call hotel_1.annual_paid();",nativeQuery = true)
    List<Object[]> getAnnualPaidAmount();

    @Query(value = "call hotel_1.annual_not_paid();\n",nativeQuery = true)
    List<Object[]>  getAnnualNotPaidAmount();


    @Query(value = "call hotel_1.monthly_profit();\n",nativeQuery = true)
    List<Object[]> getMonthlyProfitAmount();

    @Query(value = "call hotel_1.monthly_paid();\n",nativeQuery = true)
    List<Object[]> getMonthlyPaidAmount();

    @Query(value = "call hotel_1.monthly_not_paid();\n",nativeQuery = true)
    List<Object[]> getMonthlyNotPaidAmount();

    @Query(value = "call hotel_1.today_profit();\n",nativeQuery = true)
    List<Object[]> getTodayProfitAmount();

    @Query(value = "call hotel_1.today_paid();\n",nativeQuery = true)
    List<Object[]> getTodayPaidAmount();

    @Query(value = "call hotel_1.today_not_paid();\n",nativeQuery = true)
    List<Object[]> getTodayNotPaidAmount();

    @Query(value = "call hotel_1.annual_profit_sum();\n",nativeQuery = true)
    List<Object[]> getAnnualSum();

    @Query(value = "call hotel_1.monthly_profit_sum();\n",nativeQuery = true)
    List<Object[]> getMonthlyProfitSum();

    @Query(value = "call hotel_1.daily_profit_sum();\n",nativeQuery = true)
    List<Object[]> getDailyProfitSum();

    @Query(value = "call hotel_1.bill(:id,:today);",nativeQuery = true)
    List<Object[]> getTransactionById(Integer id,Date today);

    @Query(value = "call hotel_1.showOrder(:id);",nativeQuery = true)
    List<Object[]> getOrderById(Integer id);

    @Query(value = "call hotel_1.customer_update(:id,:name,:mail,:phone,:nic);",nativeQuery = true)
    List<Object[]> putCustomerUpdateById(Integer id, String name, String mail, String phone, String nic);
}
