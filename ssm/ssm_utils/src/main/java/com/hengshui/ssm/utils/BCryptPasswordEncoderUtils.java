package com.hengshui.ssm.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderUtils {
    public static void main(String[] args) {
        String password = "tom";
        String encodePassword = encodePassword(password);
        System.out.println("加密后的密码是:"+encodePassword);
    }


    public static String encodePassword(String password){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder.encode(password);
    }
}
