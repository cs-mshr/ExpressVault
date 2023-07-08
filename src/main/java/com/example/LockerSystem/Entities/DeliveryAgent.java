package com.example.LockerSystem.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@Entity
@Data@NoArgsConstructor@AllArgsConstructor
public class DeliveryAgent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer agent_id;
    private String name;

    @Column(unique = true)
    private String phone;

    @Column(unique = true)
    private String email;

    private LocalDateTime CreatedAT;
    private LocalDateTime UpdatedAT;

//    @OneToMany(mappedBy = "deliveryAgent")
//    private List<Parcel> orders;


    public DeliveryAgent(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}
