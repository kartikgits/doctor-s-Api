package com.ankitnegi.doctors_api.appointment;

import com.ankitnegi.doctors_api.entity.Patient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AppointmentRequest {
    private Patient patient;
}
