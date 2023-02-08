package com.studentotp.Service;

import com.studentotp.Model.Otp;
import com.studentotp.Model.RegisterResponse;
import com.studentotp.Model.Student;
import com.studentotp.Model.StudentRequest;
import com.studentotp.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private OtpService otpService;

    public RegisterResponse createStudent(StudentRequest studentRequest){

        Student student = new Student();

        student.setFullName(studentRequest.getFullName());
        student.setAddress(studentRequest.getAddress());
        student.setMobileNumber(studentRequest.getMobileNumber());
        student.setPassword(studentRequest.getPassword());
        student.setVerifyStatus(false);
        studentRepo.save(student);

        Otp otp = otpService.generateOtp(student);

        return new RegisterResponse(student,otp.getStd_opt());
    }

}
