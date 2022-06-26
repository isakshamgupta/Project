package com.sapient.asde.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoctorPatientTest {
    DoctorPatient doctorPatient;
    @BeforeEach
    void setUp() {
       doctorPatient = new DoctorPatient(9001,101,
               1001, LocalDate.parse("2022-06-20"));
    }

    @AfterEach
    void tearDown() {
        doctorPatient=null;
    }

    @Test
    void getDoctorPatientId() {
        assertEquals(9001, doctorPatient.getDoctorPatientId());
    }

    @Test
    void setDoctorPatientId() {
        doctorPatient.setDoctorPatientId(9002);
        assertEquals(9002, doctorPatient.getDoctorPatientId());
    }

    @Test
    void getDoctId() {
        assertEquals(101, doctorPatient.getDoctId());
    }

    @Test
    void setDoctId() {
        doctorPatient.setDoctId(102);
        assertEquals(102, doctorPatient.getDoctId());
    }

    @Test
    void getPatientId() {
        assertEquals(1001, doctorPatient.getPatientId());
    }

    @Test
    void setPatientId() {
        doctorPatient.setPatientId(1002);
        assertEquals(1002, doctorPatient.getPatientId());
    }

    @Test
    void getAppointmentDate() {
        assertEquals(LocalDate.parse("2022-06-20"), doctorPatient.getAppointmentDate());
    }

    @Test
    void setAppointmentDate() {
        doctorPatient.setAppointmentDate(LocalDate.parse("2022-06-25"));
        assertEquals(LocalDate.parse("2022-06-25"), doctorPatient.getAppointmentDate());
    }
}