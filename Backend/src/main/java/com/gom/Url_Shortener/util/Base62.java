package com.gom.Url_Shortener.util;

public class Base62 {

    private static final String ALPHABET = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int BASE = ALPHABET.length();

    public static String encode(long value) {
        if (value == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (value > 0) {
            sb.insert(0, ALPHABET.charAt((int) (value % BASE)));
            value /= BASE;
        }
        return sb.toString();
    }

    public static long decode(String encoded) {
        long value = 0;
        for (char c : encoded.toCharArray()) {
            value = value * BASE + ALPHABET.indexOf(c);
        }
        return value;
    }
}
