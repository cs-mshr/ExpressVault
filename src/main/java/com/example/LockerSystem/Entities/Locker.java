package com.example.LockerSystem.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data@NoArgsConstructor@AllArgsConstructor
public class Locker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer lockerId;
    private Integer orderId;

    private String location = "Your_colony";
    private boolean isAvailable;

    private LocalDateTime CreatedAT;
    private LocalDateTime UpdatedAT;


    public Locker(String location, boolean isAvailable) {
        this.location = location;
        this.isAvailable = isAvailable;
    }

//    @OneToOne
//    private Parcel parcel;
}
