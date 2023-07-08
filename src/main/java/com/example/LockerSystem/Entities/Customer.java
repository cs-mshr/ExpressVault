package com.example.LockerSystem.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data@NoArgsConstructor@AllArgsConstructor
public class Customer {
    @Id
    private Integer user_id;
    private String name;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private Integer phoneNo;

    private LocalDateTime CreatedAT;
    private LocalDateTime UpdatedAT;
}
