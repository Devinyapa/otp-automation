package com.example.otptestautomation.service;

import com.example.otptestautomation.entity.Otp;

import java.util.Optional;

public interface OtpService {
    Optional<String> getLatestDecryptedOtp();
}
