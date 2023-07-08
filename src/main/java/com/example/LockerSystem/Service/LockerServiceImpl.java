package com.example.LockerSystem.Service;

import com.example.LockerSystem.Dao.lockerDao;
import com.example.LockerSystem.Entities.Locker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LockerServiceImpl implements LockerService{

    @Autowired
    private lockerDao dao;

    public LockerServiceImpl() {}

    @Override
    public void createLocker(Locker locker) {
        dao.save(locker);
    }

    @Override
    public Locker getEmptyLocker() {
        return dao.findEmptylocker();
    }

    @Override
    public void activateLocker(Locker locker, Integer order_id) {
        locker.setAvailable(false);
        locker.setOrderId(order_id);
        dao.save(locker);
    }

    @Override
    public Locker findbyorderID(Integer orderID) {
        return dao.findbyorderID(orderID);
    }

    @Override
    public void markAvailable(Locker locker) {
        locker.setAvailable(true);
        dao.save(locker);
    }
}
