package com.sapient.asde.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {
    Doctor doctor;

    @BeforeEach
    void setUp() {
        doctor = new Doctor(101, "Subhash", "MBBS",
                "Cardio", 10,
                LocalTime.parse("08:00"), LocalTime.parse("16:00"),
                9905768653L, "sub@gmail.com", "kalawati hospital",
                "sub2019");
    }

    @AfterEach
    void tearDown() {
        doctor = null;
    }

    @Test
    void getDoctId() {
        assertEquals(101, doctor.getDoctId());
    }

    @Test
    void setDoctId() {
        doctor.setDoctId(100);
        assertEquals(100, doctor.getDoctId());
    }

    @Test
    void getDoctorName() {
        assertEquals("Subhash", doctor.getDoctorName());
    }

    @Test
    void setDoctorName() {
        doctor.setDoctorName("Sonu");
        assertEquals("Sonu", doctor.getDoctorName());
    }

    @Test
    void getQualification() {
        assertEquals("MBBS", doctor.getQualification());
    }

    @Test
    void setQualification() {
        doctor.setQualification("BDS");
        assertEquals("BDS", doctor.getQualification());
    }

    @Test
    void getSpecialization() {
        assertEquals("Cardio", doctor.getSpecialization());
    }

    @Test
    void setSpecialization() {
        doctor.setSpecialization("Bone");
        assertEquals("Bone", doctor.getSpecialization());
    }

    @Test
    void getExperience() {
        assertEquals(10, doctor.getExperience());
    }

    @Test
    void setExperience() {
        doctor.setExperience(15);
        assertEquals(15, doctor.getExperience());
    }

    @Test
    void getAvailableFrom() {
        assertEquals(LocalTime.parse("08:00"), doctor.getAvailableFrom());
    }

    @Test
    void setAvailableFrom() {
        doctor.setAvailableFrom(LocalTime.parse("10:00"));
        assertEquals(LocalTime.parse("10:00"), doctor.getAvailableFrom());
    }

    @Test
    void getAvailableTo() {
        assertEquals(LocalTime.parse("16:00"), doctor.getAvailableTo());
    }

    @Test
    void setAvailableTo() {
        doctor.setAvailableTo(LocalTime.parse("18:00"));
        assertEquals(LocalTime.parse("18:00"), doctor.getAvailableTo());
    }

    @Test
    void getMobile() {
        assertEquals(9905768653L, doctor.getMobile());
    }

    @Test
    void setMobile() {
        doctor.setMobile(8905768653L);
        assertEquals(8905768653L, doctor.getMobile());
    }

    @Test
    void getEmail() {
        assertEquals("sub@gmail.com", doctor.getEmail());
    }

    @Test
    void setEmail() {
        doctor.setEmail("suby@gmail.com");
        assertEquals("suby@gmail.com", doctor.getEmail());
    }

    @Test
    void getHospitalDetails() {
        assertEquals("kalawati hospital", doctor.getHospitalDetails());
    }

    @Test
    void setHospitalDetails() {
        doctor.setHospitalDetails("Heart hospital");
        assertEquals("Heart hospital", doctor.getHospitalDetails());
    }

    @Test
    void getUsername() {
        assertEquals("sub2019", doctor.getUsername());
    }

    @Test
    void setUsername() {
        doctor.setUsername("subh2019");
        assertEquals("subh2019", doctor.getUsername());
    }
}