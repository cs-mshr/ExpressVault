package com.example.LockerSystem.Dao;

import com.example.LockerSystem.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerDao extends JpaRepository<Customer,Integer> {
}
