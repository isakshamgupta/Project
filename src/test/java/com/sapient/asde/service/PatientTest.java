package com.sapient.asde.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {
    Patient patient;
    @BeforeEach
    void setUp() {
        patient = new Patient(1001,"Moshim","Male",
                LocalDate.parse("2000-12-27"),"B+",
                9905376532L,"Fatwah","mos@gmail.com","mos123");
    }

    @AfterEach
    void tearDown() {
        patient = null;
    }

    @Test
    void getPatientId() {
        assertEquals(1001, patient.getPatientId());
    }

    @Test
    void setPatientId() {
        patient.setPatientId(1002);
        assertEquals(1002, patient.getPatientId());
    }

    @Test
    void getPatientName() {
        assertEquals("Moshim", patient.getPatientName());
    }

    @Test
    void setPatientName() {
        patient.setPatientName("Anoop");
        assertEquals("Anoop", patient.getPatientName());
    }

    @Test
    void getGender() {
        assertEquals("Male", patient.getGender());
    }

    @Test
    void setGender() {
        patient.setGender("Female");
        assertEquals("Female", patient.getGender());
    }

    @Test
    void getBirthdate() {
        assertEquals(LocalDate.parse("2000-12-27"), patient.getBirthdate());
    }

    @Test
    void setBirthdate() {
        patient.setBirthdate(LocalDate.parse("2005-12-27"));
        assertEquals(LocalDate.parse("2005-12-27"), patient.getBirthdate());
    }

    @Test
    void getBloodGroup() {
        assertEquals("B+", patient.getBloodGroup());
    }

    @Test
    void setBloodGroup() {
        patient.setBloodGroup("O-");
        assertEquals("O-", patient.getBloodGroup());
    }

    @Test
    void getMobile() {
        assertEquals(9905376532L, patient.getMobile());
    }

    @Test
    void setMobile() {
        patient.setMobile(9234771252L);
        assertEquals(9234771252L, patient.getMobile());
    }

    @Test
    void getAddress() {
        assertEquals("Fatwah", patient.getAddress());
    }

    @Test
    void setAddress() {
        patient.setAddress("Patna");
        assertEquals("Patna", patient.getAddress());
    }

    @Test
    void getEmail() {
        assertEquals("mos@gmail.com", patient.getEmail());
    }

    @Test
    void setEmail() {
        patient.setEmail("somu@gmail.com");
        assertEquals("somu@gmail.com", patient.getEmail());
    }

    @Test
    void getUsername() {
        assertEquals("mos123", patient.getUsername());
    }

    @Test
    void setUsername() {
        patient.setUsername("moshim123");
        assertEquals("moshim123", patient.getUsername());
    }
}