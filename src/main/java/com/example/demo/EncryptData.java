package com.example.demo;

import org.json.JSONObject;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EncryptData {

    public static String encrypt(String merchantApiKey, JSONObject authObj) {
        try
        {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(1, new SecretKeySpec(merchantApiKey.getBytes("UTF-8"), "AES"), new IvParameterSpec(merchantApiKey.getBytes("UTF-8")));
            byte[] encrypted = cipher.doFinal(authObj.toString().getBytes());
            return java.util.Base64.getEncoder().encodeToString(encrypted);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
