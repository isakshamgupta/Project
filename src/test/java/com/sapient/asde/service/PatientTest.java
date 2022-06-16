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
        patient = new Patient(1001,"Moshim","Male", LocalDate.parse("2000-12-27"),"B+",
                9905376532L,"Fatwah","mos@gmail.com","mos123");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPatientId() {
    }

    @Test
    void setPatientId() {
    }

    @Test
    void getPatientName() {
    }

    @Test
    void setPatientName() {
    }

    @Test
    void getGender() {
    }

    @Test
    void setGender() {
    }

    @Test
    void getBirthdate() {
    }

    @Test
    void setBirthdate() {
    }

    @Test
    void getBloodGroup() {
    }

    @Test
    void setBloodGroup() {
    }

    @Test
    void getMobile() {
    }

    @Test
    void setMobile() {
    }

    @Test
    void getAddress() {
    }

    @Test
    void setAddress() {
    }

    @Test
    void getEmail() {
    }

    @Test
    void setEmail() {
    }

    @Test
    void getUsername() {
    }

    @Test
    void setUsername() {
    }
}