package com.demo.nopcommerce.resources.testdata;

import org.testng.annotations.DataProvider;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class TestData {

    // annotations data provider
    @DataProvider(name = "LoginCredentials")
    public Object[][] getLoginData() {
        return new Object[][]{
                {"abc@gmail.com", "test123"},
        };
    }
    @DataProvider(name = "RegistrationCredential")
    public Object[][] getRegistrationData() {
        return new Object[][]{{ "Lucky", "mak", "1", "May", "1980", "Test", "test123"}
        };
    }
}
