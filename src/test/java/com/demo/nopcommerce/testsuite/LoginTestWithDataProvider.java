package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.resources.testdata.TestData;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
 * Ravi's Creation
 * Date of Creation
 */

public class LoginTestWithDataProvider extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(groups = {"Regression"})
    public void setUp() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test (priority = 0,groups = {"Regression","smoke","sanity"},dataProvider = "LoginCredentials", dataProviderClass = TestData.class)
    public void doLogin(String username,String password){
        homePage.clickOnLoginLink();
        loginPage.loginToApplication(username,password);
    }

}
