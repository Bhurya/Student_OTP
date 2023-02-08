package com.studentotp.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "std_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long studentId;

    private String fullName;

    private String address;

    private String mobileNumber;

    private boolean verifyStatus;

    private String password;

    /*@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "Otp")

    private Set<Otp> otps = new HashSet<>();*/
}
