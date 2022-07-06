package com.platzi.javatests.util;

import junit.framework.TestCase;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static com.platzi.javatests.util.PasswordUtil.SecurityLevel.STRONG;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class DateUtilShould {

    // All years divisible by 400 ARE Leap years (1600, 2000, 2400)
    // All years divisible by 100 but not by 400 are NOT leap years (1700, 1880, 1900),
    // All years divisible by 4 but not by 100 ARE 1eap years (1996, 2004, 2008),
    // All years not divisible by 4 are NOT Leap years (2017, 2018, 2019)

    @Test
    public void return_true_when_year_is_divisible_by_400(){
        assertThat(DateUtil.isLeapYear(1600), CoreMatchers.is(true));
        assertThat(DateUtil.isLeapYear(2000), CoreMatchers.is(true));
        assertThat(DateUtil.isLeapYear(2400), CoreMatchers.is(true));
    }

    @Test
    public void return_false_when_year_is_divisible_by_100_but_not_by_400(){
        assertThat(DateUtil.isLeapYear(1700), CoreMatchers.is(false));
        assertThat(DateUtil.isLeapYear(1800), CoreMatchers.is(false));
        assertThat(DateUtil.isLeapYear(1900), CoreMatchers.is(false));
    }

    @Test
    public void return_false_when_year_is_not_divisible_by_4(){
        assertThat(DateUtil.isLeapYear(2017), CoreMatchers.is(false));
        assertThat(DateUtil.isLeapYear(2018), CoreMatchers.is(false));
        assertThat(DateUtil.isLeapYear(2019), CoreMatchers.is(false));
    }

}
