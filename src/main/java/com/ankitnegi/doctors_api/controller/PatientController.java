package com.ankitnegi.doctors_api.controller;

import com.ankitnegi.doctors_api.entity.Patient;
import com.ankitnegi.doctors_api.repository.PatientRepository;
import com.ankitnegi.doctors_api.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientService service;

    @Autowired
    private PatientRepository patientRepository;

    // for adding patient
    @PostMapping("/patients")
    public Patient addPatient(@RequestBody Patient patient) {
        if (patientRepository.findByEmail(patient.getEmail()) != null){
            return null;
        }
        return service.savePatient(patient);
    }

    //for getting or fetching all patient record
    @GetMapping("/patients")
    public List<Patient> findAllPatients() {
        return service.getPatients();
    }

    //for update
    @PutMapping("/patients")
    public Patient updatePatient(@RequestBody Patient patient) {
        return service.updatePatient(patient);
    }

    //For deletion of patient record
    @DeleteMapping("/patients/{email}")
    public String deletePatient(@PathVariable String email) {
        return service.deletePatient(email);
    }

}