package com.sapient.asde.model;

import java.time.LocalDate;

public class PatientCaseSheet {
    private Integer patientCaseId ;
    private String patientName ;
    private LocalDate caseOpeningDate;
    private LocalDate caseClosingDate;
    private String status;// open or close
    private String hospitalDetails;
    private String symptoms ;
    private String prescription;
    private String diet ;
    private Integer patientId ;
    private Integer doctorId  ;

    public PatientCaseSheet(){

    }
    public PatientCaseSheet(Integer patientCaseId, String patientName, LocalDate caseOpeningDate, LocalDate caseClosingDate, String status, String hospitalDetails, String symptoms, String prescription, String diet, Integer patientId, Integer doctorId) {
        this.patientCaseId = patientCaseId;
        this.patientName = patientName;
        this.caseOpeningDate = caseOpeningDate;
        this.caseClosingDate = caseClosingDate;
        this.status = status;
        this.hospitalDetails = hospitalDetails;
        this.symptoms = symptoms;
        this.prescription = prescription;
        this.diet = diet;
        this.patientId = patientId;
        this.doctorId = doctorId;
    }

    public Integer getPatientCaseId() {
        return patientCaseId;
    }

    public void setPatientCaseId(Integer patientCaseId) {
        this.patientCaseId = patientCaseId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public LocalDate getCaseOpeningDate() {
        return caseOpeningDate;
    }

    public void setCaseOpeningDate(LocalDate caseOpeningDate) {
        this.caseOpeningDate = caseOpeningDate;
    }

    public LocalDate getCaseClosingDate() {
        return caseClosingDate;
    }

    public void setCaseClosingDate(LocalDate caseClosingDate) {
        this.caseClosingDate = caseClosingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHospitalDetails() {
        return hospitalDetails;
    }

    public void setHospitalDetails(String hospitalDetails) {
        this.hospitalDetails = hospitalDetails;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    @Override
    public String toString() {
        return "PatientCaseSheet{" +
                "patientCaseId=" + patientCaseId +
                ", patientName='" + patientName + '\'' +
                ", caseOpeningDate=" + caseOpeningDate +
                ", caseClosingDate=" + caseClosingDate +
                ", status='" + status + '\'' +
                ", hospitalDetails='" + hospitalDetails + '\'' +
                ", symptoms='" + symptoms + '\'' +
                ", prescription='" + prescription + '\'' +
                ", diet='" + diet + '\'' +
                ", patientId=" + patientId +
                ", doctorId=" + doctorId +
                '}';
    }
}
