package com.Samples;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {
    @Test
    public void givenFirstName_WhenProper_ReturnTrue() {
        UserValidater validater=new UserValidater();
        boolean result=validater.validateFirstName("Amit");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidater validater=new UserValidater();
        boolean result=validater.validateLastName("Kumar");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        UserValidater validater=new UserValidater();
        boolean result=validater.validateEmailId("amit@gmail.com");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenMobileNo_WhenProper_ShouldReturnTrue() {
        UserValidater validater=new UserValidater();
        boolean result=validater.validateMobileNo("91 8390202340");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserValidater validater=new UserValidater();
        boolean result=validater.validatePassword("Amit@123");
        Assert.assertEquals(true,result);
    }
}
