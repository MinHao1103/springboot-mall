package com.minhao.springbootmall.util;

import org.springframework.util.DigestUtils;

public class Sha2 {

    public static String getSHA256(String password, Integer userId) {
        String newPassword = password + String.valueOf(userId);
        return org.apache.commons.codec.digest.DigestUtils.sha256Hex(newPassword);
    }
}
