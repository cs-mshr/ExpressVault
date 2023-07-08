package com.example.LockerSystem.Dao;

import com.example.LockerSystem.Entities.Locker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface lockerDao extends JpaRepository<Locker,Integer> {

    @Query(value = "SELECT * FROM locker WHERE is_available = true LIMIT 1",nativeQuery = true)
    public Locker findEmptylocker();

    @Query(value = "SELECT * FROM locker WHERE order_id = :orderID",nativeQuery = true)
    public Locker findbyorderID(Integer orderID);
}

