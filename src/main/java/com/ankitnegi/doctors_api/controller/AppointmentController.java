package com.ankitnegi.doctors_api.controller;

import com.ankitnegi.doctors_api.appointment.AppointmentRequest;
import com.ankitnegi.doctors_api.entity.Patient;
import com.ankitnegi.doctors_api.repository.AppointmentRepository;
import com.ankitnegi.doctors_api.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentController {
    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private PatientRepository patientRepository;

    @PostMapping("/appointmentRequest")
    public Patient requestAppointment(@RequestBody AppointmentRequest request){
        return patientRepository.save(request.getPatient());
    }

    @GetMapping("/allAppointments")
    public List<Patient> findAllAppointments(){
        return patientRepository.findAll();
    }
}
