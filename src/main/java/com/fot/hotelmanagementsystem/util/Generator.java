package com.fot.hotelmanagementsystem.util;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Generator {
    private final Random RANDOM = new Random();
    private final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    /*private final int ITERATIONS = 10000;
    private final int KEY_LENGTH = 256;*/

    public String generateId(int length) {
        return generateRandomString(length);
    }

    private String generateRandomString(int length) {
        StringBuilder returnValue = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        return new String(returnValue);
    }
}
