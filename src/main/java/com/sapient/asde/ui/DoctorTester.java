package com.sapient.asde.ui;

import com.sapient.asde.exception.HospitalManagementException;
import com.sapient.asde.model.Doctor;
import com.sapient.asde.service.DoctorService;
import com.sapient.asde.service.DoctorServiceImpl;
import org.apache.log4j.Logger;

import java.time.LocalTime;
import java.util.List;


public class DoctorTester {
    private static DoctorService doctorService= new DoctorServiceImpl();
    private  static Logger logger= Logger.getLogger(DoctorTester.class);

    public static void main(String[] args) {
        //Adding doctor
        try{
            Doctor doctor1= new Doctor(1003,"radhika","MBBS","heart surgeon",5, LocalTime.of(15,06,01),LocalTime.of(19,10,20),
                    7382456456L,"radhika@gmail.com","rainbow","radhika");

            Integer doctorid= doctorService.addDoctor(doctor1);
            if(doctorid==null){
                logger.warn("Unable to add doctor");
            }else {
                System.out.println(doctorid + " added to database");
            }
        }catch(HospitalManagementException e){
            logger.error(e.getMessage(),e);
        }

        // Displaying all doctors
        try{
            List<Doctor> doctorList= doctorService.getAllDoctor();
            doctorList.stream().forEach(System.out::println);
            logger.info("Listing all doctors");
        }catch(HospitalManagementException e){
            logger.error(e.getMessage(),e);
        }


    }
}
