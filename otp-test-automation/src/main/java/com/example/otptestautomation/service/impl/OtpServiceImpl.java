package com.example.otptestautomation.service.impl;

import com.example.otptestautomation.entity.Otp;
import com.example.otptestautomation.repository.OtpRepository;
import com.example.otptestautomation.service.OtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OtpServiceImpl implements OtpService {

    @Autowired
    private OtpRepository otpRepository;
    public Optional<String> getLatestDecryptedOtp() {
        return Optional.ofNullable(otpRepository.findTopByOrderByIdDesc())
                .map(Otp::getDecryptedOtp);
    }
}
