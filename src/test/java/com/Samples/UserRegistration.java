package com.Samples;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistration {
    private final String inputEmail;
    private final Boolean expectedResult;
    private UserValidater validater;

    @Before
    public void initislizer() {
        validater = new UserValidater();
    }

    @Test
    public void givenFirstName_WhenProper_ReturnTrue() {
        boolean result = validater.validateFirstName("Amit");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = validater.validateLastName("Kumar");
        Assert.assertEquals(true, result);
    }

    public UserRegistration(String inputEmail,Boolean expectedResult) {
        this.inputEmail = inputEmail;
        this.expectedResult =expectedResult;
    }

    @Parameterized.Parameters
    public static Collection email_With_ExpectedOutput() {
        return Arrays.asList(new Object[][]  {  {"abc@yahoo.com", true},
                {"abc-100@yahoo.com",true},
                { "abc.100@yahoo.com",true},
                {"abc111@abc.com",true},
                {"abc-100@abc.com",true},
                {"abc-100@abc.com.au",true},
                {"abc@1.com",true},
                {"abc@gmail.com.com",true},
                {"abc.@gmail.com.au.au",false},
                {"abc@gmail.com.1a",false},
                {"abc@abc@gmail.com",false}});
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        System.out.println("email id is : " +inputEmail);
        Assert.assertEquals(expectedResult, validater.validateEmailId(inputEmail));
    }

    @Test
    public void givenMobileNo_WhenProper_ShouldReturnTrue() {
        boolean result = validater.validateMobileNo("91 8390202340");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean result = validater.validatePassword("Amit@123");
        Assert.assertEquals(true, result);
    }
}
