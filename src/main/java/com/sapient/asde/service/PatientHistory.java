package com.sapient.asde.service;

import java.time.LocalDate;

public class PatientHistory {
    private Integer patientHistoryId;
    private String patientName ;
    private LocalDate caseOpeningDate;
    private LocalDate caseClosingDate;
    private String hospitalDetails;
    private String symptoms ;
    private String prescription;
    private String diet ;
    private Integer patientId ;
    private Integer doctorId  ;

    public PatientHistory(){

    }

    public PatientHistory(Integer patientHistoryId, String patientName, LocalDate caseOpeningDate, LocalDate caseClosingDate, String hospitalDetails, String symptoms, String prescription, String diet, Integer patientId, Integer doctorId) {
        this.patientHistoryId = patientHistoryId;
        this.patientName = patientName;
        this.caseOpeningDate = caseOpeningDate;
        this.caseClosingDate = caseClosingDate;
        this.hospitalDetails = hospitalDetails;
        this.symptoms = symptoms;
        this.prescription = prescription;
        this.diet = diet;
        this.patientId = patientId;
        this.doctorId = doctorId;
    }

    public Integer getPatientHistoryId() {
        return patientHistoryId;
    }

    public void setPatientHistoryId(Integer patientHistoryId) {
        this.patientHistoryId = patientHistoryId;
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
        return "PatientHistory{" +
                "patientHistoryId=" + patientHistoryId +
                ", patientName='" + patientName + '\'' +
                ", caseOpeningDate=" + caseOpeningDate +
                ", caseClosingDate=" + caseClosingDate +
                ", hospitalDetails='" + hospitalDetails + '\'' +
                ", symptoms='" + symptoms + '\'' +
                ", prescription='" + prescription + '\'' +
                ", diet='" + diet + '\'' +
                ", patientId=" + patientId +
                ", doctorId=" + doctorId +
                '}';
    }
}
