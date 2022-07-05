package com.platzi.javatests.util;

public class StringUtil {

    public static String repeat(String str, int times) {
        if(times < 0) throw new IllegalArgumentException("negative value is not allowed");
        return str.repeat(times);
    }
}
