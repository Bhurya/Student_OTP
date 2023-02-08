package com.studentotp.Repository;

import com.studentotp.Model.Otp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OtpRepo extends JpaRepository<Otp,Long> {

}
