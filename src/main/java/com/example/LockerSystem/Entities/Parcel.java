package com.example.LockerSystem.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data@NoArgsConstructor@AllArgsConstructor
public class Parcel {

    @Id
    private Integer order_id;

    private Integer locker_id;
    private Integer user_id;
    private Integer agent_id;

    private LocalDateTime CreatedAT;
    private LocalDateTime UpdatedAT;

    public Parcel(Integer order_id, Integer user_id, Integer agent_id) {
        this.order_id = order_id;
        this.user_id = user_id;
        this.agent_id = agent_id;
    }
}
