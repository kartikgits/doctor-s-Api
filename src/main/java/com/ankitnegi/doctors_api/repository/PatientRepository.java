package com.ankitnegi.doctors_api.repository;

import com.ankitnegi.doctors_api.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, String> {
    Patient findByEmail(String email);

//    default String deleteByEmail(String email) {
//        if (deleteById(email);)deleteById(email);
//    }
}