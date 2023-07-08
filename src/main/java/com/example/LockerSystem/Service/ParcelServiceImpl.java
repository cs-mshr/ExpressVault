package com.example.LockerSystem.Service;

import com.example.LockerSystem.Dao.parcelDao;
import com.example.LockerSystem.Entities.Parcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParcelServiceImpl implements ParcelService{

    @Autowired
    private parcelDao dao;

    @Override
    public void createParcel(Parcel parcel) {
        dao.save(parcel);
    }
}
