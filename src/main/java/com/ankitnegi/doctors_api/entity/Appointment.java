package com.ankitnegi.doctors_api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Appointment
{
    @Id
    @Generated
    private int id;

    private String email;

    private LocalDateTime datetime;
    private String comments;

}