package com.sapient.asde.mapper;

public interface DoctorQueryMapper {
    public static final String GET_DOCTOR_BY_ID="select * from doctor where doctor_id=?";
    public static final String GET_ALL_DOCTOR="select * from doctor";
    public static final String ADD_DOCTOR="insert into doctor values(?,?,?,?,?,?,?,?,?,?,?)";
    public static final String DELETE_DOCTOR="delete from employee where doctor_id=?";
    public static final String UPDATE_DOCTOR="update doctor set available_from=?,available_to=? where doctor_id=?";
}
