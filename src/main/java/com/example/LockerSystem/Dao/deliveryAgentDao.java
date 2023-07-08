package com.example.LockerSystem.Dao;

import com.example.LockerSystem.Entities.DeliveryAgent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface deliveryAgentDao extends JpaRepository<DeliveryAgent,Integer> {
}
