package com.sapient.asde.service;

import java.time.LocalDate;

public class Patient {
    private Integer patientId;
    private String patientName;
    private String gender;
    private LocalDate birthdate;
    private String bloodGroup;
    private Long mobile;
    private String address;
    private String email;
    private String username;


    public Patient(){

    }

    public Patient(Integer patientId, String patientName, String gender, LocalDate birthdate, String bloodGroup, Long mobile, String address, String email, String username) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.gender = gender;
        this.birthdate = birthdate;
        this.bloodGroup = bloodGroup;
        this.mobile = mobile;
        this.address = address;
        this.email = email;
        this.username = username;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthdate=" + birthdate +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", mobile=" + mobile +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
