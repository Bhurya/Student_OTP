package com.studentotp.Controller;

import com.studentotp.Model.RegisterResponse;
import com.studentotp.Model.StudentRequest;
import com.studentotp.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/createStudent")
    public ResponseEntity<RegisterResponse> createStudent(@RequestBody StudentRequest studentRequest){

        RegisterResponse registerResponse = studentService.createStudent(studentRequest);
        return  new ResponseEntity<>(registerResponse, HttpStatus.CREATED);

    }

}
