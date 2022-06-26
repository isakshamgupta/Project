package com.sapient.asde.service;

import com.sapient.asde.exception.HospitalManagementException;
import com.sapient.asde.model.Doctor;

import java.util.List;

public interface DoctorService {
    public abstract Doctor getDoctorById(Integer doctorId) throws HospitalManagementException;
    public abstract List<Doctor> getAllDoctor() throws  HospitalManagementException;
    public abstract Integer addDoctor(Doctor doctor) throws HospitalManagementException;
    public abstract Integer deleteDoctor(Integer doctorId) throws HospitalManagementException;
    public abstract Integer updateDoctor(Doctor doctor ) throws HospitalManagementException;
}
