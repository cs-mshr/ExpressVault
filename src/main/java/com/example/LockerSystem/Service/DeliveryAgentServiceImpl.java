package com.example.LockerSystem.Service;

import com.example.LockerSystem.Dao.deliveryAgentDao;
import com.example.LockerSystem.Entities.DeliveryAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryAgentServiceImpl implements DeliveryAgentService{

    @Autowired
    private deliveryAgentDao dao;


    @Override
    public void createagent(DeliveryAgent deliveryAgent) {
        dao.save(deliveryAgent);
    }
}
