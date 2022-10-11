package com.fot.hotelmanagementsystem.repo;

import com.fot.hotelmanagementsystem.entity.Pool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

public interface PoolRepo extends JpaRepository<Pool, Long> {

    @Query(value ="CALL pool_booking(?1,?2)",nativeQuery = true)
    void bookPool(String id, int qty);

    @Procedure("pool_booking")
    void book(String id, int qty);
}
