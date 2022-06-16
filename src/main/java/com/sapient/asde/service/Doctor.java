package com.sapient.asde.service;

import java.time.LocalTime;

public class Doctor {
    private Integer doctId;
    private String doctorName;
    private String qualification;
    private String specialization;
    private Integer experience;  // in years
    private LocalTime availableFrom;
    private LocalTime availableTo;
    private Long mobile;
    private String email;
    private String hospitalDetails;
    private String username;

    public Doctor(){

    }

    public Doctor(Integer doctId, String doctorName, String qualification, String specialization, Integer experience, LocalTime availableFrom, LocalTime availableTo, Long mobile, String email, String hospitalDetails, String username) {
        this.doctId = doctId;
        this.doctorName = doctorName;
        this.qualification = qualification;
        this.specialization = specialization;
        this.experience = experience;
        this.availableFrom = availableFrom;
        this.availableTo = availableTo;
        this.mobile = mobile;
        this.email = email;
        this.hospitalDetails = hospitalDetails;
        this.username = username;
    }

    public Integer getDoctId() {
        return doctId;
    }

    public void setDoctId(Integer doctId) {
        this.doctId = doctId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public LocalTime getAvailableFrom() {
        return availableFrom;
    }

    public void setAvailableFrom(LocalTime availableFrom) {
        this.availableFrom = availableFrom;
    }

    public LocalTime getAvailableTo() {
        return availableTo;
    }

    public void setAvailableTo(LocalTime availableTo) {
        this.availableTo = availableTo;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHospitalDetails() {
        return hospitalDetails;
    }

    public void setHospitalDetails(String hospitalDetails) {
        this.hospitalDetails = hospitalDetails;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctId=" + doctId +
                ", doctorName='" + doctorName + '\'' +
                ", qualification='" + qualification + '\'' +
                ", specialization='" + specialization + '\'' +
                ", experience=" + experience +
                ", availableFrom=" + availableFrom +
                ", availableTo=" + availableTo +
                ", mobile=" + mobile +
                ", email='" + email + '\'' +
                ", hospitalDetails='" + hospitalDetails + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}





