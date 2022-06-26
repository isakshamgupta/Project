package com.sapient.asde.dao;
import com.sapient.asde.model.Doctor;
import com.sapient.asde.mapper.DoctorQueryMapper;
import org.apache.log4j.Logger;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DoctorDaoImpl implements DoctorDAO {
    private Logger logger = Logger.getLogger(DoctorDaoImpl.class);

    @Override
    public Doctor getDoctorById(Integer doctorid) throws SQLException {
        try(
                Connection connection= PostgresConnection.getConnection();
                PreparedStatement preparedStatement=connection.prepareStatement(DoctorQueryMapper.GET_DOCTOR_BY_ID);
        ){
            preparedStatement.setInt(1,doctorid);
            ResultSet resultSet= preparedStatement.executeQuery();
            if(resultSet.next()){

                //Employee employee= new Employee(<parameters>);

                Doctor doctor= Doctor.builder().doctorId(resultSet.getInt("doctor_id"))
                        .doctorName(resultSet.getString("doctor_name"))
                        .specialization(resultSet.getString("specialization"))
                        //convert java.sql.Date to java.time.LocalDate, use toLocalDate()
                        .availableFrom(resultSet.getTime("available_from").toLocalTime())
                        .availableTo(resultSet.getTime("available_to").toLocalTime())
                        .hospitalDetails(resultSet.getString("hospital_attached_to"))
                        .qualification(resultSet.getString("qualification"))
                        .experience(resultSet.getInt("experience_in_years"))
                        .mobile(resultSet.getLong("mobile"))
                        .email(resultSet.getString("email"))
                        .username(resultSet.getString("username"))
                        . build();
                return doctor;
            }
            logger.info("Invalid doctor_id");
            return null;

        }catch(SQLException e){
            logger.error(e.getMessage(),e);
            throw e;
        }

    }

    @Override
    public List<Doctor> getAllDoctor() throws SQLException {
        try(
                Connection connection= PostgresConnection.getConnection();
                Statement statement= connection.createStatement();
        ){
            ResultSet resultSet= statement.executeQuery(DoctorQueryMapper.GET_ALL_DOCTOR);
            List<Doctor> doctorList= new ArrayList<>();
            while(resultSet.next()){
                Doctor doctor= Doctor.builder().doctorId(resultSet.getInt("doctor_id"))
                        .doctorName(resultSet.getString("doctor_name"))
                        .specialization(resultSet.getString("specialization"))
                        //convert java.sql.Date to java.time.LocalDate, use toLocalDate()
                        .availableFrom(resultSet.getTime("available_from").toLocalTime())
                        .availableTo(resultSet.getTime("available_to").toLocalTime())
                        .hospitalDetails(resultSet.getString("hospital_attached_to"))
                        .qualification(resultSet.getString("qualification"))
                        .experience(resultSet.getInt("experience_in_years"))
                        .mobile(resultSet.getLong("mobile"))
                        .email(resultSet.getString("email"))
                        .username(resultSet.getString("username"))
                        . build();
                doctorList.add(doctor);
            }
            return doctorList;

        }catch(SQLException e){
            logger.error(e.getMessage(),e);
            throw e;
        }

    }

    @Override
    public Integer addDoctor(Doctor doctor) throws SQLException {
        try(
                Connection connection= PostgresConnection.getConnection();
                PreparedStatement preparedStatement= connection.prepareStatement(DoctorQueryMapper.ADD_DOCTOR);
        ) {
            preparedStatement.setInt(1,doctor.getdoctorId());
            preparedStatement.setString(2, doctor.getDoctorName());
            preparedStatement.setString(3, doctor.getSpecialization());
            //java.time.LocalDate to java.sql.Date
            preparedStatement.setTime(4, Time.valueOf(doctor.getAvailableFrom()));
            preparedStatement.setTime(5, Time.valueOf(doctor.getAvailableTo()));
            preparedStatement.setString(6,doctor.getHospitalDetails());
            preparedStatement.setString(7,doctor.getQualification());
            preparedStatement.setInt(8,doctor.getExperience());
            preparedStatement.setLong(9,doctor.getMobile());
            preparedStatement.setString(10,doctor.getEmail());
            preparedStatement.setString(11,doctor.getUsername());
            // Same method, preparedStatement.executeUpdate() is used for sql insert/update/delete
            int n= preparedStatement.executeUpdate();
            if(n>0){
                return doctor.getdoctorId();
            }
            logger.info("Unable to insert employee");
            return null;

        }catch (SQLException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }

    }

    @Override
    public Integer deleteDoctor(Integer doctorid) throws SQLException {
        try(
                Connection connection= PostgresConnection.getConnection();
                PreparedStatement preparedStatement= connection.prepareStatement(DoctorQueryMapper.DELETE_DOCTOR);
        ) {
            preparedStatement.setInt(1,doctorid);

            // Same method, preparedStatement.executeUpdate() is used for sql insert/update/delete
            int n= preparedStatement.executeUpdate();
            if(n>0){
                return doctorid;
            }
            logger.info("Unable to delete doctor, doctorId may be invalid");
            return null;

        }catch (SQLException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }
    }

    @Override
    public Integer updateDoctor(Doctor doctor) throws SQLException {
        try(
                Connection connection= PostgresConnection.getConnection();
                PreparedStatement preparedStatement= connection.prepareStatement(DoctorQueryMapper.UPDATE_DOCTOR);
        ) {

            preparedStatement.setTime(4, Time.valueOf(doctor.getAvailableFrom()));
            preparedStatement.setTime(5, Time.valueOf(doctor.getAvailableTo()));

            // Same method, preparedStatement.executeUpdate() is used for sql insert/update/delete
            int n= preparedStatement.executeUpdate();
            if(n>0){
                return doctor.getdoctorId();
            }
            logger.info("Unable to update employee");
            return null;

        }catch (SQLException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }

    }
}
