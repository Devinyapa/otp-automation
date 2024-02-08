package com.example.otptestautomation.repository;

import com.example.otptestautomation.entity.Otp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OtpRepository extends JpaRepository <Otp, Long> {
    Otp findTopByOrderByIdDesc();
}
