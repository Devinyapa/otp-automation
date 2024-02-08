package com.example.otptestautomation.common;

import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESEncrypt {

    private static final String algorithm = "AES";
    private static final byte[] keyValue = "ASecureSecretKey".getBytes();

    // Performs decryption
    public static String decrypt(String encryptedText) throws Exception {
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decodedValue = Base64.getDecoder().decode(encryptedText);
        byte[] decValue = cipher.doFinal(decodedValue);
        return new String(decValue);
    }

    // generateKey() is used to generate a secret key for AES algorithm
    private static Key generateKey() throws Exception {
        return new SecretKeySpec(keyValue, algorithm);
    }
}
