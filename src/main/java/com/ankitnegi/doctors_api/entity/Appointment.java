package com.ankitnegi.doctors_api.entity;

import com.ankitnegi.doctors_api.keys.AppointmentId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(AppointmentId.class)
@Entity
public class Appointment implements Serializable
{
    @Id
    @Column(length = 200)
    private String email;

    @ManyToOne(cascade = CascadeType.ALL)
    private Patient patient;

    @Id
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date datetime;

    private String comments;

}