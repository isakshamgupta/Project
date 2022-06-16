package com.sapient.asde.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {
    Doctor doctor;

    @BeforeEach
    void setUp() {
        doctor = new Doctor(101, "Subhash", "MBBS", "Cardio", 10,
                14:00:00.000, 20:00:00.000, 9905768653L, "sub@gmail.com", "kalawati hospital", "sub2019");
    }

    @AfterEach
    void tearDown() {
        doctor = null;
    }

    @Test
    void getDoctId() {
        assertEquals(, doctor.getDoctId());
    }

    @Test
    void setDoctId() {
        doctor.setDoctId();
        assertEquals(, doctor.getDoctId());
    }

    @Test
    void getDoctorName() {
        assertEquals(, doctor.getDoctorName());
    }

    @Test
    void setDoctorName() {
        doctor.setDoctorName();
        assertEquals(, doctor.getDoctorName());
    }

    @Test
    void getQualification() {
        assertEquals(, doctor.getQualification());
    }

    @Test
    void setQualification() {
        doctor.setQualification();
        assertEquals(, doctor.getQualification());
    }

    @Test
    void getSpecialization() {
        assertEquals(, doctor.getSpecialization());
    }

    @Test
    void setSpecialization() {
        doctor.setSpecialization();
        assertEquals(, doctor.getSpecialization());
    }

    @Test
    void getExperience() {
        assertEquals(, doctor.getExperience());
    }

    @Test
    void setExperience() {
        doctor.setExperience();
        assertEquals(, doctor.getExperience());
    }

    @Test
    void getAvailableFrom() {
        assertEquals(, doctor.getAvailableFrom());
    }

    @Test
    void setAvailableFrom() {
        doctor.setAvailableFrom();
        assertEquals(, doctor.getAvailableFrom());
    }

    @Test
    void getAvailableTo() {
        assertEquals(, doctor.getAvailableTo());
    }

    @Test
    void setAvailableTo() {
        doctor.setAvailableTo();
        assertEquals(, doctor.getAvailableTo());
    }

    @Test
    void getMobile() {
        assertEquals(, doctor.getMobile());
    }

    @Test
    void setMobile() {
        doctor.setMobile();
        assertEquals(, doctor.getMobile());
    }

    @Test
    void getEmail() {
        assertEquals(, doctor.getEmail());
    }

    @Test
    void setEmail() {
        doctor.setEmail();
        assertEquals(, doctor.getEmail());
    }

    @Test
    void getHospitalDetails() {
        assertEquals(, doctor.getHospitalDetails());
    }

    @Test
    void setHospitalDetails() {
        doctor.setHospitalDetails();
        assertEquals(, doctor.getHospitalDetails());
    }

    @Test
    void getUsername() {
        assertEquals(, doctor.getUsername());
    }

    @Test
    void setUsername() {
        doctor.setUsername();
        assertEquals(, doctor.getUsername());
    }
}