package com.example.LockerSystem.Dao;

import com.example.LockerSystem.Entities.Parcel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface parcelDao extends JpaRepository<Parcel,Integer> {
}
