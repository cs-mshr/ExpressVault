package com.example.LockerSystem.Service;

import com.example.LockerSystem.Entities.DeliveryAgent;
import org.springframework.stereotype.Service;

@Service
public interface DeliveryAgentService {
    public void createagent(DeliveryAgent deliveryAgent);
}
