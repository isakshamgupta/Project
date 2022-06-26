package com.sapient.asde.model;

import java.time.LocalDate;

public class DoctorPatient {
    private Integer doctorPatientId;
    private Integer doctId;
    private Integer patientId;
    private LocalDate appointmentDate;

    public DoctorPatient(){

    }

    public DoctorPatient(Integer doctorPatientId, Integer doctId, Integer patientId, LocalDate appointmentDate) {
        this.doctorPatientId = doctorPatientId;
        this.doctId = doctId;
        this.patientId = patientId;
        this.appointmentDate = appointmentDate;
    }

    public Integer getDoctorPatientId() {
        return doctorPatientId;
    }

    public void setDoctorPatientId(Integer doctorPatientId) {
        this.doctorPatientId = doctorPatientId;
    }

    public Integer getDoctId() {
        return doctId;
    }

    public void setDoctId(Integer doctId) {
        this.doctId = doctId;
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
                ", doctId=" + doctId +
                ", patientId=" + patientId +
                ", appointmentDate=" + appointmentDate +
                '}';
    }
}
