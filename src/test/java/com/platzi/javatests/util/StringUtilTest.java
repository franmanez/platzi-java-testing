package com.platzi.javatests.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void repeat_string_once(){
        assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_n_times(){
        assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative(){
        StringUtil.repeat("hola", -1);
    }
}
