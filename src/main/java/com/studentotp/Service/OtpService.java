package com.studentotp.Service;

import com.studentotp.Model.Otp;
import com.studentotp.Model.Student;
import com.studentotp.Repository.OtpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.Random;

@Service
public class OtpService {

    @Autowired
    private OtpRepo otpRepo;


    public Otp generateOtp(Student student){

        Otp  otp = new Otp();
        String generateOTP= new DecimalFormat("000000").format(new Random().nextInt(999999));

        otp.setStd_opt(generateOTP);
        otp.setStudentId(student);
        otpRepo.save(otp);
        return otp;
    }


}
