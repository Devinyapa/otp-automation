package com.example.otptestautomation.common;
public class DataEncryptor {

    public static String decryptData(final String encryptedData) {
        try {
            return AESEncrypt.decrypt(encryptedData);
        } catch (Exception ex) {
            return "";
        }
    }
}
