package com.example.otptestautomation.controller;

import com.example.otptestautomation.service.OtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/getOtp")
public class OtpController {

    @Autowired
    private OtpService otpService;

    @RequestMapping(method = RequestMethod.GET)
    public Optional<String> getLatestDecryptedOtp() {
        return otpService.getLatestDecryptedOtp();
    }

}
