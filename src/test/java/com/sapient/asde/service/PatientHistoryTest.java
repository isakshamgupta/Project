package com.sapient.asde.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PatientHistoryTest {
    PatientHistory patientHistory;
    @BeforeEach
    void setUp() {
            patientHistory = new PatientHistory(9001,"abhi", LocalDate.parse("2000-12-27"),
                    LocalDate.parse("2001-12-27"),"Patanjali","fever","high fever",
                    "normal",1003,103);
    }

    @AfterEach
    void tearDown() {
        patientHistory = null;
    }

    @Test
    void getPatientHistoryId() {
        assertEquals(9001, patientHistory.getPatientHistoryId());
    }

    @Test
    void setPatientHistoryId() {
        patientHistory.setPatientHistoryId(9002);
        assertEquals(9002, patientHistory.getPatientHistoryId());

    }

    @Test
    void getPatientName() {
        assertEquals("abhi", patientHistory.getPatientName());
    }

    @Test
    void setPatientName() {
        patientHistory.setPatientName("rohan");
        assertEquals("rohan", patientHistory.getPatientName());
    }

    @Test
    void getCaseOpeningDate() {
        assertEquals(LocalDate.parse("2000-12-27"), patientHistory.getCaseOpeningDate());
    }

    @Test
    void setCaseOpeningDate() {
        patientHistory.setCaseOpeningDate(LocalDate.parse("2012-12-27"));
        assertEquals(LocalDate.parse("2012-12-27"), patientHistory.getCaseOpeningDate());
    }

    @Test
    void getCaseClosingDate() {
        assertEquals(LocalDate.parse("2001-12-27"), patientHistory.getCaseClosingDate());
    }

    @Test
    void setCaseClosingDate() {
        patientHistory.setCaseClosingDate(LocalDate.parse("2007-12-27"));
        assertEquals(LocalDate.parse("2007-12-27"), patientHistory.getCaseClosingDate());
    }

    @Test
    void getHospitalDetails() {
        assertEquals("Patanjali", patientHistory.getHospitalDetails());
    }

    @Test
    void setHospitalDetails() {
        patientHistory.setHospitalDetails("Nirma");
        assertEquals("Nirma", patientHistory.getHospitalDetails());
    }

    @Test
    void getSymptoms() {
        assertEquals("fever", patientHistory.getSymptoms());
    }

    @Test
    void setSymptoms() {
        patientHistory.setSymptoms("cough");
        assertEquals("cough", patientHistory.getSymptoms());
    }

    @Test
    void getPrescription() {
        assertEquals("high fever", patientHistory.getPrescription());
    }

    @Test
    void setPrescription() {
        patientHistory.setPrescription("cold");
        assertEquals("cold", patientHistory.getPrescription());
    }


    @Test
    void getDiet() {
        assertEquals("normal", patientHistory.getDiet());
    }

    @Test
    void setDiet() {
        patientHistory.setDiet("veg");
        assertEquals("veg", patientHistory.getDiet());
    }

    @Test
    void getPatientId() {
        assertEquals(1003, patientHistory.getPatientId());
    }

    @Test
    void setPatientId() {
        patientHistory.setPatientId(1004);
        assertEquals(1004, patientHistory.getPatientId());
    }

    @Test
    void getDoctorId() {
        assertEquals(103, patientHistory.getDoctorId());
    }

    @Test
    void setDoctorId() {
        patientHistory.setDoctorId(104);
        assertEquals(104, patientHistory.getDoctorId());
    }
}