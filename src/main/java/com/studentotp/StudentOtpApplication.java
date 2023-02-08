package com.studentotp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;
import java.util.Random;

@SpringBootApplication
@RestController
public class StudentOtpApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentOtpApplication.class, args);
	}

	String otp= new DecimalFormat("000000").format(new Random().nextInt(999999));

	@GetMapping("/otp")
	public String otpPrint(){
		return "Otp is - "+otp;
	}
}
