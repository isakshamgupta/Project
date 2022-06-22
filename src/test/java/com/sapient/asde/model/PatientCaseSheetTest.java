package com.sapient.asde.model;

import com.sapient.asde.model.PatientCaseSheet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PatientCaseSheetTest {
    PatientCaseSheet patientCaseSheet;
    @BeforeEach
    void setUp() {
        patientCaseSheet = new PatientCaseSheet(10001,"Shubham", LocalDate.parse("2000-12-27"),
                LocalDate.parse("2000-12-27"),"Fine","Dr Lal Paths","cough",
                "fever","normal",1001,101);
    }

    @AfterEach
    void tearDown() {
        patientCaseSheet =  null;
    }

    @Test
    void getPatientCaseId() {
        assertEquals(10001, patientCaseSheet.getPatientCaseId());
    }

    @Test
    void setPatientCaseId() {
        patientCaseSheet.setPatientCaseId(10002);
        assertEquals(10002, patientCaseSheet.getPatientCaseId());
    }

    @Test
    void getPatientName() {
        assertEquals("Shubham", patientCaseSheet.getPatientName());
    }

    @Test
    void setPatientName() {
        patientCaseSheet.setPatientName("Rajesh");
        assertEquals("Rajesh", patientCaseSheet.getPatientName());
    }

    @Test
    void getCaseOpeningDate() {
        assertEquals(LocalDate.parse("2000-12-27"), patientCaseSheet.getCaseOpeningDate());
    }

    @Test
    void setCaseOpeningDate() {
        patientCaseSheet.setCaseOpeningDate(LocalDate.parse("2000-12-28"));
        assertEquals(LocalDate.parse("2000-12-28"), patientCaseSheet.getCaseOpeningDate());
    }

    @Test
    void getCaseClosingDate() {
        assertEquals(LocalDate.parse("2000-12-27"), patientCaseSheet.getCaseOpeningDate());
    }

    @Test
    void setCaseClosingDate() {
        patientCaseSheet.setCaseClosingDate(LocalDate.parse("2007-12-27"));
        assertEquals(LocalDate.parse("2007-12-27"), patientCaseSheet.getCaseClosingDate());
    }

    @Test
    void getStatus() {
        assertEquals("Fine", patientCaseSheet.getStatus());
    }

    @Test
    void setStatus() {
        patientCaseSheet.setStatus("normal");
        assertEquals("normal", patientCaseSheet.getStatus());
        }

    @Test
    void getHospitalDetails() {
        assertEquals("Dr Lal Paths", patientCaseSheet.getHospitalDetails());
    }

    @Test
    void setHospitalDetails() {
        patientCaseSheet.setHospitalDetails("Ram narayan hospital");
        assertEquals("Ram narayan hospital", patientCaseSheet.getHospitalDetails());
    }

    @Test
    void getSymptoms() {
        assertEquals("cough", patientCaseSheet.getSymptoms());
    }

    @Test
    void setSymptoms() {
        patientCaseSheet.setSymptoms("pain");
        assertEquals("pain", patientCaseSheet.getSymptoms());
    }

    @Test
    void getPrescription() {
        assertEquals("fever", patientCaseSheet.getPrescription());
    }

    @Test
    void setPrescription() {
        patientCaseSheet.setPrescription("cold");
        assertEquals("cold", patientCaseSheet.getPrescription());
    }

    @Test
    void getDiet() {
        assertEquals("normal", patientCaseSheet.getDiet());
    }

    @Test
    void setDiet() {
        patientCaseSheet.setDiet("Healthy");
        assertEquals("Healthy", patientCaseSheet.getDiet());
    }

    @Test
    void getPatientId() {
        assertEquals(1001, patientCaseSheet.getPatientId());
    }

    @Test
    void setPatientId() {
        patientCaseSheet.setPatientId(1002);
        assertEquals(1002, patientCaseSheet.getPatientId());
    }

    @Test
    void getDoctorId() {
        assertEquals(101, patientCaseSheet.getDoctorId());
    }

    @Test
    void setDoctorId() {
        patientCaseSheet.setDoctorId(102);
        assertEquals(102, patientCaseSheet.getDoctorId());
    }
}
