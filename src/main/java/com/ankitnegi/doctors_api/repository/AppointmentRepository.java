package com.ankitnegi.doctors_api.repository;

import com.ankitnegi.doctors_api.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, String> {
}