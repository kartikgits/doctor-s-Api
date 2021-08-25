package com.ankitnegi.doctors_api.service;

import com.ankitnegi.doctors_api.entity.Appointment;
import com.ankitnegi.doctors_api.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository repository;

    //for adding new appointments
    public Appointment saveAppointment(Appointment appointment )
    {
        return repository.save(appointment);
    }

    //to  get/fetch a list of all the appointments
    public List<Appointment> getAppointments()
    {
        return repository.findAll();
    }

}