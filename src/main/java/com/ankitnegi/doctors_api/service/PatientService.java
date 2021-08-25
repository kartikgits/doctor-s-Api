package com.ankitnegi.doctors_api.service;

import com.ankitnegi.doctors_api.entity.Patient;
import com.ankitnegi.doctors_api.repository.AppointmentRepository;
import com.ankitnegi.doctors_api.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository repository;

    @Autowired
    private AppointmentRepository appointmentRepository;

    //for adding new patients
    public Patient savePatient(Patient patient )
    {
        return repository.save(patient);
    }

    //for updating patient info
    public Patient updatePatient(Patient patient)
    {
        Patient existingPatient = repository.findByEmail(patient.getEmail());
        if(existingPatient != null){
            existingPatient.setName(patient.getName());
            existingPatient.setAddress(patient.getAddress());
            existingPatient.setPhoneNumber(patient.getPhoneNumber());
            existingPatient.setPassword(patient.getPassword());
        }else{
            return null;
        }
        return repository.save(existingPatient);
    }

    //to delete patient info
    public String deletePatient(String email) {
        repository.deleteById(email);
        return "Removed";
    }

    //to  get/fetch a list of all the patients
    public List<Patient> getPatients()
    {
        return repository.findAll();
    }

}