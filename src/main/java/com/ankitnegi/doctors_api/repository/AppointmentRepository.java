package com.ankitnegi.doctors_api.repository;

import com.ankitnegi.doctors_api.entity.Appointment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, String> {
    @Override
    List<Appointment> findAll();

    List<Appointment> findAll(Sort datetime);
}