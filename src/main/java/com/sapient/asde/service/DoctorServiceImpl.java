package com.sapient.asde.service;

import com.sapient.asde.dao.DoctorDAO;
import com.sapient.asde.dao.DoctorDaoImpl;
import com.sapient.asde.exception.HospitalManagementException;
import com.sapient.asde.model.Doctor;

import java.sql.SQLException;
import java.util.List;

public class DoctorServiceImpl implements DoctorService{
    private DoctorDAO doctorDAO = new DoctorDaoImpl();
    @Override
    public Doctor getDoctorById(Integer doctorId) throws HospitalManagementException {
        try{
            return  doctorDAO.getDoctorById(doctorId);
        }catch(SQLException e){
            //catching SQLException and converting EmployeeException
            throw new HospitalManagementException(e.getMessage(),e);
        }
    }

    @Override
    public List<Doctor> getAllDoctor() throws HospitalManagementException {
        try{
            return  doctorDAO.getAllDoctor();
        }catch(SQLException e){
            //catching SQLException and converting EmployeeException
            throw new HospitalManagementException(e.getMessage(),e);
        }
    }

    @Override
    public Integer addDoctor(Doctor doctor) throws HospitalManagementException {
        try{
            return  doctorDAO.addDoctor(doctor);
        }catch(SQLException e){
            //catching SQLException and converting EmployeeException
            throw new HospitalManagementException(e.getMessage(),e);
        }
    }

    @Override
    public Integer deleteDoctor(Integer doctorId) throws HospitalManagementException {
        try{
            return  doctorDAO.deleteDoctor(doctorId);
        }catch(SQLException e){
            //catching SQLException and converting EmployeeException
            throw new HospitalManagementException(e.getMessage(),e);
        }
    }

    @Override
    public Integer updateDoctor(Doctor doctor) throws HospitalManagementException {
        try{
            return  doctorDAO.updateDoctor(doctor);
        }catch(SQLException e){
            //catching SQLException and converting EmployeeException
            throw new HospitalManagementException(e.getMessage(),e);
        }
    }
}
