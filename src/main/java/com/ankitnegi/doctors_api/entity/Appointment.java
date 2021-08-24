package com.ankitnegi.doctors_api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "APPOINTMENT")
public class Appointment
{
    @Id
    private String email;
    @Id
    private LocalDate datetime;
    private String comments;



}