package com.sapient.asde.exception;

public class HospitalManagementException extends Exception {
    public HospitalManagementException() {

        super("Hospital Management Exception");
    }

    public HospitalManagementException(String message) {
        super(message);
    }

    public HospitalManagementException(String message, Throwable cause) {

        super(message, cause);
    }
}