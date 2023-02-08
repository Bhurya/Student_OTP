package com.studentotp.Model;

import lombok.Data;

@Data
public class StudentRequest {

    private String fullName;

    private String address;

    private String mobileNumber;

    private String password;
}
