package com.Samples;

import java.util.regex.Pattern;

public class UserValidater {
    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3}$";
    private static final String EMAIL_ADDRESS_PATTERN = "^[a-zA-Z0-9]*+([._-])?[a-zA-Z0-9]*@[a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2})*$";
    private static final String MOBILE_NO_PATTERN = "^[1-9]{2}[[:space:]]{1}[0-9]{10}$";
    private static final String PASSWORD_PATTERN = "^[A-Za-z0-9]*[@#$%^&*][0-9a-zA-Z]*$";

    public boolean validateFirstName(String firstname) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstname).matches();
    }

    public boolean validateLastName(String lastname) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lastname).matches();
    }

    public boolean validateEmailId(String email) {
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
        return pattern.matcher(email).matches();

    }

    public boolean validateMobileNo(String mobileno) {
        Pattern pattern = Pattern.compile(MOBILE_NO_PATTERN);
        return pattern.matcher(mobileno).matches();
    }

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();

    }
}
