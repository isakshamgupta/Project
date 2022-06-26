package com.sapient.asde.dao;
import com.sapient.asde.model.Doctor;
import java.sql.SQLException;
import java.util.List;

/*
CRUD(Create Read Update Delete)
*/
public interface DoctorDAO {
    public abstract Doctor getDoctorById(Integer doctorId) throws SQLException;
    public abstract List<Doctor> getAllDoctor() throws  SQLException;
    public abstract Integer addDoctor(Doctor doctor) throws SQLException;
    public abstract Integer deleteDoctor(Integer doctorId) throws SQLException;
    public abstract Integer updateDoctor(Doctor doctor ) throws SQLException;
}
