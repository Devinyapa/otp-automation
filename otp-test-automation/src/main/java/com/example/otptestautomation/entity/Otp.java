package com.example.otptestautomation.entity;

import com.example.otptestautomation.common.DataEncryptor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Calendar;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bank_setting_otp")
public class Otp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /* specify the setting Name. */
    @Column(name = "session_id")
    private String sessionId;

    /* specify the setting Value. */
    @Column(name = "user_name")
    @NotNull
    private String userName;

    /* specify the setting Value type. */
    @Column(name = "otp")
    @NotNull
    private String otp;

    /* specify the modified By. */
    @Column(name = "otp_module")
    @NotNull
    private String otpModule;

    /* specify the modified By. */
    @Column(name = "reg_channel")
    private String regChannel;

    /* specify the modified By. */
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "expire_time")
    private Calendar expireTime;

    /* specify the modified At. */
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_time", insertable = false)
    private Calendar dateTime;

    @Column(name = "status")
    private String status;

    /* specify the setting Value. */
    @Column(name = "user_mobile_no")
    private String userMobile;

    public String getDecryptedOtp() {
        return DataEncryptor.decryptData(otp);
    }


}



