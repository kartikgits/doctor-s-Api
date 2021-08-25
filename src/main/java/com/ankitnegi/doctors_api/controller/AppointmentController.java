package com.ankitnegi.doctors_api.controller;

import com.ankitnegi.doctors_api.appointment.AppointmentRequest;
import com.ankitnegi.doctors_api.entity.Appointment;
import com.ankitnegi.doctors_api.entity.Patient;
import com.ankitnegi.doctors_api.repository.AppointmentRepository;
import com.ankitnegi.doctors_api.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppointmentController {
    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private PatientRepository patientRepository;

    @PostMapping("/schedule/{email}")
    public Appointment requestAppointment(@PathVariable (value = "email") String email,
                                      @RequestBody Appointment appointment){
        if (patientRepository.findByEmail(email) != null){
            appointment.setEmail(email);
            appointmentRepository.save(appointment);
            return appointment;
        }
        return null;
    }

    @GetMapping("/schedule")
    public List<Appointment> findAllAppointments(){
        return appointmentRepository.findAll(Sort.by(Sort.Direction.ASC, "datetime"));
    }
}
