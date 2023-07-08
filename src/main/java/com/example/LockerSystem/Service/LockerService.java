package com.example.LockerSystem.Service;

import com.example.LockerSystem.Entities.Locker;
import org.springframework.stereotype.Service;

@Service
public interface LockerService {

    public void createLocker(Locker locker);
    public Locker getEmptyLocker();

    public void activateLocker(Locker locker, Integer order_id);

    public Locker findbyorderID(Integer orderID);

    public void markAvailable(Locker locker);
}
