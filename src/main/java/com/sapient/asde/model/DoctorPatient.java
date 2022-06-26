package com.sapient.asde.model;

import java.time.LocalDate;

public class DoctorPatient {
    private Integer doctorPatientId;
    private Integer doctorId;
    private Integer patientId;
    private LocalDate appointmentDate;

    public DoctorPatient(){

    }

    public DoctorPatient(Integer doctorPatientId, Integer doctorId, Integer patientId, LocalDate appointmentDate) {
        this.doctorPatientId = doctorPatientId;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.appointmentDate = appointmentDate;
    }

    public Integer getDoctorPatientId() {
        return doctorPatientId;
    }

    public void setDoctorPatientId(Integer doctorPatientId) {
        this.doctorPatientId = doctorPatientId;
    }

    public Integer getdoctorId() {
        return doctorId;
    }

    public void setdoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String toString() {
        return "DoctorPatient{" +
                "doctorPatientId=" + doctorPatientId +
                ", doctorId=" + doctorId +
                ", patientId=" + patientId +
                ", appointmentDate=" + appointmentDate +
                '}';
    }
}
